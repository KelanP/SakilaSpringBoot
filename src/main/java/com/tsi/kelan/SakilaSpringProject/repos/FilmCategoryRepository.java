package com.tsi.kelan.SakilaSpringProject.repos;

import com.tsi.kelan.SakilaSpringProject.entities.FilmCategory;
import org.springframework.data.repository.CrudRepository;

public interface FilmCategoryRepository<FilmCategoryID> extends CrudRepository<FilmCategory,FilmCategoryID> {
}
