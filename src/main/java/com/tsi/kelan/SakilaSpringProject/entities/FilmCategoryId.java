package com.tsi.kelan.SakilaSpringProject.entities;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FilmCategoryId implements Serializable {
    private static final long serialVersionUID = 9177533082545149495L; //serialVersionUID attribute to remember versions of a Serializable class to verify that a loaded class and the serialized object are compatible
    @Column(name = "film_id", nullable = false)
    private Integer filmId;

    @Column(name = "category_id", nullable = false)
    private Integer categoryId;

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        FilmCategoryId entity = (FilmCategoryId) o;
        return Objects.equals(this.filmId, entity.filmId) &&
                Objects.equals(this.categoryId, entity.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, categoryId);
    }

    public FilmCategoryId() {
    }

    public FilmCategoryId(Integer filmId, Integer categoryId) {
        this.filmId = filmId;
        this.categoryId = categoryId;
    }
}