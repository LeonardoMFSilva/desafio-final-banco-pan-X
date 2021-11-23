package com.panacademy.grupox.bluebankx.controller;


import com.panacademy.grupox.bluebankx.dao.ClienteDao;
import com.panacademy.grupox.bluebankx.model.ClienteModel;
import com.panacademy.grupox.bluebankx.service.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClienteServiceImpl cliente;

    @PersistenceContext
    private EntityManager entityManager;

    protected EntityManager getEntityManager(){
        return entityManager;
    }

    @GetMapping("/{id}")
    public ClienteModel getById(@PathVariable long id){
        return cliente.buscarPorId(id);
    }

    @GetMapping("/cliente/{nome}")
    public ResponseEntity<ClienteModel> getByNome(@PathVariable String nome){
        return null;
    }

//    @PostMapping ("/cadastrar")
//    public ClienteModel createUser(ClienteModel clienteModel, RedirectAttributes attr){
//        cliente.salvar(clienteModel);
//        attr.addFlashAttribute("success", "Departamento inserido com sucesso!");
//        return "redirect:/departamentos/cadastrar";
//    }

    @PostMapping ("/cadastrar")
    public String createUser(@RequestBody ClienteModel clienteModel, RedirectAttributes attr){
        cliente.salvar(clienteModel);
        attr.addFlashAttribute("success", "Cliente inserido com sucesso!");
        return "redirect:/clientes/cadastrar";
    }

    @PutMapping("/editar")
    public String editUser(@RequestBody ClienteModel clienteModel, RedirectAttributes attr){
        cliente.editar(clienteModel);
        attr.addFlashAttribute("success", "Cliente inserido com sucesso!");
        return "redirect:/clientes/editar";
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {

    }

}

