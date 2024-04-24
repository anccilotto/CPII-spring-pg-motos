package br.com.fiap.motos.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record CaracteristicaRequest(
        @Valid @NotNull(message = "É preciso informar o veículo!")
        AbstractRequest veiculo,

        @NotNull(message = "O nome precisa ser informado!")
        String nome,

        @NotNull(message = "A descrição precisa ser informada!")
        String descricao
) {
}