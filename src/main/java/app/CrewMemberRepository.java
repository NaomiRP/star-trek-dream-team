package app;

import org.springframework.data.repository.CrudRepository;

public interface CrewMemberRepository extends CrudRepository<CrewMember, Integer> {
	CrewMember findByName(String name);
}
