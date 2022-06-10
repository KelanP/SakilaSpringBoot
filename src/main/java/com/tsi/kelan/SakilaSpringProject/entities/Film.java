package com.tsi.kelan.SakilaSpringProject.entities;

import javax.persistence.*;
import javax.persistence.Id;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table(name="film")
public class Film {
    //attributes
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int film_id;

    private String title;

    private String description;

    private int release_year;

    private int language_id;

    private String original_language_id;

    private int rental_duration;

    private long rental_rate;

    private int length;

    private long replacement_cost;

    private String rating;

    private String special_feature;

    private String last_update;





    //constructors

    public Film(int film_id, String title, String description, int release_year, int language_id, int original_language_id, int rental_duration, long rental_rate, int length, long replacement_cost, String rating, String special_feature, String last_update) {
        this.film_id = film_id;
        this.title = title;
        this.description = description;
        this.release_year = release_year;
        this.language_id = language_id;
        //this.original_language_id = original_language_id;
        this.rental_duration = rental_duration;
        this.rental_rate = rental_rate;
        this.length = length;
        this.replacement_cost = replacement_cost;
        this.rating = rating;
        this.special_feature = special_feature;
        this.last_update = last_update;
    }

    public Film(){}


    //methods


    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public int getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public String getOriginal_language_id() {
       return original_language_id;
    }

   public void setOriginal_language_id( String original_language_id) {
       this.original_language_id = (original_language_id);
    }

    public int getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(int rental_duration) {
        this.rental_duration = rental_duration;
    }

    public long getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(long rental_rate) {
        this.rental_rate = rental_rate;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public long getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(long replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecial_feature() {
        return special_feature;
    }

    public void setSpecial_feature(String special_feature) {
        this.special_feature = special_feature;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }
}
