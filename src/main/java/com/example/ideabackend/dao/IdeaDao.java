package com.example.ideabackend.dao;

import com.example.ideabackend.base.BaseDao;
import com.example.ideabackend.model.Idea;
import org.springframework.stereotype.Component;

@Component(value = "ideaDao")
public interface IdeaDao extends BaseDao<Idea> {
}
