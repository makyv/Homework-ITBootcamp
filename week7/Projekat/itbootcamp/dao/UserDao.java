package rs.itbootcamp.dao;

import rs.itbootcamp.model.UserModel;

public interface UserDao{
    void add(UserModel user);
    void delete(int id);
    void update(UserModel user);
    UserModel getUser(int id);
    void addMealGrade(int userId, int mealId, int grade);
    boolean login(String entry, String password);
}
