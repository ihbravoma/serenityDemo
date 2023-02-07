package com.co.serenitydemo.exceptions;

public class ClienteNoCreado extends AssertionError {

    public static final String MENSAJE_CLIENTE_NO_CREADO_CORRECTAMENTE = "El cliente no fue creado correctamente";

    public ClienteNoCreado(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
