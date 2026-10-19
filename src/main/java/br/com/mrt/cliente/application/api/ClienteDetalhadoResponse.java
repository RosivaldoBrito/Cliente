package br.com.mrt.cliente.application.api;


import br.com.mrt.cliente.domain.Cliente;
import br.com.mrt.cliente.domain.Sexo;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ClienteDetalhadoResponse {

    private String nomeCompleto;
    private String cpf;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    private LocalDateTime dataHoraCadastro;
    private LocalDateTime dataHoraAtualizacao;
    private Sexo sexo;
    private String celular;

    public ClienteDetalhadoResponse(Cliente cliente) {
        this.nomeCompleto = cliente.getNomeCompleto();
        this.cpf = cliente.getCpf();
        this.email = cliente.getEmail();
        this.telefone = cliente.getTelefone();
        this.dataNascimento = cliente.getDataNascimento();
        this.dataHoraCadastro = cliente.getDataHoraCadastro();
        this.dataHoraAtualizacao = cliente.getDataHoraAtualizacao();
        this.sexo = cliente.getSexo();
        this.celular = cliente.getCelular();

    }
}
