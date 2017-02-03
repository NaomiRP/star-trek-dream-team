package app;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CrewMember {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private Date academyGraduationDate;
	private String team;

	@ManyToOne
	private Ship ship;
	private boolean captain = false;

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

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Ship getShip() {
		return ship;
	}

	public void setShip(Ship ship) {
		this.ship = ship;
	}

	public boolean isCaptain() {
		return captain;
	}

	public void setCaptain(boolean captain) {
		this.captain = captain;
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
