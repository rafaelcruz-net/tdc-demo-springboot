package com.codersinrio.demo.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import com.codersinrio.demo.model.Contact;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {

    Contact findByName(String name);

    @Override
    List<Contact> findAll();

}