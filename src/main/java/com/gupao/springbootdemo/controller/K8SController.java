package com.gupao.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class K8SController {


    @RequestMapping("/k8s")
    public String k8s(){
        return "hello leeon  welcome jenkins k8s <br/>  fd8aa521b1070d4bc2cc14458b7ee8b1";
    }
}
