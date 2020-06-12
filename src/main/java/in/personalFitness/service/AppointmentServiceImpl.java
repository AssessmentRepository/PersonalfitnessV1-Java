package in.personalFitness.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.personalFitness.dao.AppointmentDao;
import in.personalFitness.entity.Appointment;

@Service("AppointmentService")
@Transactional
public class AppointmentServiceImpl implements AppointmentService {
	@Autowired
	private AppointmentDao appointmentDao;

	@Override
	public boolean AppointmentWithTrainer(Appointment appointment, int trainerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Appointment getAppointment(long tdId, String startTime, String endTime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment getAppointmentByPackage(float fees) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> listAllAppointment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateAppointment(long tdId, Appointment appointment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAppointment(long tdId) {
		// TODO Auto-generated method stub
		return false;
	}
}
