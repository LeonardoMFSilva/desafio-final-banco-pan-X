package com.panacademy.grupox.bluebankx.controller;

import com.panacademy.grupox.bluebankx.model.TransacaoModel;
import com.panacademy.grupox.bluebankx.service.TransacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/transacao")
public class TransacaoController {
    @Autowired
    private TransacaoService transacao;

    @GetMapping("/{id}")
    public TransacaoModel getById(@PathVariable long id){
        return transacao.buscarPorId(id);
    }

    @PostMapping("/cadastrar")
    public String createTransaction(@RequestBody TransacaoModel transacaoModel, RedirectAttributes attr){
        transacaoModel.setDataHoraTransacao(LocalDateTime.now());
        transacao.salvar(transacaoModel);
        attr.addFlashAttribute("success", "Transação inserida com sucesso!");
        return "redirect:/";
    }

    @PutMapping("/editar")
    public String editTransaction(@RequestBody TransacaoModel transacaoModel, RedirectAttributes attr){
        transacao.editar(transacaoModel);
        attr.addFlashAttribute("success", "Transação atualizada com sucesso!");
        return "redirect:/";
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable long id, ModelMap model) {
        transacao.excluir(id);
        model.addAttribute("success", "Transação excluída com sucesso.");
        return "redirect:/";
    }

    @GetMapping("/listartodos/{id}")
    public List<TransacaoModel> listarTransacoes(@PathVariable long id){
        return transacao.listarTransacoes(id);
    }

    @GetMapping("/listartodosdata/{id}&{dataInicio}&{dataFim}")
    public List<TransacaoModel> listarTransacoesDatas(@PathVariable long id, @PathVariable String dataInicio, @PathVariable String dataFim){
         return transacao.listarTransacoesData(id, dataInicio, dataFim);
    }
}
