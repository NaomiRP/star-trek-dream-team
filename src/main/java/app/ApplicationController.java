package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/star-trek")
public class ApplicationController {
	@Autowired
	private CrewMemberRepository crewMemberRepository;
	@Autowired
	private ShipRepository shipRepository;

	@PostMapping(path = "/initialize")
	public @ResponseBody UniverseDto initialize(@RequestParam UniverseDto universe) {
		return universe; // TODO actually create the universe & return the
							// result.
	}

}
