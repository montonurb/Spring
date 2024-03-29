package com.montonurb.emporio_pacha.notifications;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.montonurb.emporio_pacha.enums.NivelUrgencia;
import com.montonurb.emporio_pacha.models.Cliente;

@Component
@TipoNotificador(NivelUrgencia.URGENTE)
@Profile("producao")
public class NotificadorEmail implements Notificador {
    
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s: %s",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
 