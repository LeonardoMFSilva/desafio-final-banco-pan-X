package com.panacademy.grupox.bluebankx.controller;

import com.panacademy.grupox.bluebankx.model.ContaModel;
import com.panacademy.grupox.bluebankx.model.EnderecoModel;
import com.panacademy.grupox.bluebankx.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@RequestMapping("/contas")
public class ContasController {

    @Autowired
    private ContaService conta;

    @GetMapping("/{id}")
    public ContaModel getById(@PathVariable long id){
        return conta.buscarPorId(id);
    }

    @GetMapping("/contas/{nome}")
    public ResponseEntity<ContaModel> getByNome(@PathVariable String nome){
        //todo
        return null;
    }

    @PostMapping("/cadastrar")
    public String createUser(@RequestBody ContaModel contaModel, RedirectAttributes attr){
        contaModel.setNumConta(contaModel.gerarNumConta());
        conta.salvar(contaModel);
        attr.addFlashAttribute("success", "Conta inserida com sucesso!");
        return "redirect:/contas/cadastrar";
    }

    @PutMapping("/editar")
    public String editUser(@RequestBody ContaModel contaModel, RedirectAttributes attr){
        conta.editar(contaModel);
        attr.addFlashAttribute("success", "Conta atualizada com sucesso!");
        return "redirect:/contas/editar";
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable long id, ModelMap model) {
        conta.excluir(id);
        model.addAttribute("success", "Conta excluída com sucesso.");
        return "redirect:/home";
    }

}
