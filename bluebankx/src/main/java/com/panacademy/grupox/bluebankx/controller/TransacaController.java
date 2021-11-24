package com.panacademy.grupox.bluebankx.controller;

import com.panacademy.grupox.bluebankx.model.TransacaoModel;
import com.panacademy.grupox.bluebankx.service.ClienteService;
import com.panacademy.grupox.bluebankx.service.ContaService;
import com.panacademy.grupox.bluebankx.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/transacao")
public class TransacaController {
//    @Autowired
//    private TransacaoService transacao;
//
//    @Autowired
//    private ContaService conta;
//
//    @Autowired
//    private ClienteService cliente;
//
//    @GetMapping(path = "/cadastrar")
//    public String cadastrar(TransacaoModel transacaoModel) {
//        //return "/transacao/cadastro.html";
//        return "redirect:/transacao";
//    }
//
//    @GetMapping("/listar")
//    public String listar(ModelMap model) {
//        model.addAttribute("cargos", transacao.buscarTodos());
//        //return "/transacao/lista.html";
//        return "redirect:/transacao";
//    }
//
//    @GetMapping("/salvar")
//    public String salvar(TransacaoModel transacaoModel, RedirectAttributes attr) {
//        transacao.salvar(transacaoModel);
//        attr.addFlashAttribute("success", "Cargo inserido com sucesso");
//        return "redirect:/transacao/cadastrar";
//    }
//
//    @GetMapping("/editar/{id}")
//    public String preEditar(@PathVariable("id") Long id, ModelMap model) {
//        model.addAttribute("transacao", transacao.buscarPorId(id));
////        return "transacao/cadastro.html";
//        return "redirect:/transacao";
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "/editar")
//    public String editar(TransacaoModel transacaoModel, RedirectAttributes attr) {
//        transacao.editar(transacaoModel);
//        attr.addFlashAttribute("success", "Registro atualizado com sucesso!");
//        return "redirect:/transacao/cadastrar";
//    }
}
