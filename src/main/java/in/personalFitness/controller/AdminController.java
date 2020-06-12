package in.personalFitness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import in.personalFitness.service.AppointmentService;
import in.personalFitness.service.SkillsService;
import in.personalFitness.service.TrainerService;
import in.personalFitness.service.UserService;

@Controller
public class AdminController {
	@Autowired
	private UserService userService;
	@Autowired
	private SkillsService skillService;
	@Autowired
	private TrainerService trainerService;
	@Autowired
	private AppointmentService appointmentService;
	
	@GetMapping("/admin/listusers")
	public String listUsers(Model theModel) {
		return "listuser";
	}
	@GetMapping("/admin/listskill")
	public String listSkills(Model theModel) {
		return "listskill";
	}

	@GetMapping("/admin/deleteuser")
	public String deleteUser(@PathVariable("id") int userId) {
		return "redirect:/admin/listuser";
	}

	@GetMapping("/admin/deletetrainer")
	public String deleteTrainer(@PathVariable("id") int trainerId) {
		return "redirect:/admin/list";
	}

	@GetMapping("/admin/deleteskill")
	public String deleteSkill(@PathVariable("id") int skillId) {
		return "redirect:/admin/listskill";
	}

	@GetMapping("/admin/appointments")
	public String listAppointments(Model model) {
		return "listappointment";
	}
}
