package br.com.fiap.motos.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.Year;

public record VeiculoRequest(
        @Valid @NotNull(message = "O tipo precisa ser informado!")
        AbstractRequest tipo,

        @Valid @NotNull(message = "O fabricante precisa ser informado!")
        AbstractRequest fabricante,

        @Positive(message = "O preço precisa ser um número positivo!")
        @NotNull(message = "O preço precisa ser informado!")
        Double preco,

        @NotNull(message = "O modelo precisa ser informado!")
        String modelo,

        @NotNull(message = "O ano precisa ser informado!")
        Year anoDeFabricacao,

        @NotNull(message = "O nome precisa ser informado!")
        String nome,

        @NotNull(message = "A cor precisa informada!")
        String cor,

        @NotNull(message = "A palavra de efeito precisa ser informada!")
        String palavraDeEfeito,

        @Positive(message = "As cilindradas precisão ser um número positivo")
        @NotNull(message = "As cilindradas precisão ser informadas!")
        Short cilindradas
) {
}
