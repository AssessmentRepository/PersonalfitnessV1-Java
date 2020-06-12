package in.personalFitness.service;

import java.util.List;

import in.personalFitness.entity.Skill;

public interface SkillsService {
	boolean createSkill(Skill  skill);
	Skill getSkill(int skillId);
	List<Skill> listAllSkills();
	boolean updateSkill(int skillId,Skill skill);
	boolean deleteSkill(int skillId);	
}
