package com.montonurb.emporio_pacha.notifications;

import com.montonurb.emporio_pacha.models.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
