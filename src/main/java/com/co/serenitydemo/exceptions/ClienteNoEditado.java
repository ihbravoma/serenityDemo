package com.co.serenitydemo.exceptions;

public class ClienteNoEditado extends AssertionError {

    public static final String MENSAJE_CLIENTE_NO_EDITADO_CORRECTAMENTE = "El cliente no fue editado correctamente";

    public ClienteNoEditado(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }

}
