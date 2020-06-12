package in.personalFitness.TestFuctional;

import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import in.personalFitness.UtilTestClass.MasterData;
import in.personalFitness.dao.AppointmentDao;
import in.personalFitness.dao.SkillsDao;
import in.personalFitness.dao.TrainerDao;
import in.personalFitness.dao.UserDao;
import in.personalFitness.entity.Appointment;
import in.personalFitness.entity.Skill;
import in.personalFitness.entity.Trainer;
import in.personalFitness.entity.User;
import in.personalFitness.service.AppointmentServiceImpl;
import in.personalFitness.service.SkillsServiceImpl;
import in.personalFitness.service.TrainerServiceImpl;
import in.personalFitness.service.UserServiceImpl;

public class TestFunctional {
	static {
		File file = new File("output_revised.txt");
		if (file.exists()) {
			try {
				FileUtils.forceDelete(new File("output_revised.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
	}
	@Mock
	private UserDao userDao;
	@Mock
	private SkillsDao skillsDao;
	@Mock
	private TrainerDao trainerDao;
	@Mock
	private AppointmentDao appointmentDao;

	@Mock
	private User user;
	@Mock
	private Skill skill;
	@Mock
	private Trainer trainer;
	@Mock
	private Appointment appointment;

	@InjectMocks
	private UserServiceImpl userServiceImpl;

	@InjectMocks
	private SkillsServiceImpl skillsServiceImpl;

	@InjectMocks
	private TrainerServiceImpl trainerServiceImpl;

	@InjectMocks
	private AppointmentServiceImpl appointmentServiceImpl;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testSaveUserImpl() throws Exception {
		boolean status = userServiceImpl.createUser(MasterData.getUserDetails());
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestSaveUserImpl=" + (status ? true : false), true);
	}

	@Test
	public void testSaveAppointmentImpl() throws Exception {
		boolean status = appointmentServiceImpl.AppointmentWithTrainer(appointment,
				MasterData.getAppointmentDetails().getTrainerId());
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestSaveAppointmentImpl=" + (status ? true : false), true);
	}

	@Test
	public void testSaveSkillImpl() throws Exception {
		boolean status = skillsServiceImpl.createSkill(MasterData.getSkillDetails());
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestSaveSkillImpl=" + (status ? true : false), true);
	}

	@Test
	public void testSaveTrainerImpl() throws Exception {
		boolean status = trainerServiceImpl.createTrainer(MasterData.getTrainerDetails());
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestSaveTrainerImpl=" + (status ? true : false), true);
	}

	@Test
	public void testGetUserImpl() throws Exception {
		user = userServiceImpl.getUser(MasterData.getUserDetails().getUserId());
		when(userDao.getUser(1)).thenReturn(user);
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestGetUserImpl=" + (user == null ? true : false), true);
	}

	@Test
	public void testGetAppointmentImpl() throws Exception {
		appointment = appointmentServiceImpl.getAppointment(MasterData.getAppointmentDetails().getTrainerId(),
				MasterData.getAppointmentDetails().getStartDate(), MasterData.getAppointmentDetails().getEndDate());
		when(appointmentDao.getAppointment(1, "11-11-2020", "10-11-2021")).thenReturn(appointment);
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestGetAppointmentImpl=" + (appointment == null ? true : false), true);
	}

	@Test
	public void testGetSkillImpl() throws Exception {
		skill = skillsServiceImpl.getSkill(MasterData.getSkillDetails().getSkillId());
		when(skillsDao.getSkill(1)).thenReturn(skill);
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestGetUserImpl=" + (user == null ? true : false), true);
	}

	@Test
	public void testGetTrainerImpl() throws Exception {
		trainer = trainerServiceImpl.getTrainer(MasterData.getTrainerDetails().getTrainerId());
		when(trainerDao.getTrainer(1)).thenReturn(trainer);
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestGetTrainerImpl=" + (trainer == null ? true : false), true);
	}

	@Test
	public void testDeleteSkillImpl() throws Exception {
		boolean status = skillsServiceImpl.deleteSkill(MasterData.getSkillDetails().getSkillId());
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestDeleteSkillImpl=" + (status ? true : false), true);
	}

	@Test
	public void testDeleteUsersImpl() throws Exception {
		boolean res = userServiceImpl.deleteUser(MasterData.getUserDetails().getUserId());
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestDeleteUsersImpl=" + (res ? true : false), true);
	}

	@Test
	public void testDeleteTrainerImpl() throws Exception {
		boolean res = trainerServiceImpl.deleteTrainer(MasterData.getTrainerDetails().getTrainerId());
		File file = new File("output_revised.txt");
		FileUtils.write(file, "\ntestDeleteTrainerImpl=" + (res ? true : false), true);
	}
}
