package in.personalFitness.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import in.personalFitness.entity.Trainer;
import in.personalFitness.entity.User;
import in.personalFitness.service.TrainerService;
@Controller
public class TrainerController {
	
	@Autowired
	private TrainerService trainerService;
	
	@GetMapping("trainer/addtrainer")
	public String saveTrainer(@ModelAttribute("signup") @Valid Model model, @RequestBody Trainer trainer) {
		return "trainer";		
	}

	@GetMapping("/gettrainer/{id}")
	public String getTrainer(@PathVariable("id") int trainerId) {
		return "trainer";		
	}

	@PutMapping("/updatetrainer/{id}")
	public String updateTrainer(@PathVariable("id") int trainerId, @RequestBody Trainer trainer) {
		return "trainer";		
	}
}
