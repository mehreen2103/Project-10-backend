package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_movie")
public class MovieDTO extends BaseDTO {

    @Column(name = "movie_name", length = 100)
    private String movieName;

    @Column(name = "genre", length = 100)
    private String genre;

    @Column(name = "release_year", length = 20)
    private String releaseYear;

    @Column(name = "language", length = 100)
    private String language;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String getValue() {
        return movieName;
    }

    @Override
    public String getUniqueKey() {
        return "movieName";
    }

    @Override
    public String getUniqueValue() {
        return movieName;
    }

    @Override
    public String getLabel() {
        return "Movie";
    }

    @Override
    public String getTableName() {
        return "movie";
    }
}