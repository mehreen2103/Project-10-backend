package com.rays.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.AssignmentDTO;

public class AssignmentForm extends BaseForm {

    @NotEmpty(message = "Please enter Title")
    private String title;

    @NotNull(message = "Please select Due Date")
    private Date dueDate;

    @NotEmpty(message = "Please enter Subject")
    private String subject;

    @NotEmpty(message = "Please enter Marks")
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
    public BaseDTO getDto() {

        AssignmentDTO dto = new AssignmentDTO();

        dto.setId(id);
        dto.setTitle(title);
        dto.setDueDate(dueDate);
        dto.setSubject(subject);
        dto.setMarks(marks);

        return dto;
    }
}