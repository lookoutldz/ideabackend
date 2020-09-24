package com.example.ideabackend.controller;

import com.example.ideabackend.model.Idea;
import com.example.ideabackend.service.IdeaService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api
@RestController(value = "ideaController")
@RequestMapping("/idea")
@CrossOrigin
public class IdeaController {

    @Autowired
    private IdeaService ideaService;

    @Operation
    @PostMapping("")
    private Idea create(@RequestBody Idea idea) {
        ideaService.create(idea);
        return idea;
    }

    @Operation
    @PutMapping
    private Idea update(@RequestBody Idea idea) {
        Integer row = ideaService.update(idea);
        return row > 0 ? idea : null;
    }

    @Operation
    @GetMapping
    private PageInfo<Idea> find(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize) {
        return ideaService.find(pageNum, pageSize);
    }
}
