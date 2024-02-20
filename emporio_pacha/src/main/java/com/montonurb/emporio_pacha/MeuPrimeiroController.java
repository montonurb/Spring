package com.montonurb.emporio_pacha;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.montonurb.emporio_pacha.models.Cliente;
import com.montonurb.emporio_pacha.services.AtivacaoClienteServico;

@Controller
public class MeuPrimeiroController {
    private AtivacaoClienteServico ativacaoClienteServico;

    public MeuPrimeiroController(AtivacaoClienteServico ativacaoClienteServico) {
        this.ativacaoClienteServico = ativacaoClienteServico;
        System.out.println("Construtor MeuPrimeiroController");
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente cliente = new Cliente("Joao", "joao@email.com", "(86) 9 9910-9865");
        ativacaoClienteServico.ativar(cliente);
        return "Hello, Montonurb!";
    }
}
