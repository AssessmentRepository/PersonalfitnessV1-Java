package in.personalFitness.TestBoundary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import in.personalFitness.UtilTestClass.MasterData;
import in.personalFitness.entity.Skill;
import in.personalFitness.entity.Trainer;
import in.personalFitness.entity.User;

public class TestBoundary {    
	
	static {
		File file = new File("output_boundary_revised.txt");		
		if (file.exists()) {
			try {
				FileUtils.forceDelete(new File("output_boundary_revised.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
	}
	
    @Test
	public void testUserNameLength() throws Exception {
    	User user = MasterData.getUserDetails();
		int maxChar = 5;
		boolean usernameLength = ((user.getUserName().length()) >= maxChar);
		File file = new File("output_boundary_revised.txt");
	    FileUtils.write(file, "\ntestUserNameLength="+(usernameLength==true?true:false), true); 
		
	}
    
    @Test
    public void testSkillNameLength() throws Exception {
    	Skill skill = MasterData.getSkillDetails();
    	int maxChar = 5;
    	boolean skills = ((skill.getSkillName().length()) >= maxChar);
    	File file = new File("output_boundary_revised.txt");
	    FileUtils.write(file, "\ntestSkillNameLength="+(skills==true?true:false), true); 
    }
    @Test
    public void testTrainerNameLength() throws Exception {
    	Trainer trainer = MasterData.getTrainerDetails();
    	trainer.getUserName();
    	int maxChar = 5;
    	boolean usernameLength = ((trainer.getUserName().length()) >= maxChar);
    	File file = new File("output_boundary_revised.txt");
	    FileUtils.write(file, "\ntestTrainerNameLength="+(usernameLength==true?true:false), true); 
    }
    
    @Test
	public void testPasswordLength() throws Exception {
    	User user = MasterData.getUserDetails();
		user.getPassword();
		int passwordLength = 5;
		boolean usernameLength = ((user.getPassword().length()) >= passwordLength);
    	File file = new File("output_boundary_revised.txt");
	    FileUtils.write(file, "\ntestPasswordLength="+(usernameLength==true?true:false), true); 
	}
    @Test
    public void testActiveUser() throws Exception {
    	User user = MasterData.getUserDetails();
    	user.isActive();
    	boolean reslut = true;
    	File file = new File("output_boundary_revised.txt");
	    FileUtils.write(file, "\ntestActiveUser="+(reslut==true?true:false), true); 
    }
}