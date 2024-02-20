package com.montonurb.emporio_pacha.services;

import org.springframework.stereotype.Component;
import com.montonurb.emporio_pacha.models.Cliente;
import com.montonurb.emporio_pacha.notifications.Notificador;

@Component
public class AtivacaoClienteServico {
    private Notificador notificador;

    public AtivacaoClienteServico(Notificador notificador) {
        this.notificador = notificador;
        System.out.println("Construtor Ativacao Cliente");
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
