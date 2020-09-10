package com.fingard.idgeneratecustomer.controller;

import com.fingard.idgeneratecustomer.service.GenarateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaolc
 * @version 1.0
 * @description TODO
 * @createTime 2020年09月01日 19:14:00
 */
@RestController
@RequestMapping("api/id")
public class IdController {

    @Autowired
    private GenarateService genarateService;

    @GetMapping("/getID")
    public String getID(){
        return String.valueOf(genarateService.getID().getId());
    }


}
