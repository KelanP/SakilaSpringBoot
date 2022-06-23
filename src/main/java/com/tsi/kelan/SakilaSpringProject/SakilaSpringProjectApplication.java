package com.tsi.kelan.SakilaSpringProject;

import com.tsi.kelan.SakilaSpringProject.entities.*;
import com.tsi.kelan.SakilaSpringProject.repos.*;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Random;


@SpringBootApplication
@EnableEncryptableProperties
@RestController
@RequestMapping("/home")
public class SakilaSpringProjectApplication {

	@Autowired
	private ActorRepository actorRepository;
	@Autowired
	private FilmRepository filmRepository;

	@Autowired
	private FilmActorRepository filmActorRepository;

	@Autowired
	private CustomerRepository customerRepository;



	public SakilaSpringProjectApplication(ActorRepository actorRepository, FilmRepository filmRepository, FilmActorRepository filmActorRepository,CustomerRepository customerRepository) {
		this.actorRepository = actorRepository;
		this.filmRepository = filmRepository;
		this.filmActorRepository = filmActorRepository;
		this.customerRepository = customerRepository;

	}

	public static void main(String[] args) {
		SpringApplication.run(SakilaSpringProjectApplication.class, args);
	}


//CRUD METHODS FOR ACTOR TABLE
	@GetMapping("/actor/all")
	public @ResponseBody
	Iterable<Actor>getAllActors(){
		return actorRepository.findAll();
	}

	@GetMapping("/actor/{id}") //request will look like ".../actor/?id=1"
	public @ResponseBody
	Optional<Actor> getActorById(@PathVariable(value="id") int id){
		return actorRepository.findById(id);}

	@DeleteMapping("/actor/delete/{id}")
	public @ResponseBody String deleteActorById(@PathVariable(value="id")int id){
		String displayActor = String.valueOf(actorRepository.findById(id));
		actorRepository.deleteById(id);
		return displayActor + "\n----- This item has been deleted -----";
	}

	@PutMapping("/actor/update/{id}")
	public @ResponseBody
	Actor updateActorById(@PathVariable(value="id") int id, @RequestBody Actor actor){
		if (actorRepository.existsById(id)){
			actorRepository.save(actor);
			return actorRepository.save(actor);}

		else return null;

		}

	@PostMapping("/actor/create")
	public  @ResponseBody
	Actor createNewActor(@RequestBody Actor actor){
		actorRepository.save(actor);
		return actor;
	}

//CRUD METHODS FOR FILM TABLE
	@GetMapping("/film/all")
	public @ResponseBody
	Iterable<Film>getAllFilms(){
		return filmRepository.findAll();
	}

	@GetMapping("/film/{id}")
	public @ResponseBody
	Optional<Film> getFilmById(@PathVariable(value="id") int id){
		return filmRepository.findById(id);
	}

	@GetMapping("/film/random")
	public @ResponseBody Optional<Film>getRandomFilm(){
		Long numberOfFilms = filmRepository.count();
		int intNumberOfFilms = numberOfFilms.intValue();
		Random random = new Random();
		int randomFilmID = random.nextInt(intNumberOfFilms);
		return filmRepository.findById(randomFilmID);
	}

	@GetMapping("/film/search/{searchRequest}")
	public @ResponseBody Iterable<Film>findFilmByTitle(@PathVariable(value="searchRequest") String searchRequest){
		return filmRepository.findByTitleLike(searchRequest.toUpperCase());
	}

	@GetMapping("/film/pwrsearch/{searchRequest}")
	public Page<Film> getAllFilmsLike(Pageable pageable, @PathVariable("searchRequest") String keyword) {
		return filmRepository.findAll(pageable,keyword);
	}

	@PostMapping("/film/create")
	public @ResponseBody
	Film createNewFilm(@RequestBody Film userInputFilm){
		filmRepository.save(userInputFilm);
		return userInputFilm;
	}

	@DeleteMapping("/film/delete/{id}")
	public @ResponseBody String deleteFilmById(@PathVariable(value="id")int id){
		filmRepository.deleteById(id);
		return "----- This item of film_id: " + id + ", has been deleted -----";
	}

	@PutMapping("/film/update/{id}")
	public @ResponseBody
	Film updateFilmById(@PathVariable(value="id") int id, @RequestBody Film userInputFilm){
		if (filmRepository.existsById(id)){
			filmRepository.save(userInputFilm);
			return filmRepository.save(userInputFilm);}

		else return null;

	}

//CRUD METHODS FOR FILM_ACTOR
	@GetMapping("/film_actor/all")
	public @ResponseBody
	Iterable<FilmActor> getAllFilmActors(){
		return filmActorRepository.findAll();
	}

//CRUD METHODS FOR CUSTOMER TABLE


@GetMapping("/customer/{id}")
public @ResponseBody
Optional<Customer> getCustomerById(@PathVariable(value="id") int id){
	return customerRepository.findById(id);
}

@PostMapping("/customer/create")
public @ResponseBody
Customer createNewCustomer(@RequestBody Customer userInputCustomer){
	customerRepository.save(userInputCustomer);
	return userInputCustomer;
}




}
