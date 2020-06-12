package in.personalFitness.service;

import in.personalFitness.entity.User;

public interface LoginService {
	boolean register(User user);
	boolean login(String userName,String password);
	boolean resetPassword(String userName,String password);
}
