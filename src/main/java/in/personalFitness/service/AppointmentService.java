package in.personalFitness.service;

import java.util.List;

import in.personalFitness.entity.Appointment;

public interface AppointmentService {
	boolean AppointmentWithTrainer(Appointment appointment,int trainerId);
	Appointment getAppointment(long tdId,String startTime,String endTime);
	Appointment getAppointmentByPackage(float fees);
	List<Appointment> listAllAppointment();
	boolean updateAppointment(long tdId,Appointment appointment);
	boolean deleteAppointment(long tdId);	
}
