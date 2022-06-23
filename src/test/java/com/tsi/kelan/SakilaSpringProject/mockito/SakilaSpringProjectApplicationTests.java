package com.tsi.kelan.SakilaSpringProject.mockito;

import com.tsi.kelan.SakilaSpringProject.SakilaSpringProjectApplication;
import com.tsi.kelan.SakilaSpringProject.entities.Actor;
import com.tsi.kelan.SakilaSpringProject.entities.Customer;
import com.tsi.kelan.SakilaSpringProject.entities.Film;
import com.tsi.kelan.SakilaSpringProject.entities.FilmActor;
import com.tsi.kelan.SakilaSpringProject.entities.more.Address;
import com.tsi.kelan.SakilaSpringProject.entities.more.Store;
import com.tsi.kelan.SakilaSpringProject.repos.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;


import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class SakilaSpringProjectApplicationTests {


	//Mock relevant repositories using Mockito
	@Mock
	private ActorRepository actorRepository;

	@Mock
	private FilmRepository filmRepository;

	@Mock
	private FilmActorRepository filmActorRepository;

	@Mock
	private CustomerRepository customerRepository;

	@InjectMocks
	private SakilaSpringProjectApplication underTest; //instance of main class

	@BeforeEach //Mockito
	void setUp() {
		underTest = new SakilaSpringProjectApplication(
				actorRepository,
				filmRepository,
				filmActorRepository,
				customerRepository
				);
	}


	//-----------------------------Tests for actor CRUD functions -----------------------------//
	@Test
	void testGetAllActors() {
		//when running the getAllActors method
		underTest.getAllActors();
		//check to see if it is finding all actors in the DB
		verify(actorRepository).findAll();
	}

	@Test
	void testGetActorById() {
		Actor actor = new Actor(54, "Pavan", "Pattni");
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
		Actor actorFinal = new Actor("Rian", "McKay");
		underTest.createNewActor(actorFinal);
		underTest.updateActorById(2, actorFinal);

		//then: check to see if the actor is updated
		ArgumentCaptor<Actor> actorArgumentCaptor = ArgumentCaptor.forClass(Actor.class);
		verify(actorRepository).save(actorArgumentCaptor.capture());

		Actor actorArgumentCaptorValue = actorArgumentCaptor.getValue();
		Assertions.assertEquals(actorFinal, actorArgumentCaptorValue);

	}

//	@Test
//	void testUpdateActorByWithInvalidID() {
//		//when: an actor has new information to be updated
//		Actor actorInitial = new Actor(2, "Ryan", "McKay");
//		Actor actor = new Actor(2,"Rian", "McKay");
//		underTest.createNewActor(actorInitial);
//		underTest.updateActorById(3, actor);
//
//		//then: check to see if the actor is updated
//		ArgumentCaptor<Actor> actorArgumentCaptor = ArgumentCaptor.forClass(Actor.class);
//		Actor actorArgumentCaptorValue = actorArgumentCaptor.getValue();
//
//		Assertions.assertEquals(null,actorArgumentCaptorValue);
//
//
//	}

	@Test
	void testCreateNewActor() {
		//when: a new actor is created and added
		Actor actor = new Actor("John", "Phillips");
		underTest.createNewActor(actor);

		//then: check if it has been added
		ArgumentCaptor<Actor> actorArgumentCaptor = ArgumentCaptor.forClass(Actor.class);

		verify(actorRepository).save(actorArgumentCaptor.capture());

		Actor capturedActor = actorArgumentCaptor.getValue();

		Assertions.assertEquals(actor, capturedActor);

	}


	//-----------------------------Tests for film functions -----------------------------//
	@Test
	void testGetAllFilms() {
		//when running the getAllFilms method
		underTest.getAllFilms();
		//check to see if it is finding all films in the DB
		verify(filmRepository).findAll();
	}

	@Test
	void testGetFilmById() {
		Film film = new Film(33,"My New Solo Film","a trashy film about han solo", 2022,0, "null",3,2.99f,200,22.99f,"R","null","2022-02-15 15:03:42");

		underTest.getFilmById(33); //when a film id of 33 is selected
		ArgumentCaptor<Integer> filmArgumentCaptor = ArgumentCaptor.forClass(Integer.class); //ArgumentCaptor is used to 'capture' an argument passed to a method to inspect it
		verify(filmRepository).findById(filmArgumentCaptor.capture()); //is id=33 queried from the DB
		Integer capturedFilmID = filmArgumentCaptor.getValue(); //store the queried ID

		Assertions.assertEquals(33, capturedFilmID); //check if id=33 is what is queried from DB
	}

	@Test
	void testDeleteFilmById() {
		underTest.deleteFilmById(2);
		verify(filmRepository).deleteById(2);
	}

	@Test
	void testFilmSearch(){
		underTest.findFilmByTitle("CHAINSAW UPTOWN");
		verify(filmRepository).findByTitleLike("CHAINSAW UPTOWN");


	}
	@Test
	void testCreateNewFilm() {
		//when: a new film is created and added
		Film film = new Film(2,"My New Solo Film","a trashy film about han solo", 2022,0, "null",3,2.99f,200,22.99f,"R","null","2022-02-15 15:03:42");
		underTest.createNewFilm(film);

		//then: check if it has been added
		ArgumentCaptor<Film> filmArgumentCaptor = ArgumentCaptor.forClass(Film.class);

		verify(filmRepository).save(filmArgumentCaptor.capture());

		Film capturedFilm = filmArgumentCaptor.getValue();

		Assertions.assertEquals(film, capturedFilm);

	}
	@Test
	void testUpdateFilmById() {
		//when: a film has new information to be updated
		Film initialFilm = new Film(2,"My New Solo Film","a trashy film about han solo", 2022,0, "null",3,2.99f,200,22.99f,"R","null","2022-02-15 15:03:42");
		Film finalFilm = new Film(3,"My New Han Solo Film","a trashy film about han solo", 2022,0, "null",3,2.99f,200,22.99f,"R","null","2022-02-15 15:03:42");

		underTest.createNewFilm(finalFilm);
		underTest.updateFilmById(2, finalFilm);

		//then: check to see if the film is updated
		ArgumentCaptor<Film> filmArgumentCaptor = ArgumentCaptor.forClass(Film.class);

		verify(filmRepository).save(filmArgumentCaptor.capture());


		Film filmArgumentCaptorValue = filmArgumentCaptor.getValue();
		Assertions.assertEquals(finalFilm, filmArgumentCaptorValue);

	}
//-----------------------------Tests for FilmActor functions -----------------------------//

//	@Test
//	void testGetAllFilmActors() {
//		//when running the getAllFilmsActors method
//		underTest.getAllFilmActors();
//		//check to see if it is finding all FilmActors in the DB
//		verify(filmActorRepository).findAll();
//	}

//-----------------------------Tests for Customer functions -----------------------------//

	@Test
	void testGetCustomerById() {
		Customer customer = new Customer();

		underTest.getCustomerById(33);
		ArgumentCaptor<Integer> customerArgumentCaptor = ArgumentCaptor.forClass(Integer.class);
		verify(customerRepository).findById(customerArgumentCaptor.capture());
		Integer capturedCustomerID = customerArgumentCaptor.getValue();

		Assertions.assertEquals(33, capturedCustomerID);
	}

	@Test
	void testCreateNewCustomer() {
		//when: a new film is created and added
		Store testStore= new Store();
		Address testAddress = new Address();

		Customer customer = new Customer(2222,testStore,"Liam","Neeson","LNeeson@mail.com",testAddress,false,"2020-10-11 11:10:01","2021-01-01 01:10:02");
		underTest.createNewCustomer(customer);

		//then: check if it has been added
		ArgumentCaptor<Customer> customerArgumentCaptor = ArgumentCaptor.forClass(Customer.class);

		verify(customerRepository).save(customerArgumentCaptor.capture());

		Customer capturedCustomer = customerArgumentCaptor.getValue();

		Assertions.assertEquals(customer, capturedCustomer);

	}

}

