package rs.itbootcamp.dao;

import rs.itbootcamp.model.FoodModel;
import rs.itbootcamp.model.MealModel;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static rs.itbootcamp.dao.FoodDaoSQL.conn;

public class MealDaoSQL implements MealDao {
    @Override
    public void insert(MealModel mm) {
        try {
            PreparedStatement st = conn.prepareStatement("insert into meal " +
                    "values (?, ?, ?, ?)");
            st.setInt(1, mm.getMealId());
            st.setString(2, mm.getMealName());
            st.setString(3, mm.getMealDesc());
            st.setString(4, mm.getMealDifficulty());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement st = conn.prepareStatement("delete from meal " +
                    "where meal_id = " + id);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(MealModel mm) {
        try {
            PreparedStatement st = conn.prepareStatement("update meal " +
                    "set meal_id = ?," +
                    " meal_name = ?," +
                    " meal_desc = ?," +
                    " meal_difficulty = ? ");
            st.setInt(1, mm.getMealId());
            st.setString(2, mm.getMealName());
            st.setString(3, mm.getMealDesc());
            st.setString(4, mm.getMealDifficulty());
            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public MealModel getMeal(int id) {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from meal" +
                    " where meal_id = " + id);
            if (rs.next())
                return new MealModel(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<MealModel> getAllMeals() {
        List<MealModel> allMeals = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from meal");
            while (rs.next()) {
                MealModel newMeal = new MealModel(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
                allMeals.add(newMeal);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return allMeals;
    }


    @Override
    public List<String> getFoodMealNames(int meal_id) {
        List<String> foodMeal = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select f.food_name " +
                    "from food f join mealfood mf on f.food_id = mf.food_id" +
                    "where meal_id = " + meal_id);
            while(rs.next())
                foodMeal.add(rs.getString(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return foodMeal;
    }

    @Override
    public List<FoodModel> getFoodMeal(int meal_id) {
        List<FoodModel> foodMeal = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * " +
                    "from food f join mealfood mf on f.food_id = mf.food_id" +
                    "where meal_id = " + meal_id);
            while (rs.next())
                foodMeal.add(new FoodModel(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getDouble(4),
                        rs.getDouble(5),
                        rs.getDouble(6)));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return foodMeal;
    }
}
