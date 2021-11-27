package com.panacademy.grupox.bluebankx.controller;

import com.panacademy.grupox.bluebankx.model.ContaModel;
import com.panacademy.grupox.bluebankx.model.EnderecoModel;
import com.panacademy.grupox.bluebankx.model.TransacaoModel;
import com.panacademy.grupox.bluebankx.service.ClienteService;
import com.panacademy.grupox.bluebankx.service.ContaService;
import com.panacademy.grupox.bluebankx.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/transacao")
public class TransacaController {
    @Autowired
    private TransacaoService transacao;

//    @Autowired
//    private ContaService conta;
//
    @Autowired
    private ClienteService cliente;

    @GetMapping("/{id}")
    public TransacaoModel getById(@PathVariable long id){
        return transacao.buscarPorId(id);
    }

//    @GetMapping("/contas/{nome}")
//    public ResponseEntity<TransacaoModel> getByNome(@PathVariable String nome){
//        //todo
//        return null;
//    }

    @PostMapping("/cadastrar")
    public String createUser(@RequestBody TransacaoModel transacaoModel, RedirectAttributes attr){
        transacao.salvar(transacaoModel);
        attr.addFlashAttribute("success", "Transação inserida com sucesso!");
        return "redirect:/contas/cadastrar";
    }

    @PutMapping("/editar")
    public String editUser(@RequestBody TransacaoModel transacaoModel, RedirectAttributes attr){
        transacao.editar(transacaoModel);
        attr.addFlashAttribute("success", "Transação atualizada com sucesso!");
        return "redirect:/contas/editar";
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable long id, ModelMap model) {
        transacao.excluir(id);
        model.addAttribute("success", "Transação excluída com sucesso.");
        return "redirect:/home";
    }
}
