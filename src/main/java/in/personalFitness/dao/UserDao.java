package in.personalFitness.dao;

import in.personalFitness.entity.User;

public interface UserDao {
	boolean createUser(User user);
	User getUser(int userId);
	boolean updateUser(int userId,User user);
	boolean deleteUser(int userId);	
}
