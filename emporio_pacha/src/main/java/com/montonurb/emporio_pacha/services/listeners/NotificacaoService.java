package com.montonurb.emporio_pacha.services.listeners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.montonurb.emporio_pacha.enums.NivelUrgencia;
import com.montonurb.emporio_pacha.notifications.Notificador;
import com.montonurb.emporio_pacha.notifications.TipoNotificador;
import com.montonurb.emporio_pacha.services.ClienteAtivadoEvent;

@Component
public class NotificacaoService {

    @TipoNotificador(NivelUrgencia.URGENTE)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
    }
}
