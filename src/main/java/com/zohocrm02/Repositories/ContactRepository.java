package com.zohocrm02.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zohocrm02.enities.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
//inheritance is done
}
