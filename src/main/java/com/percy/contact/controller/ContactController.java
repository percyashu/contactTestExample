package com.percy.contact.controller;

import com.percy.contact.model.Contact;
import com.percy.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {
    @Autowired
    private ContactService service;

    @GetMapping("/contacts")
    public List<Contact> retrieveAll(){
        return service.getContacts();
    }
}
