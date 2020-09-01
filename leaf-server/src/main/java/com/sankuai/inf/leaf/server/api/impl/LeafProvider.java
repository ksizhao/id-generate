package com.sankuai.inf.leaf.server.api.impl;

import com.sankuai.inf.leaf.server.service.SnowflakeService;
import fingard.api.IdGenerateApi;
import fingard.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author zhaolc
 * @version 1.0
 * @description TODO
 * @createTime 2020年08月31日 16:01:00
 */
@Service("leafProvider")
public class LeafProvider implements IdGenerateApi {


    @Autowired
    private SnowflakeService snowflakeService;


    @Override
    public Result getId(String s) {
        return snowflakeService.getId(s);
    }
}
