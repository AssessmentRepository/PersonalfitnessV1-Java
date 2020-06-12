package in.personalFitness.TestException;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import in.personalFitness.entity.User;
import in.personalFitness.exception.UserAlreadyExistException;
import in.personalFitness.exception.UserDoesNotExistException;
import in.personalFitness.service.LoginServiceImpl;

public class TestException {
	static {
		File file = new File("output_exception_revised.txt");
		if (file.exists()) {
			try {
				FileUtils.forceDelete(new File("output_exception_revised.txt"));
			} catch (IOException e) {
				// e.printStackTrace();
			}
		}
	}	
	@InjectMocks
	private LoginServiceImpl loginServiceImpl;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test(expected = UserAlreadyExistException.class)
	public void testForUserRegistration() throws Exception {
		try {
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
			loginServiceImpl.register(user);
		} catch (UserAlreadyExistException e) {
			// TODO Auto-generated catch block
			File file = new File("output_exception_revised.txt");
			FileUtils.write(file, "\ntestForUserRegistration=true", true);
			throw e;
		} catch (Exception e) {
			File file = new File("output_exception_revised.txt");
			FileUtils.write(file, "\ntestForUserRegistration=false", true);
			throw e;
		}

		File file = new File("output_exception_revised.txt");
		FileUtils.write(file, "\ntestForUserRegistration=false", true);
	}

	@Test(expected = UserDoesNotExistException.class)
	public void testForUserLogin() throws Exception {
		try {
			User user = new User();
			user.setUserName("shashidhar");
			user.setPassword("1234567890");
			loginServiceImpl.login(user.getUserName(), user.getPassword());
		} catch (UserDoesNotExistException e) {
			// TODO Auto-generated catch block
			File file = new File("output_exception_revised.txt");
			FileUtils.write(file, "\ntestForUserLogin=true", true);
			throw e;
		} catch (Exception e) {
			File file = new File("output_exception_revised.txt");
			FileUtils.write(file, "\ntestForUserLogin=false", true);
			throw e;
		}

		File file = new File("output_exception_revised.txt");
		FileUtils.write(file, "\ntestForUserLogin=false", true);
	}
}
