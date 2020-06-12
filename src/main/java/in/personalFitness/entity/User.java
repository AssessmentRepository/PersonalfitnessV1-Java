package in.personalFitness.entity;

import java.util.List;

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
@Entity(name = "User")
public class User {
	@Id
	@Column(name = "userId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;	

	private String userName;

	private String password;
	
	private String firstName;

	private String lastName;

	private String contactNumber;

	private String email;	

	private int age;

	private String address;

	private boolean active;

	private boolean confirmedSignUp;

	private boolean resetPassword;
}
