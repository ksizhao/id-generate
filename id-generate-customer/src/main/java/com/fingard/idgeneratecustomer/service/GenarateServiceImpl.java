package com.fingard.idgeneratecustomer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import fingard.api.IdGenerateApi;
import fingard.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author zhaolc
 * @version 1.0
 * @description TODO
 * @createTime 2020年08月21日 11:17:00
 */
@Component
public class GenarateServiceImpl implements GenarateService{


    @Reference(version = "1.0.0", registry = "${dubbo.registry.address}")
    private IdGenerateApi idGenerateApi;

    @Override
    public Result getID() {
        Result result=idGenerateApi.getId("test");
        return result;
    }


    @Scheduled(fixedRate = 3000)
    public void init(){
        getID();
    }
}
