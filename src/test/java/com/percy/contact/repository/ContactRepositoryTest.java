package com.percy.contact.repository;

import com.percy.contact.model.Contact;
import com.percy.contact.reposistory.ContactRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@DataJpaTest
@RunWith(SpringRunner.class)
public class ContactRepositoryTest {
    @Autowired
    private ContactRepository repository;

    @Test
    public void contactRepositoryTestFromDataFile(){
        List<Contact> contacts = repository.findAll();
        assertEquals((new Contact(1,"Joan",687984563)).toString(),contacts.get(0).toString());
        assertEquals(2,contacts.size());

    }


}