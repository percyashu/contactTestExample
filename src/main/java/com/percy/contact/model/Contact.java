package com.percy.contact.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@ToString
public class Contact {
    @Id
    private Integer id;

    private String name;
    @Size(min = 9,max = 9)
    private Integer phoneNumber;

    public Contact(Integer id, String name, @Size(min = 9, max = 9) Integer phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact() {
    }
}
