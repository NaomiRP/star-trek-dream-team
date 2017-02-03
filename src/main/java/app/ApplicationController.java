package app;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/star-trek")
public class ApplicationController {
	@Autowired
	private CrewMemberRepository crewMemberRepository;
	@Autowired
	private ShipRepository shipRepository;

	@PostMapping(path = "/initialize")
	public @ResponseBody UniverseDto initialize(@RequestBody UniverseDto universe) {
		universe.setCrewMembers(universe.getCrewMembers().stream().map(this::toCrewMember)
				.map(crewMemberRepository::save).map(this::toCrewMemberDto).collect(Collectors.toList()));
		universe.setShips(universe.getShips().stream().map(this::toShip).map(shipRepository::save).map(this::toShipDto)
				.collect(Collectors.toList()));
		// TODO: assign crew not already on a ship; define captains for each ship
		// converting back to dtos and updating universe will need to move to after ship/captain assignments
		return universe;
	}

	// Conversion methods could be replaced by appropriate constructors in entities.
	private CrewMember toCrewMember(CrewMemberDto cmDto) {
		CrewMember cm = new CrewMember();
		cm.setName(cmDto.name);
		cm.setAcademyGraduationDate(cmDto.getAcademyGraduationDate());
		cm.setTeam(cmDto.getTeam());
		return cm;
	}

	private Ship toShip(ShipDto shipDto) {
		Ship ship = new Ship();
		ship.setName(shipDto.getName());
		ship.setRegistryNumber(shipDto.getRegistryNumber());
		ship.setLaunchDate(shipDto.getLaunchDate());
		ship.getCrewMembers().addAll(
				shipDto.getCrewNames().stream().map(crewMemberRepository::findByName).collect(Collectors.toList()));
		return ship;
	}

	private CrewMemberDto toCrewMemberDto(CrewMember cm) {
		CrewMemberDto cmDto = new CrewMemberDto();
		cmDto.setName(cm.getName());
		cmDto.setAcademyGraduationDate(cm.getAcademyGraduationDate());
		cmDto.setTeam(cm.getTeam());
		cmDto.setShipRegistryNumber(cm.getShip().getRegistryNumber());
		if (cmDto.getShipRegistryNumber() != null)
			cmDto.setCaptain(cm.isCaptain());
		return cmDto;
	}

	private ShipDto toShipDto(Ship ship) {
		ShipDto shipDto = new ShipDto();
		shipDto.setName(ship.getName());
		shipDto.setRegistryNumber(ship.getRegistryNumber());
		shipDto.setLaunchDate(ship.getLaunchDate());
		shipDto.setCrewMembers(ship.getCrewMembers().stream().map(this::toCrewMemberDto).collect(Collectors.toList()));
		return shipDto;
	}
}
