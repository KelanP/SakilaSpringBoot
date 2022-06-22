package com.tsi.kelan.SakilaSpringProject.repos;

import com.tsi.kelan.SakilaSpringProject.entities.Film;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface FilmRepository extends CrudRepository<Film,Integer> {
    List<Film> findByTitleLike(String title);

    @Query("from Film film where film.title=:keyword OR film.description=:keyword OR film.release_year=:keyword")
    Page<Film> findAll(Pageable pageable,@Param("keyword") String keyword);
}
