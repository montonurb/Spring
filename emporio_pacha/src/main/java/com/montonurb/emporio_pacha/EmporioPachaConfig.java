package com.montonurb.emporio_pacha;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.montonurb.emporio_pacha.notifications.NotificadorEmail;
import com.montonurb.emporio_pacha.services.AtivacaoClienteServico;

@Configuration
public class EmporioPachaConfig {
    @Bean
    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificador = new NotificadorEmail("smtp.montonurb.com");
        notificador.setCaixaAlta(false);
        return notificador;
    }

    @Bean
    public AtivacaoClienteServico ativacaoClienteServico() {
        return new AtivacaoClienteServico(notificadorEmail());
    }
}
