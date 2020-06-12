package in.personalFitness.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Appointment")
public class Appointment {
	@Id
	@Column(name = "tdId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long tdId;
	@Column(name = "status")
	private String status;
	@Column(name = "progress")
	private int progress;
	@Column(name = "fees")
	private float fees;
	@Column(name = "commissionAmount")
    private float commissionAmount;
	@Column(name = "rating")
    private int rating;
	@Column(name = "startDate")
    private String startDate;
	@Column(name = "endDate")
    private String endDate;
	@Column(name = "startTime")
    private String startTime;
	@Column(name = "endTime")
    private String endTime;
	@Column(name = "amountReceived")
    private float amountReceived;
	@Column(name = "userId")
    private int userId;
	@Column(name = "trainerId")
    private int trainerId;
	@Column(name = "skillId")
    private int skillId;
}
