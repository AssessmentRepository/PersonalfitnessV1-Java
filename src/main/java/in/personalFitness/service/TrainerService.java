package in.personalFitness.service;

import java.util.List;

import in.personalFitness.entity.Trainer;

public interface TrainerService {
	boolean createTrainer(Trainer  trainer);
	Trainer getTrainer(int trainerId);
	List<Trainer> listAllTrainers();
	boolean updateTrainer(int trainerId,Trainer trainer);
	boolean deleteTrainer(int trainerId);	
}
