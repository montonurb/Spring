package com.montonurb.emporio_pacha.services.listeners;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.montonurb.emporio_pacha.services.ClienteAtivadoEvent;

@Component
public class EmissaoNotaFiscalService {
    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent clienteAtivadoEvent) {
        System.out.println("Emitindo nota fiscal para cliente " + clienteAtivadoEvent.getCliente().getNome());
    }
}
