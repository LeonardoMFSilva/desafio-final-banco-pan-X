package com.panacademy.grupox.bluebankx.controller;


import com.panacademy.grupox.bluebankx.model.ClienteModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    //TODO criar @autowired com a DAO ou a repository

    @GetMapping("/{id}")
    public ResponseEntity<ClienteModel> getById(@PathVariable long id){
        return null;
    }

    @GetMapping("/cliente/{nome}")
    public ResponseEntity<ClienteModel> getByNome(@PathVariable String nome){
        return null;
    }

    @PostMapping ("/cadastrar")
    public ResponseEntity<ClienteModel> createUser(@RequestBody ClienteModel clienteModel){
        return null;
    }

    @PutMapping("/editar")
    public ResponseEntity<ClienteModel> editUser(@RequestBody ClienteModel clienteModel){
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {

    }

}

