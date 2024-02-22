package com.montonurb.emporio_pacha.notifications;

import org.springframework.stereotype.Component;

import com.montonurb.emporio_pacha.enums.NivelUrgencia;
import com.montonurb.emporio_pacha.models.Cliente;

@Component
@TipoNotificador(NivelUrgencia.NORMAL)
public class NotificadorSms implements Notificador {
    
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do telefone %s: %s",
                cliente.getNome(), cliente.getTelefone(), mensagem);
        
    }
}
