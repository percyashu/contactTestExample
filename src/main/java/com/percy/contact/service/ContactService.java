package com.percy.contact.service;

import com.percy.contact.model.Contact;
import com.percy.contact.reposistory.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactService {
    @Autowired
    private ContactRepository repository;

    public List<Contact> getContacts() {
        List<Contact> contacts = repository.findAll();
        return contacts;
    }
}
