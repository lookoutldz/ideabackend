package com.example.ideabackend.serviceimpl;

import com.example.ideabackend.dao.IdeaDao;
import com.example.ideabackend.model.Idea;
import com.example.ideabackend.service.IdeaService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "ideaService")
public class IdeaServiceImpl implements IdeaService {

    @Autowired
    private IdeaDao ideaDao;

    @Override
    public Integer create(Idea idea) {
        return ideaDao.insertUseGeneratedKeys(idea);
    }

    @Override
    public Integer update(Idea idea) {
        return ideaDao.updateByPrimaryKey(idea);
    }

    @Override
    public PageInfo<Idea> find(Integer pageNum, Integer pageSize) {
        return PageHelper.startPage(pageNum, pageSize).doSelectPageInfo(() -> ideaDao.selectAll());
    }
}
