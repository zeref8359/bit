package com.javasampleapproach.gemfirerestapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.javasampleapproach.gemfirerestapi.model.Customer;

@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	Customer findByFirstname(@Param("firstname") String firstname);
    Customer findByLastname(@Param("lastname") String lastname);
    Iterable<Customer> findByAgeGreaterThan(@Param("age") int age);
    Iterable<Customer> findByAgeLessThan(@Param("age") int age);
}