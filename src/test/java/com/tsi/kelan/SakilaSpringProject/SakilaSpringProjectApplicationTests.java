package com.tsi.kelan.SakilaSpringProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.mockito.Mockito.verify;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class SakilaSpringProjectApplicationTests {

	@Mock
	private ActorRepository actorRepository;
	@Mock
	private Actor actor;
	private SakilaSpringProjectApplication underTest;

	@BeforeEach
	void setUp(){
		underTest = new SakilaSpringProjectApplication(actorRepository);
	}
	@Test
	void testGetAllActors() {
		//when running the getAllActors method
		underTest.getAllActors();
		//check to see if it is finding all actors in the DB
		verify(actorRepository).findAll();
	}

	@Test
	void testGetActorById() {
		underTest.getActorById(2); //when an actor id of 2 is selected
		verify(actorRepository).findById(2); //is id=2 queried from the DB
	}

	@Test
	void testDeleteActorById() {
		underTest.deleteActorById(2);
		verify(actorRepository).deleteById(2);
	}

	@Test
	void testUpdateActorById() {
		underTest.updateActorById(2,actor);
		verify(actorRepository).save(actor);

		/* not sure why this wouldn't work:
		underTest.updateActorById(2,new Actor(2,"Phillipp","Lahm"));
		verify(actorRepository).save(new Actor(2,"Phillipp","Lahm"));
		 */
	}

	@Test
	void testCreateNewActor() {
		underTest.createNewActor(actor);
		verify(actorRepository).save(actor);
	}
}
