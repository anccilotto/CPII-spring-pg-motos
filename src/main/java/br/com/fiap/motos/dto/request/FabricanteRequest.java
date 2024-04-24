package br.com.fiap.motos.dto.request;

import jakarta.validation.constraints.NotNull;

public record FabricanteRequest(
        @NotNull(message = "O nome precisa ser informado!")
        String nome,

        @NotNull(message = "O nome de fantasia precisa ser informado!")
        String nomeFantasia
) {
}
