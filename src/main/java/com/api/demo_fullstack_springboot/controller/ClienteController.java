package com.api.demo_fullstack_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.demo_fullstack_springboot.model.Cliente;
import com.api.demo_fullstack_springboot.repository.ClienteRepository;

@RestController
public class ClienteController {

    @Autowired
    public ClienteRepository clienteRepository;

    // http://localhost:8080/
    @GetMapping("/")
    public String testController() {
        return "Testando rest controller";
    }

    // http://localhost:8080/create
    @PostMapping("/create")
    public Cliente cadastrar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // http://localhost:8080/selecionar
    @GetMapping("/selecionar")
    public Iterable<Cliente> selecionarTodos() {
        return clienteRepository.findAll();
    }

    // http://localhost:8080/editar
    @PutMapping("/editar")
    public Cliente editar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // http://localhost:8080/deletar
    @DeleteMapping("/deletar/{id}")
    public void deletar(@PathVariable("id") Long id) {
        clienteRepository.deleteById(id);
    }

}
