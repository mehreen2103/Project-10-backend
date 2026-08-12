package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_library")
public class LibraryDTO extends BaseDTO {

    @Column(name = "library_name", length = 100)
    private String libraryName;

    @Column(name = "address", length = 255)
    private String address;

    @Column(name = "total_books", length = 20)
    private String totalBooks;

    @Column(name = "contact_no", length = 15)
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
    public String getValue() {
        return libraryName;
    }

    @Override
    public String getUniqueKey() {
        return "libraryName";
    }

    @Override
    public String getUniqueValue() {
        return libraryName;
    }

    @Override
    public String getLabel() {
        return "Library";
    }

    @Override
    public String getTableName() {
        return "library";
    }
}