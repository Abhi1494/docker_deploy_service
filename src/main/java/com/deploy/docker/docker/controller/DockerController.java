package com.deploy.docker.docker.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/docker")
public class DockerController {

    @GetMapping("/deploy")
    public String result(){
        return "demo of docker deployment.";
    }
}
