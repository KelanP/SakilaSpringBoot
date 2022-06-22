package com.tsi.kelan.SakilaSpringProject.mockito;

import com.tsi.kelan.SakilaSpringProject.SakilaSpringProjectApplication;
import com.tsi.kelan.SakilaSpringProject.entities.Actor;
import com.tsi.kelan.SakilaSpringProject.repos.ActorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.web.servlet.MockMvc;


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
	void setUp() {
		underTest = new SakilaSpringProjectApplication(actorRepository, null, null,null);
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
		actor = new Actor(54, "Pavan", "Pattni");
		underTest.getActorById(54); //when an actor id of 2 is selected

		ArgumentCaptor<Integer> actorArgumentCaptor = ArgumentCaptor.forClass(Integer.class);
		verify(actorRepository).findById(actorArgumentCaptor.capture()); //is id=2 queried from the DB
		Integer capturedActorID = actorArgumentCaptor.getValue();

		Assertions.assertEquals(54, capturedActorID);
	}

	@Test
	void testDeleteActorById() {
		underTest.deleteActorById(2);
		verify(actorRepository).deleteById(2);
	}


	@Test
	void testUpdateActorById() {
		//when: an actor has new information to be updated
		Actor actorInitial = new Actor(2, "Ryan", "McKay");
		actor = new Actor("Rian", "McKay");
		underTest.createNewActor(actor);
		underTest.updateActorById(2, actor);

		//then: check to see if the actor is updated
		ArgumentCaptor<Actor> actorArgumentCaptor = ArgumentCaptor.forClass(Actor.class);
		verify(actorRepository).save(actorArgumentCaptor.capture());

		Actor actorArgumentCaptorValue = actorArgumentCaptor.getValue();
		Assertions.assertEquals(actor, actorArgumentCaptorValue);


	}

	@Test
	void testCreateNewActor() {
		//when: a new actor is created and added
		actor = new Actor("John", "Phillips");
		underTest.createNewActor(actor);

		//then: check if it has been added
		ArgumentCaptor<Actor> actorArgumentCaptor = ArgumentCaptor.forClass(Actor.class);

		verify(actorRepository).save(actorArgumentCaptor.capture());

		Actor capturedActor = actorArgumentCaptor.getValue();

		Assertions.assertEquals(actor, capturedActor);

	}
}
