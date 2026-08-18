package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_book")
public class BookDTO extends BaseDTO {

    @Column(name = "title", length = 100)
    private String title;

    @Column(name = "author", length = 100)
    private String author;

    @Column(name = "price", length = 20)
    private String price;

    @Column(name = "publication_year", length = 20)
    private String publicationYear;
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String getValue() {
        return title;
    }

    @Override
    public String getUniqueKey() {
        return "title";
    }

    @Override
    public String getUniqueValue() {
        return title;
    }

    @Override
    public String getLabel() {
        return "Book";
    }

    @Override
    public String getTableName() {
        return "book";
    }
}