package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.BookDTO;

public class BookForm extends BaseForm {

    @NotEmpty(message = "Please enter Title")
    private String title;

    @NotEmpty(message = "Please enter Author")
    private String author;

    @NotEmpty(message = "Please enter Price")
    private String price;

    @NotEmpty(message = "Please enter Publication Year")
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
    public BaseDTO getDto() {
        BookDTO dto = new BookDTO();
        dto.setId(id);
        dto.setTitle(title);
        dto.setAuthor(author);
        dto.setPrice(price);
        dto.setPublicationYear(publicationYear);
        return dto;
    }
}