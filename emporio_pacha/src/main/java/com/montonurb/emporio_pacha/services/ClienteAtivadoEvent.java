package com.montonurb.emporio_pacha.services;

import com.montonurb.emporio_pacha.models.Cliente;

public class ClienteAtivadoEvent {
    private Cliente cliente;

    ClienteAtivadoEvent(Cliente cliente) {
        super();
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
