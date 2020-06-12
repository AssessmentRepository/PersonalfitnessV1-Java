package in.personalFitness.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.personalFitness.dao.TrainerDao;
import in.personalFitness.entity.Trainer;

@Service("TrainerService")
@Transactional
public class TrainerServiceImpl implements TrainerService {

	@Override
	public boolean createTrainer(Trainer trainer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Trainer getTrainer(int trainerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trainer> listAllTrainers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateTrainer(int trainerId, Trainer trainer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteTrainer(int trainerId) {
		// TODO Auto-generated method stub
		return false;
	}
}
