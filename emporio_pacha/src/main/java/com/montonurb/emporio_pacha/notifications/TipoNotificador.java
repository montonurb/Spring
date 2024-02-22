package com.montonurb.emporio_pacha.notifications;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

import com.montonurb.emporio_pacha.enums.NivelUrgencia;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface TipoNotificador {
    NivelUrgencia value();
}
