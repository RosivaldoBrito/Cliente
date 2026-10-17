package br.com.mrt.cliente.application.api;

import br.com.mrt.cliente.application.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Log4j2
public class ClienteRestController implements ClienteAPI {

    private final ClienteService clienteService;


    @Override
    public ClienteResponse postCadastraNovoCliente(@Valid ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteRestController - postCadastraNovoCliente");
        ClienteResponse cliente= clienteService.cadastraNovoCliente(clienteRequest);
        log.info("[finaliza] ClienteRestController - postCadastraNovoCliente");
        return cliente;
    }

    @Override
    public List<ClienteListResponse> getListaTodosClientes() {
        log.info("[inicia] ClienteRestController - getListaTodosClientes ");
        List<ClienteListResponse> listaCliente = clienteService.listaTodosClientes();
        log.info("[finaliza] ClienteRestController - getListaTodosClientes ");
        return listaCliente;
    }

    @Override
    public ClienteDetalhadoResponse getBuscaClientePorID(UUID idCliente) {
        log.info("[inicia] ClienteRestController - getBuscaClientePorID");
        ClienteDetalhadoResponse detalhado = clienteService.buscaClientePorId(idCliente);
        log.info("[finalizado] ClienteRestController - getBuscaClientePorID");
        return detalhado;
    }

    @Override
    public void patchAlteraDadosCLiente(UUID idCliente, ClienteAlteradoRequest clienteAlteradoRequest) {
        log.info("[inicia] ClienteRestController - patchAlteraDadosCliente");
        clienteService.alteraDadosCliente(idCliente, clienteAlteradoRequest);
        log.info("[finalizado] ClienteRestController - patchAlteraDadosCliente");
    }

    @Override
    public void deleteClientePorID(UUID idCliente) {
        log.info("[inicia] ClienteRestController - deleteClientePorID");
        clienteService.deletaClientePorId(idCliente);
        log.info("[finaliza] ClienteRestController - deleteClientePorID");
    }
}
