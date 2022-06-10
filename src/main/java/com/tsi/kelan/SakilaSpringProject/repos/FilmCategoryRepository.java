package com.tsi.kelan.SakilaSpringProject.repos;

import com.tsi.kelan.SakilaSpringProject.entities.FilmActor;
import com.tsi.kelan.SakilaSpringProject.entities.FilmCategory;
import org.springframework.data.repository.CrudRepository;

public interface FilmCategoryRepository extends CrudRepository<FilmCategory,Integer> {
}
