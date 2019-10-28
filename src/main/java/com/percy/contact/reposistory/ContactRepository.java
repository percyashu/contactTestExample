package com.percy.contact.reposistory;

import com.percy.contact.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Integer> {
}
