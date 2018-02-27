package com.yw.jxsm.service.impl;

import com.yw.jxsm.dao.FactoryDao;
import com.yw.jxsm.domain.Factory;
import com.yw.jxsm.pagination.Page;
import com.yw.jxsm.service.FactoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Service
public class FactoryServiceImpl implements FactoryService{

    @Resource
    FactoryDao factoryDao;

    public List<Factory> findPage(Page page) {
        return null;
    }

    public List<Factory> find(Map paraMap) {
        return factoryDao.find(paraMap);
    }

    public Factory get(Serializable id) {
        return null;
    }

    public void insert(Factory factory) {

    }

    public void update(Factory factory) {

    }

    public void deleteById(Serializable id) {

    }

    public void delete(Serializable[] ids) {

    }
}
