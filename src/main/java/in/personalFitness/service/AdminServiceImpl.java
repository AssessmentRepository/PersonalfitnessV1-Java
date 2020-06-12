package in.personalFitness.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.personalFitness.dao.AdminDao;
import in.personalFitness.entity.Appointment;
import in.personalFitness.entity.Skill;
import in.personalFitness.entity.Trainer;
import in.personalFitness.entity.User;

@Service("AdminService")
@Transactional
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;

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
