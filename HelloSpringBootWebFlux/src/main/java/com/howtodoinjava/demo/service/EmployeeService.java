package com.howtodoinjava.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayheart.hello.webflux.dao.EmployeeRepository;
import com.dayheart.hello.webflux.model.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
 
@Service
public class EmployeeService implements IEmployeeService {
     
    //@Autowired
    //EmployeeRepository employeeRepo;
 
    public void create(Employee e) {
        //employeeRepo.save(e).subscribe();
    }
 
    public Mono<Employee> findById(Integer id) {
        //return employeeRepo.findById(id);
    	return null;
    }
 
    public Flux<Employee> findByName(String name) {
        //return employeeRepo.findByName(name);
    	return null;
    }
 
    public Flux<Employee> findAll() {
        //return employeeRepo.findAll();
    	return null;
    }
 
    public Mono<Employee> update(Employee e) {
        //return employeeRepo.save(e);
    	return null;
    }
 
    public Mono<Void> delete(Integer id) {
        //return employeeRepo.deleteById(id);
    	return null;
    }
 
}