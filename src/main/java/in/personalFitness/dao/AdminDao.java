package in.personalFitness.dao;

import java.util.List;

import in.personalFitness.entity.Appointment;
import in.personalFitness.entity.Skill;
import in.personalFitness.entity.Trainer;
import in.personalFitness.entity.User;

public interface AdminDao {
	List<Appointment> listAllAppointments();	
	boolean deleteAppointment(Appointment appointment);		
	boolean deleteSkill(Skill skills);
	boolean deleteTrainer(Trainer trainer);
	boolean deleteUser(User trainer);	
}
