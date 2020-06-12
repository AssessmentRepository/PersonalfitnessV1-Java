package in.personalFitness.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.personalFitness.dao.UserDao;
import in.personalFitness.entity.User;

@Service("LoginService")
@Transactional
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private UserDao userDao;
	
	public boolean register(User user) {
		return false;
	}

	public boolean login(String userName, String password) {
		return false;
	}
	
	public boolean resetPassword(String userName, String password) {
		return false;
	}
}
