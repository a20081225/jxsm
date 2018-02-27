package com.yw.jxsm.dao.impl;

import com.yw.jxsm.dao.FactoryDao;
import com.yw.jxsm.domain.Factory;
import org.springframework.stereotype.Repository;

@Repository
public class FactoryDaoImpl extends BaseDaoImpl<Factory> implements FactoryDao{
    public FactoryDaoImpl(){
        super.setNs("com.yw.jxsm.mapper.FactoryMapper");
    }
}
