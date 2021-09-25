package rs.itbootcamp.dao;

import rs.itbootcamp.model.FoodModel;
import rs.itbootcamp.model.FridgeModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static rs.itbootcamp.dao.FoodDaoSQL.conn;

public class FridgeDaoSQL implements FridgeDao{
    @Override
    public void add(FridgeModel f) {
        try {
            PreparedStatement st = conn.prepareStatement("insert into fridge" +
                    " values(?, ?");
            st.setInt(1,f.getFridgeId());
            st.setInt(2, f.getUserId());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement st = conn.prepareStatement("delete from fridge " +
                    "where fridge_id = ?");
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(FridgeModel f) {
        try {
            PreparedStatement st = conn.prepareStatement("update fridge" +
                    "set fridge_id = ?, user_id = ?");
            st.setInt(1, f.getFridgeId());
            st.setInt(2, f.getUserId());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<FoodModel> getAllFood(int fridge_id) {
        List<FoodModel> fm = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * " +
                    "from food f join fridgefood ff on f.food_id = ff.food_id " +
                    "where fridge_id = ?");
            while(rs.next()) {
                FoodModel newFood = new FoodModel(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getDouble(4),
                        rs.getDouble(5),
                        rs.getDouble(6));
                fm.add(newFood);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return fm;
    }
}
