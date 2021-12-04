package com.panacademy.grupox.bluebankx.controller;

import com.panacademy.grupox.bluebankx.model.EnderecoModel;
import com.panacademy.grupox.bluebankx.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@RequestMapping("/enderecos")
public class EnderecosController {

    @Autowired
    private EnderecoService endereco;

    @GetMapping("/{id}")
    public EnderecoModel getById(@PathVariable long id){
        return endereco.buscarPorId(id);
    }

    @GetMapping("/endereco/{nome}")
    public ResponseEntity<EnderecoModel> getByNome(@PathVariable String nome){
        //todo
        return null;
    }

    @PostMapping("/cadastrar")
    public String createAddress(@RequestBody EnderecoModel enderecoModel, RedirectAttributes attr){
        endereco.salvar(enderecoModel);
        attr.addFlashAttribute("success", "Endereco inserido com sucesso!");
        return "redirect:/clientes/cadastrar";
    }

    @PutMapping("/editar")
    public String editAddress(@RequestBody EnderecoModel enderecoModel, RedirectAttributes attr){
        endereco.editar(enderecoModel);
        attr.addFlashAttribute("success", "Endereco inserido com sucesso!");
        return "redirect:/enderecos/editar";
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable long id, ModelMap model) {
        endereco.excluir(id);
        model.addAttribute("success", "Endereco excluído com sucesso.");
        return "redirect:/home";
    }



}

