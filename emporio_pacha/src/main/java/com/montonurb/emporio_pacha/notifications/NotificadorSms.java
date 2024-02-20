package com.montonurb.emporio_pacha.notifications;

import com.montonurb.emporio_pacha.models.Cliente;

public class NotificadorSms implements Notificador {
    
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do telefone %s através de %s: %s",
                cliente.getNome(), cliente.getTelefone(), mensagem);
        
    }
}
