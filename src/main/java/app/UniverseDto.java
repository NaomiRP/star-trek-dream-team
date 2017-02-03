package app;

import java.util.ArrayList;
import java.util.List;

/**
 * A container requests and responses that have both ships and crew members.
 */
public class UniverseDto {
	private List<CrewMemberDto> crewMembers = new ArrayList<>();
	private List<ShipDto> ships = new ArrayList<>();

	public List<CrewMemberDto> getCrewMembers() {
		return crewMembers;
	}

	public void setCrewMembers(List<CrewMemberDto> crewMembers) {
		this.crewMembers = crewMembers;
	}

	public List<ShipDto> getShips() {
		return ships;
	}

	public void setShips(List<ShipDto> ships) {
		this.ships = ships;
	}
}
