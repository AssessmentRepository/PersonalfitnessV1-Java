package in.personalFitness.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.personalFitness.entity.Skill;

@Repository
@Transactional
public class SkillsDaoImpl implements SkillsDao {
	
	@Autowired
	private SessionFactory sessionFactory;

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
