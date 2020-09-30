package com.sankuai.inf.leaf.server.api.impl;

import com.sankuai.inf.leaf.server.service.SnowflakeService;
import fingard.api.IdGenerateApi;
import fingard.entity.Result;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhaolc
 * @version 1.0
 * @description TODO
 * @createTime 2020年08月31日 16:01:00
 */
@Service
public class LeafProvider implements IdGenerateApi {


    @Autowired
    private SnowflakeService snowflakeService;


    @Override
    public Result getId(String s) {
        return snowflakeService.getId(s);
    }

//    @PostConstruct
//    public void init(){
//        long start=System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            Result result=snowflakeService.getId("test");
//            System.out.println("ID="+result.getId());
//        }
//        long end=System.currentTimeMillis();
//        System.out.println("耗时"+(end-start)+"毫秒");
//    }

}
