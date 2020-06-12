package in.personalFitness.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import in.personalFitness.entity.Skill;
import in.personalFitness.service.SkillsService;
@Controller
public class SkillsController {
	
	@Autowired
	private SkillsService skillService;
	
	@GetMapping("/skill")
	public String Hello(Model theModel) {
		return "Hi Skill...";
	}
	
	@GetMapping("/addskill")
	public String saveSkill(@RequestBody Skill skill) {
		return "skill";		
	}

	@GetMapping("/updateskill/{id}")
	public String updateSkill(@PathVariable("id") int id, @RequestBody Skill skill) {
		return "skill";		
	}
}
