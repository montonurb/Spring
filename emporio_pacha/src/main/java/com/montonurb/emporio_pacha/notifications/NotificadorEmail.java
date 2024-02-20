package com.montonurb.emporio_pacha.notifications;

import org.springframework.stereotype.Component;

import com.montonurb.emporio_pacha.models.Cliente;

@Component
public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificadorEmail(String hostServidorSmtp){
        this.hostServidorSmtp = hostServidorSmtp;

        System.out.println("Notificador Email!");
    }
    
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        if(this.caixaAlta) {
            mensagem = mensagem.toUpperCase();
        }
        System.out.printf("Notificando %s através do e-mail %s através de %s: %s",
                cliente.getNome(), cliente.getEmail(), hostServidorSmtp, mensagem);
    }

    public boolean getCaixaAlta() {
        return caixaAlta;
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }
}
 