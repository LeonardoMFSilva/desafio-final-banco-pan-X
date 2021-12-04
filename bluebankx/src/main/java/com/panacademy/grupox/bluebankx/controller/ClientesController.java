package com.panacademy.grupox.bluebankx.controller;


import com.panacademy.grupox.bluebankx.config.AWSSNSController;
import com.panacademy.grupox.bluebankx.dto.ClienteDTO;
import com.panacademy.grupox.bluebankx.model.ClienteModel;
import com.panacademy.grupox.bluebankx.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClienteService cliente;

    @Autowired
    private AWSSNSController awssnsController;

    @GetMapping("/{id}")
    public ClienteModel getById(@PathVariable long id){
        return cliente.buscarPorId(id);
    }

    @GetMapping("/listar")
    public List<ClienteModel> getByNome(){
        return cliente.buscarTodos();
    }

    @PostMapping ("/cadastrar")
    public String createUser(@RequestBody ClienteDTO clienteDTO, RedirectAttributes attr){
        cliente.salvar(clienteDTO.criarCliente());
        awssnsController.addSubscription(clienteDTO.getEmail());
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
    public String deleteById(@PathVariable long id, ModelMap model) {
        cliente.excluir(id);
        model.addAttribute("success", "Cliente excluído com sucesso.");
        return "redirect:/home";
    }
}

