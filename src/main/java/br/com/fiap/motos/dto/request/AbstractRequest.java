package br.com.fiap.motos.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record AbstractRequest(
        @Positive(message = "O Id precisa ser um número positivo!")
        @NotNull(message = " Id Obrigatório!")
        Long id
) {
}
