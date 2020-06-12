package in.personalFitness.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.personalFitness.entity.Appointment;
import in.personalFitness.entity.Skill;
import in.personalFitness.entity.User;
import in.personalFitness.service.AppointmentService;
import in.personalFitness.service.SkillsService;
import in.personalFitness.service.UserService;

@Controller("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private SkillsService skillsService;
	@Autowired
	private AppointmentService appointmentService;

	@Autowired
	MessageSource messageSource;
	//test controller api
	@RequestMapping(value = { "/hi" }, method = RequestMethod.GET)
	public String testApi(ModelMap model) {
		return "ok";
	}
	
	@GetMapping(value = "/signup")
	public String saveUser(@ModelAttribute("signup") @Valid @RequestBody User user, Model model) {
		return "signup";
	}
	
	@GetMapping("/getuser/{id}")
	public String getUserById(@PathVariable("id") int userId) {
		return "login";
	}

	@GetMapping("/updateuser/{id}")
	public String updateUserById(@PathVariable("id") int userId) {
		return "userform";
	}
	
	@GetMapping("/getskill/{id}")
	public String getSkill(@PathVariable("id") int skillId) {
		return "skill";		
	}
	
	@GetMapping("/postaddappointment")
	public String saveAppointment(@ModelAttribute("addappointment") @Valid @RequestBody Appointment appointment, Model model) {
		return "appointment";		
	}
	
	@GetMapping("/getappointment/{id}")
	public String getAppointment(@PathVariable("id") int tdId) {
		return "appointment";		
	}

	@GetMapping("/updateappointment/{id}")
	public String updateAppointment(@PathVariable("id") int tdid, @RequestBody Appointment appointment) {
		return "appointment";		
	}
}
