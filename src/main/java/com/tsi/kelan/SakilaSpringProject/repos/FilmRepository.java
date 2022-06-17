package com.tsi.kelan.SakilaSpringProject.repos;

import com.tsi.kelan.SakilaSpringProject.entities.Film;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FilmRepository extends CrudRepository<Film,Integer> {
    List<Film> findByTitle(String title);
}
