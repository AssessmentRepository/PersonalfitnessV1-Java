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
@Entity(name = "Skills")
public class Skill {
	@Id
	@Column(name = "skillId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int skillId;
	@Column(name = "skillName")
	private String skillName;
	@Column(name = "toc")
	private String toc;
	@Column(name = "prerequisites")
	private String prerequisites;	
}
