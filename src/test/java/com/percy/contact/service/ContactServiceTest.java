package com.percy.contact.service;

import com.percy.contact.reposistory.ContactRepository;
import com.percy.contact.model.Contact;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ContactServiceTest {
    @InjectMocks
    private  ContactService service;
    @Mock
    ContactRepository repository;

    @Test
    public void retrieveAllContactsService() {
        when(repository.findAll()).thenReturn(Arrays.asList(
                new Contact(1,"Paul",678964532),
                new Contact(2,"Peter",678964533)));
        List<Contact> contacts =service.getContacts();
        assertEquals( "Paul",contacts.get(0).getName());
        assertEquals( (new Contact(2,"Peter",678964533)).toString(),contacts.get(1).toString());
    }
}