package com.zhm.o2o.dao;

import com.zhm.o2o.BaseTest;
import com.zhm.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class AreaDaoTest extends BaseTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea(){
        List<Area> areas = areaDao.queryArea();
        System.out.print(areas);
    }
}
