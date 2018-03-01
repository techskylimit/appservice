package com.shinchan.demo.controller;


import com.shinchan.demo.model.Shinchanlist;
import com.shinchan.demo.repository.ShinchanlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/shinchanlist")
public class ShinchanlistController {

    @Autowired
    ShinchanlistRepository shinchanlistRepository;

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> create(@RequestBody Shinchanlist shinchanlist){
        shinchanlistRepository.save(shinchanlist);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
                "/{id}").buildAndExpand(shinchanlist.getId()).toUri();

        return ResponseEntity.created(location).build();
    }


    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Shinchanlist shinchanlist){
        shinchanlistRepository.save(shinchanlist);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id){
        shinchanlistRepository.delete(id);
    }
}
