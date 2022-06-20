package com.tsi.kelan.SakilaSpringProject;

import com.tsi.kelan.SakilaSpringProject.entities.Actor;
import com.tsi.kelan.SakilaSpringProject.entities.Film;
import com.tsi.kelan.SakilaSpringProject.entities.FilmActor;
import com.tsi.kelan.SakilaSpringProject.repos.ActorRepository;
import com.tsi.kelan.SakilaSpringProject.repos.FilmActorRepository;
import com.tsi.kelan.SakilaSpringProject.repos.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Optional;
import java.util.Random;


@SpringBootApplication
@RestController
@RequestMapping("/home")


public class SakilaSpringProjectApplication {

	@Autowired
	private ActorRepository actorRepository;
	@Autowired
	private FilmRepository filmRepository;
	@Autowired
	private FilmActorRepository filmActorRepository;



	public static void main(String[] args) {
		SpringApplication.run(SakilaSpringProjectApplication.class, args);
	}




	public SakilaSpringProjectApplication(ActorRepository actorRepository, FilmRepository filmRepository, FilmActorRepository filmActorRepository) {
		this.actorRepository = actorRepository;
		this.filmRepository = filmRepository;
		this.filmActorRepository = filmActorRepository;
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
		return filmRepository.findByTitle(searchRequest.toUpperCase());
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







}
