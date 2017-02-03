package app;

import java.util.Date;
import java.util.List;

public class ShipDto extends AbstractNamedDto {
	private String registryNumber;
	private List<String> crewNames;
	private List<CrewMemberDto> crewMembers;

	public String getRegistryNumber() {
		return registryNumber;
	}

	public void setRegistryNumber(String registryNumber) {
		this.registryNumber = registryNumber;
	}

	public Date getLaunchDate() {
		return date;
	}

	public void setLaunchDate(Date launchDate) {
		date = launchDate;
	}

	public List<String> getCrewNames() {
		return crewNames;
	}

	public void setCrewNames(List<String> crewNames) {
		this.crewNames = crewNames;
	}

	public List<CrewMemberDto> getCrewMembers() {
		return crewMembers;
	}

	public void setCrewMembers(List<CrewMemberDto> crewMembers) {
		this.crewMembers = crewMembers;
	}

}
