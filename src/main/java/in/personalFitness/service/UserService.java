package in.personalFitness.service;

import java.util.List;

import in.personalFitness.entity.Appointment;
import in.personalFitness.entity.Skill;
import in.personalFitness.entity.Trainer;
import in.personalFitness.entity.User;

public interface UserService {
	boolean createUser(User user);
	User getUser(int userId);
	List<User> listAllUsers();
	boolean updateUser(int userId,User user);
	boolean deleteUser(int userId);
	
	Trainer getTrainer(int trainerId);
	Appointment getAppointment(int tdId, String startTime, String endTime);		
	
	Skill getSkill(int skillId);
}
