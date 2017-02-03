package app;

import java.time.LocalDate;
import java.util.Date;

public class CrewMemberDto extends AbstractNamedDto {
	private Integer yearsOfService;
	private String team;
	private String shipRegistryNumber;
	private Boolean captain;

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Integer getYearsOfService() {
		if (yearsOfService == null & date != null)
			yearsOfService = getLocalDate().until(LocalDate.now()).getYears();
		return yearsOfService;
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
