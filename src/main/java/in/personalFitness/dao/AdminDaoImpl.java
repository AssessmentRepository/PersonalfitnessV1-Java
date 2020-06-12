package in.personalFitness.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.personalFitness.entity.Appointment;
import in.personalFitness.entity.Skill;
import in.personalFitness.entity.Trainer;
import in.personalFitness.entity.User;

@Repository
@Transactional
public class AdminDaoImpl implements AdminDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Appointment> listAllAppointments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteSkill(Skill skills) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteTrainer(Trainer trainer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(User trainer) {
		// TODO Auto-generated method stub
		return false;
	}


}
