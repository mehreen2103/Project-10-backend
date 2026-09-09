package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.MovieDTO;

public class MovieForm extends BaseForm {

    @NotEmpty(message = "Please enter Movie Name")
    private String movieName;

    @NotEmpty(message = "Please enter Genre")
    private String genre;

    @NotEmpty(message = "Please enter Release Year")
    private String releaseYear;

    @NotEmpty(message = "Please enter Language")
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
    public BaseDTO getDto() {
        MovieDTO dto = new MovieDTO();
        dto.setId(id);
        dto.setMovieName(movieName);
        dto.setGenre(genre);
        dto.setReleaseYear(releaseYear);
        dto.setLanguage(language);
        return dto;
    }
}