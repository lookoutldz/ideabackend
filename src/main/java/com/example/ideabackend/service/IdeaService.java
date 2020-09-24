package com.example.ideabackend.service;

import com.example.ideabackend.model.Idea;
import com.github.pagehelper.PageInfo;

public interface IdeaService {
    Integer create(Idea idea);
    Integer update(Idea idea);
    PageInfo<Idea> find(Integer pageNum, Integer pageSize);
}
