package app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ship {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String registryNumber;
	private Date launchDate;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "ship")
	private List<CrewMember> crewMembers = new ArrayList<>();

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

	public String getRegistryNumber() {
		return registryNumber;
	}

	public void setRegistryNumber(String registryNumber) {
		this.registryNumber = registryNumber;
	}

	public Date getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(Date launchDate) {
		this.launchDate = launchDate;
	}

	public List<CrewMember> getCrewMembers() {
		return crewMembers;
	}

	public void setCrewMembers(List<CrewMember> crewMembers) {
		this.crewMembers = crewMembers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((registryNumber == null) ? 0 : registryNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Ship))
			return false;
		Ship other = (Ship) obj;
		return (registryNumber == null ? other.registryNumber == null : registryNumber.equals(other.registryNumber));
	}

}
