package in.personalFitness.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.personalFitness.entity.Appointment;

@Repository
@Transactional
public class AppointmentDaoImpl implements AppointmentDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean AppointmentWithTrainer(Appointment appointment, int trainerId) {
		return false;
	}

	@Override
	public Appointment getAppointment(long tdId, String startTime, String endTime) {
		return null;
	}

	@Override
	public Appointment getAppointmentByPackage(float fees) {
		return null;
	}

	@Override
	public List<Appointment> listAllAppointment() {
		return null;
	}

	@Override
	public boolean updateAppointment(long tdId, Appointment appointment) {
		return false;
	}

	@Override
	public boolean deleteAppointment(long tdId) {
		return false;
	}

}
