package com.rays.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_assignment")
public class AssignmentDTO extends BaseDTO {

    @Column(name = "title", length = 100)
    private String title;

    @Temporal(TemporalType.DATE)
    @Column(name = "due_date")
    private Date dueDate;

    @Column(name = "subject", length = 100)
    private String subject;

    @Column(name = "marks", length = 20)
    private String marks;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
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
        return "Assignment";
    }

    @Override
    public String getTableName() {
        return "assignment";
    }
}