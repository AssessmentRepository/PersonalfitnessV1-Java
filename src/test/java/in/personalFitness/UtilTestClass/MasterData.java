package in.personalFitness.UtilTestClass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import in.personalFitness.entity.Appointment;
import in.personalFitness.entity.Skill;
import in.personalFitness.entity.Trainer;
import in.personalFitness.entity.User;

public class MasterData {
	public static User getUserDetails() {
		User user = new User();
		user.setUserId(1);
		user.setUserName("shashidhar");
		user.setPassword("1234567890");
		user.setFirstName("Besta");
		user.setLastName("Shashidhar");
		user.setContactNumber("9494879694");
		user.setEmail("shashi.2346@gmail.com");
		user.setAge(23);
		user.setAddress("Bangalore");
		user.setActive(true);
		user.setConfirmedSignUp(true);
		user.setResetPassword(true);
		return user;
	}
	public static User getUpdatedUserDetails() {
		User user = new User();
		user.setUserName("Shashidhar");
		user.setPassword("Password");
		user.setFirstName("B");
		user.setLastName("Shashidhar");
		user.setContactNumber("9494879694");
		user.setEmail("shashi@gmail.com");
		user.setAge(23);
		user.setAddress("Hyderabad");
		user.setActive(true);
		user.setConfirmedSignUp(true);
		user.setResetPassword(true);
		return user;
	}
	public static Skill getSkillDetails() {
		Skill skill=new Skill();
		skill.setSkillId(1);
		skill.setSkillName("skill1");
		skill.setPrerequisites("1,2,3,4");
		skill.setToc("dont'know");
		return skill;
	}
	public static Appointment getAppointmentDetails() {
		Appointment appointment=new Appointment();
		appointment.setTdId(1);
		appointment.setStatus("active");
		appointment.setProgress(2);
		appointment.setFees(100f);
		appointment.setCommissionAmount(1f);
		appointment.setRating(4);
		appointment.setStartDate("11-11-2020");
		appointment.setEndDate("10-12-2021");
		appointment.setStartTime("8:00AM");
		appointment.setEndTime("9:00AM");
		appointment.setAmountReceived(50);
		appointment.setUserId(1);
		appointment.setTrainerId(1);
		appointment.setSkillId(1);
		return appointment;
	}
	public static Trainer getTrainerDetails() {
		Trainer trainer = new Trainer();
		trainer.setTrainerId(1);
		trainer.setUserName("Shashidhar");
		trainer.setEmail("shashi@gmail.com");
		trainer.setPassword("1234567890");
		trainer.setFirstName("Besta");
		trainer.setLastName("Shashidhar");
		trainer.setContactNumber("9494879694");
		trainer.setAge(23);
		trainer.setExprience(1);
		trainer.setRole("Admin");
		trainer.setFacilities("1,2,3,4");
		trainer.setFees(1234);
		trainer.setWorkHours("9:30PM");	
		trainer.setRating(3);
		return trainer;
	}
	public static Properties getProperties() throws IOException {
		FileReader reader = new FileReader("src/main/resources/db.properties");
		Properties properties = new Properties();
		properties.load(reader);
		return properties;
	}
	
	public static LocalSessionFactoryBean getSession() throws IOException {
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		Properties properties = getProperties();
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(properties.getProperty("database.driver"));
		dataSource.setUrl(properties.getProperty("database.url"));
		dataSource.setUsername(properties.getProperty("database.root"));
		dataSource.setPassword(properties.getProperty("database.password"));
		lsfb.setDataSource(dataSource);
		lsfb.setPackagesToScan("com.giftCard.entity");
		properties.put("hibernate.dialect", properties.getProperty("hibernate.dialect"));
		properties.put("hibernate.hbm2ddl.auto", properties.getProperty("hibernate.hbm2ddl.auto"));
		properties.put("hibernate.show_sql", properties.getProperty("hibernate.show_sql"));
		lsfb.setHibernateProperties(properties);
		try {
			lsfb.afterPropertiesSet();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lsfb;
	}
}