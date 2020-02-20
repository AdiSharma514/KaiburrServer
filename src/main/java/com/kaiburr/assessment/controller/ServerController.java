package com.kaiburr.assessment.controller;

import com.kaiburr.assessment.model.Server;
import com.kaiburr.assessment.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServerController {
    @Autowired
    ServerService serverService;

    @GetMapping("/servers")
    public List<Server> getAllServers(){
        return serverService.findAllServers();
    }
    @GetMapping("/server/{id}")
    public Server getServerById(@PathVariable("id") Long id){
        return serverService.findServerById(id);
    }
    @GetMapping("/server/name/{name}")
    public List<Server> getServerByName(@PathVariable("name") String name){
        return serverService.findServerByName(name);
    }

    @PostMapping("/server")
    public Server createServer(@RequestBody Server server){
        return serverService.createServer(server);
    }
    @PutMapping("/server")
    public Server updateServer(@RequestBody Server server){
        return serverService.updateServer(server);
    }

    @DeleteMapping("/server/{id}")
    public void deleteUserById(@PathVariable("id") Long id){
        serverService.deleteServer(id);
    }
}
