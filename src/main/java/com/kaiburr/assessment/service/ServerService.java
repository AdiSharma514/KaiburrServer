package com.kaiburr.assessment.service;

import com.kaiburr.assessment.model.Server;
import com.kaiburr.assessment.repository.Repository;
import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
//import java.util.Optional;

@Service
@Slf4j
public class ServerService {
    @Autowired
    Repository serverRepository;

    public List<Server> findAllServers(){
         List<Server> servers=serverRepository.findAll();
        if(servers.size()!=0) {
            return servers;
        }
        else{
            throw new IllegalIdentifierException("404");
        }
    }
    public List<Server> findServerByName(String name){
        List<Server> servers= serverRepository.findByName(name);
        if(servers.size()!=0) {
            return servers;
        }
        else{
            throw new IllegalIdentifierException("404");
        }
    }
    public Server findServerById(Long id){
        Optional<Server> serverOptional =serverRepository.findById(id);
        if(serverOptional.isPresent()){
            log.debug("{}",serverOptional.get());
        }else{
            throw new IllegalIdentifierException("404");
        }
        return serverOptional.get();
    }
    public Server createServer(Server server){
        serverRepository.save(server);
        return server;
    }

    public Server updateServer(Server server){
        Optional<Server> serverOptional =serverRepository.findById(server.getId());
        if(serverOptional.isPresent()){
            serverRepository.save(server);
            return serverOptional.get();
        }else {
            throw new IllegalIdentifierException("404");
        }
    }

    public void deleteServer(Long id){
        Optional<Server> serverOptional =serverRepository.findById(id);
        if(serverOptional.isPresent()){
            serverRepository.deleteById(id);
        }
        else{
            throw new IllegalIdentifierException("404");
        }
    }

}
