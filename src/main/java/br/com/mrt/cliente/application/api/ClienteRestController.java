package br.com.mrt.cliente.application.api;

import br.com.mrt.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ClienteRestController implements ClienteAPI {

    private final ClienteService clienteService;

}
