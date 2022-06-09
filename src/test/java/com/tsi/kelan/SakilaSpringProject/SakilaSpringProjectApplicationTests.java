package com.tsi.kelan.SakilaSpringProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
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
	@Mock
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
		Actor actor2 = new Actor(2, "Pavan","Pattni");
		underTest.deleteActorById(2);
		verify(actorRepository).deleteById(2);
	}


	@Test
	void testUpdateActorById() {
		//when: an actor has new information to be updated
		Actor actorInitial = new Actor(2,"Ryan","McKay");
		actor = new Actor("Rian","McKay");
		underTest.createNewActor(actor);
		underTest.updateActorById(2,actor);

		//then: check to see if the actor is updated
		ArgumentCaptor<Actor> actorArgumentCaptor = ArgumentCaptor.forClass(Actor.class);
		verify(actorRepository).save(actorArgumentCaptor.capture());

		Actor actorArgumentCaptorValue = actorArgumentCaptor.getValue();
		Assertions.assertEquals(actor,actorArgumentCaptorValue);


	}

	@Test
	void testCreateNewActor() {
		//when: a new actor is created and added
		actor = new Actor("John","Phillips");
		underTest.createNewActor(actor);

		//then: check if it has been added
		ArgumentCaptor<Actor> actorArgumentCaptor = ArgumentCaptor.forClass(Actor.class);

		verify(actorRepository).save(actorArgumentCaptor.capture());

		Actor capturedActor = actorArgumentCaptor.getValue();

		Assertions.assertEquals(actor,capturedActor);

	}
}
