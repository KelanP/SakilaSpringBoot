package com.tsi.kelan.SakilaSpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@SpringBootApplication
@ImportResource({"classpath*:application-context.xml"})
@RestController
@RequestMapping("/home")


public class SakilaSpringProjectApplication {

	@Autowired
	private ActorRepository actorRepository;
	@Autowired
	private FilmRepository filmRepository;

	public static void main(String[] args) {
		SpringApplication.run(SakilaSpringProjectApplication.class, args);
	}


	public SakilaSpringProjectApplication(ActorRepository actorRepository){
		this.actorRepository = actorRepository;
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
	public @ResponseBody
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






}