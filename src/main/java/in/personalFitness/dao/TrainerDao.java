package in.personalFitness.dao;

import in.personalFitness.entity.Trainer;

public interface TrainerDao {
	boolean createTrainer(Trainer  trainer);
	Trainer getTrainer(int trainerId);
	boolean updateTrainer(int trainerId,Trainer trainer);
	boolean deleteTrainer(int trainerId);	
}
