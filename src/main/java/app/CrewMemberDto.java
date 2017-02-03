package app;

import java.util.Date;

public class CrewMemberDto extends AbstractNamedDto {
	private String team;
	private String shipRegistryNumber;
	private Boolean captain;

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Date getAcademyGraduationDate() {
		return date;
	}

	public void setAcademyGraduationDate(Date academyGraduationDate) {
		date = academyGraduationDate;
	}

	public String getShipRegistryNumber() {
		return shipRegistryNumber;
	}

	public void setShipRegistryNumber(String shipRegistryNumber) {
		this.shipRegistryNumber = shipRegistryNumber;
	}

	public Boolean getCaptain() {
		return captain;
	}

	public void setCaptain(Boolean captain) {
		this.captain = captain;
	}

}
