package rs.itbootcamp.dao;

import rs.itbootcamp.model.UserModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static rs.itbootcamp.dao.FoodDaoSQL.conn;

public class UserDaoSQL implements UserDao{

    @Override
    public void add(UserModel user) {
        try {
            PreparedStatement st = conn.prepareStatement("insert into users " +
                    "values (?, ?, ?, ?, ?)");
            st.setInt(1,user.getUserId());
            st.setString(2, user.getUserName());
            st.setString(3, user.getEmail());
            st.setString(4, user.getPassword());
            st.setBoolean(5, user.isAdmin());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement st = conn.prepareStatement("delete from users " +
                    "where user_id = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(UserModel user) {
        try {
            PreparedStatement st = conn.prepareStatement("update users set user_id = ?, username = ?, \n" +
                    "email = ?, user_password = ?, user_admin = ?");
            st.setInt(1, user.getUserId());
            st.setString(2, user.getUserName());
            st.setString(3, user.getEmail());
            st.setString(4, user.getPassword());
            st.setBoolean(5, user.isAdmin());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public UserModel getUser(int id) {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from users where user_id = " + id);
            if(rs.next()) {
                return new UserModel(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getBoolean(5));
            }else{
                System.out.println("No results");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addMealGrade(int userId, int mealId, int grade) {
        try {
            PreparedStatement st = conn.prepareStatement("insert into usermeal " +
                    "where user_id = ?, meal_id = ?, grade = ?");
            st.setInt(1, userId);
            st.setInt(2, mealId);
            st.setInt(3, grade);
            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean login(String entry, String password) {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select user_password " +
                    "from users where username = '" + entry + "'or email = '" + entry + "'");  // ' za entry
            return rs.next() && rs.getString(1).equals(password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


}
