package com.netcracker.controller;

import com.netcracker.exception.ResourceNotFoundException;
import com.netcracker.model.Contact;
import com.netcracker.repository.ContactRepository;
import com.netcracker.response.DeleteResponse;
import org.apache.catalina.startup.ClassLoaderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class ContactController {

    @Autowired
    ContactRepository repository;

    @GetMapping("/contacts")
    public List<Contact> getAllContacts(){
        return repository.findAll();
    }
    @GetMapping("/contacts/{id}")
    public ResponseEntity<Contact> getContactById(@PathVariable(value = "id") Integer id) throws ResourceNotFoundException {
        Contact contact = repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Contact not found for id: " + id));
        return ResponseEntity.ok().body(contact);
    }

    @PostMapping("/contacts")
    public Contact createContact(@RequestBody Contact contact){
        return repository.save(contact);
    }
    @DeleteMapping("/contacts/{id}")
    public ResponseEntity<DeleteResponse> deleteContact(@PathVariable(value = "id") Integer id) throws ResourceNotFoundException {
        Contact contact = repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Contact not found for id: " + id));

        repository.delete(contact);

        return ResponseEntity.ok().body(new DeleteResponse("Contact with id: " + id + " deleted"));

    }

}
