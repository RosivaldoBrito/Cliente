package br.com.mrt.cliente.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/cliente")
public interface ClienteAPI {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ClienteResponse postCadastraNovoCliente(ClienteRequest clienteRequest);
}
