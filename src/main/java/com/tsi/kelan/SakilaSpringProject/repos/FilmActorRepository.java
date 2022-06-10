package com.tsi.kelan.SakilaSpringProject.repos;

import com.tsi.kelan.SakilaSpringProject.entities.FilmActor;
import com.tsi.kelan.SakilaSpringProject.entities.FilmActorId;
import org.springframework.data.repository.CrudRepository;

public interface FilmActorRepository extends CrudRepository<FilmActor, FilmActorId> {
}
