package app;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class CrewMember {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private Date academyGraduationDate;
	private String team;

	@Transient
	private Integer yearsOfService;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAcademyGraduationDate() {
		return academyGraduationDate;
	}

	public void setAcademyGraduationDate(Date academyGraduationDate) {
		this.academyGraduationDate = academyGraduationDate;
	}

	private LocalDate getLocalAcademyGraduationDate() {
		Calendar graduation = Calendar.getInstance();
		graduation.setTime(academyGraduationDate);
		return LocalDate.of(graduation.get(Calendar.YEAR), graduation.get(Calendar.MONTH),
				graduation.get(Calendar.DAY_OF_MONTH));
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Integer getYearsOfService() {
		if (yearsOfService == null) {
			Period serviceTime = getLocalAcademyGraduationDate().until(LocalDate.now());
			yearsOfService = serviceTime.getYears();
		}
		return yearsOfService;
	}

	public void setYearsOfService(Integer yearsOfService) {
		this.yearsOfService = yearsOfService;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((academyGraduationDate == null) ? 0 : academyGraduationDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CrewMember))
			return false;
		CrewMember other = (CrewMember) obj;
		if (academyGraduationDate == null ? other.academyGraduationDate != null
				: !academyGraduationDate.equals(other.academyGraduationDate))
			return false;
		return (name == null ? other.name == null : !name.equals(other.name));
	}

}
