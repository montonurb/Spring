package com.montonurb.emporio_pacha.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.montonurb.emporio_pacha.models.Cliente;

@Component
public class AtivacaoClienteServico {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void ativar(Cliente cliente) {
        cliente.ativar();
        applicationEventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
    }
}
