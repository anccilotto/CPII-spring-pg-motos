package br.com.fiap.motos.dto.request;

import jakarta.validation.constraints.NotNull;

public record LojaRequest(

        @NotNull(message = "O nome precisa ser informado!")
        String nome
) {
}