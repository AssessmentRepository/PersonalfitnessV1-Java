package in.personalFitness.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.personalFitness.dao.UserDao;
import in.personalFitness.entity.Appointment;
import in.personalFitness.entity.Skill;
import in.personalFitness.entity.Trainer;
import in.personalFitness.entity.User;

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public boolean createUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> listAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUser(int userId, User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Trainer getTrainer(int trainerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment getAppointment(int tdId, String startTime, String endTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Skill getSkill(int skillId) {
		// TODO Auto-generated method stub
		return null;
	}

}
