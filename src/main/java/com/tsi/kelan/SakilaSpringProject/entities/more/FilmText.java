package com.tsi.kelan.SakilaSpringProject.entities.more;

import javax.persistence.*;

@Entity
@Table(name = "film_text")
public class FilmText {
    @Id
    @Column(name = "film_id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false)
    private String title;

    @Lob
    @Column(name = "description")
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public FilmText() {
    }

    public FilmText(Integer id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
}