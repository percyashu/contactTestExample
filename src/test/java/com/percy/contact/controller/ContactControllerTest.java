package com.percy.contact.controller;


import com.percy.contact.model.Contact;
import com.percy.contact.service.ContactService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ContactController.class)
public class ContactControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private ContactService service;


    @Test
    public void retrieveAllContactsControllerTest() throws Exception {
        when(service.getContacts()).thenReturn(Arrays.asList(
                new Contact(1,"Pope",678964532),
                new Contact(2,"John",678964533)
        ));
        RequestBuilder builder = MockMvcRequestBuilders
                .get("/contacts")
                .accept(MediaType.APPLICATION_JSON);
        MvcResult result =mockMvc.perform(builder)
                .andExpect(status().isOk())
                .andExpect(content().json("[{id:1,name:Pope,phoneNumber:678964532},{id:2,name:John,phoneNumber:678964533}]"))
                .andReturn();

    }


}
