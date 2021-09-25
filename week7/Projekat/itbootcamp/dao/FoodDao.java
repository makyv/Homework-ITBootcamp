package rs.itbootcamp.dao;

import rs.itbootcamp.model.FoodModel;

import java.sql.SQLException;
import java.util.List;

public interface FoodDao {
    void add(FoodModel fm);
    void addToMeal(int meal_id, int food_id, double mass);
    void addToFridge(int fridge_id, int food_id, double mass);
    void delete(int id) throws SQLException;
    void update(FoodModel fm) throws SQLException;
    FoodModel getFood(int id);
    List<FoodModel> getAllFood();
}

