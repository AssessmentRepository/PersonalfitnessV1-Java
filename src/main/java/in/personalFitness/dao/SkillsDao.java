package in.personalFitness.dao;

import in.personalFitness.entity.Skill;

public interface SkillsDao {
	boolean createSkill(Skill  skill);
	Skill getSkill(int skillId);
	boolean updateSkill(int skillId,Skill skill);
	boolean deleteSkill(int skillId);	
}
