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
@Entity(name = "Trainer")
public class Trainer {
	@Id
	@Column(name = "trainerId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int trainerId;
	
	private String email;

	private String userName;

	private String password;

	private String firstName;

	private String lastName;

	private String contactNumber;

	private int age;

	private String role;

	private float exprience;

	private String facilities;

	private float fees;

	private String workHours;

	private int rating;
}
