package in.personalFitness.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.personalFitness.entity.Trainer;

@Repository
@Transactional
public class TrainerDaoImpl implements TrainerDao {
	
	@Autowired
	private SessionFactory sessionFactory;

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
