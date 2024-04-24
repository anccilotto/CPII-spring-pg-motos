package br.com.fiap.motos.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record AcessorioRequest(
        @NotNull(message = "O nome precisa ser informado!")
        String nome,

        @Positive(message = "O preço precisa ser um número positivo!")
        @NotNull(message = "O preço precisa ser informado!")
        Double preco
) {
}
