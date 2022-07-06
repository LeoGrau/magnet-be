package com.finalexam.si652ebu_u201823031.magnetart.api.controller;


import com.finalexam.si652ebu_u201823031.magnetart.domain.service.IdeaService;
import com.finalexam.si652ebu_u201823031.magnetart.resource.IdeaResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ideas")
public class IdeaController {

    @Autowired
    IdeaService ideaService;

    @GetMapping("/all")
    public ResponseEntity<List<IdeaResource>> getAll(){
        return new ResponseEntity<>(ideaService.getAllIdeas(), HttpStatus.OK);
    }
    @GetMapping("/{author_id}")
    public ResponseEntity<IdeaResource> getIdeaByAuthorId(@PathVariable("author_id") long authorId){
        return ideaService.getIdeaByAuthorId(authorId)
                .map(ideaResource -> new ResponseEntity<>(ideaResource, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/create")
    public ResponseEntity<IdeaResource> createNewIdea(@RequestBody IdeaResource ideaResource){
        return new ResponseEntity<>(ideaService.createNewIdea(ideaResource), HttpStatus.CREATED);
    }
}
