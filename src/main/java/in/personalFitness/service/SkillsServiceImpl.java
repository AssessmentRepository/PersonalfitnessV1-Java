package in.personalFitness.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.personalFitness.dao.SkillsDao;
import in.personalFitness.entity.Skill;

@Service("SkillsService")
@Transactional
public class SkillsServiceImpl implements SkillsService {
	@Autowired
	private SkillsDao skillsDao;

	@Override
	public boolean createSkill(Skill skill) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Skill getSkill(int skillId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Skill> listAllSkills() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateSkill(int skillId, Skill skill) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteSkill(int skillId) {
		// TODO Auto-generated method stub
		return false;
	}

}
