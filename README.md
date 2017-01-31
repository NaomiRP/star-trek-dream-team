# Build your Star Trek Dream Team

You are the admiral of a fleet of starships in the Star Trek universe.

Your mission is to build an application to manage your dream teams that run your ships.

## In this Universe...

* There are ships.
* A ship has a
  * name
  * registry number
  * launch date
* Ships can have crew members
* A crew member has a
  * name
  * academy graduation date
  * years of service
  * Team
* Crew members can not be on more than one ship.
* A crew member can be a captain.
* A ship must have one captain.

## The Mission: Manage Your Fleet

To affectively govern the universe, you must be able to create, view and control your fleet.

### Primary Goals

* Initialize the universe (any way you want)
  * All crew are evenly distributed among the available ships
  * A captain is chosen by their seniority
     * Write a unit test for the logic which decides the captain

* List all ships and their crew (must be through a JSON REST API)

### Secondary Goals

These are bonus JSON REST API endpoints to accomplish.

* List all unassigned crew members
* Add a new ship
* Add a new crew member
* Assign a crew member to a ship
* Designate the captain of the ship
* Initiate a mutiny to take control of a ship, designate a new crew and choose a captain.

## Technical Requirements

This application will use the following:

  * Spring Data JPA and Hibernate
  * SQL database
  * Small logical commits. Don't commit everything all at once at the end.
  * Anybody should be able to pull this project and run the application per your documented instructions.
