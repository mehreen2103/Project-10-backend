package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.LibraryDTO;

public class LibraryForm extends BaseForm {

    @NotEmpty(message = "Please enter Library Name")
    private String libraryName;

    @NotEmpty(message = "Please enter Address")
    private String address;

    @NotEmpty(message = "Please enter Total Books")
    private String totalBooks;

    @NotEmpty(message = "Please enter Contact No")
    private String contactNo;

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTotalBooks() {
        return totalBooks;
    }

    public void setTotalBooks(String totalBooks) {
        this.totalBooks = totalBooks;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public BaseDTO getDto() {
        LibraryDTO dto = new LibraryDTO();
        dto.setId(id);
        dto.setLibraryName(libraryName);
        dto.setAddress(address);
        dto.setTotalBooks(totalBooks);
        dto.setContactNo(contactNo);
        return dto;
    }
}