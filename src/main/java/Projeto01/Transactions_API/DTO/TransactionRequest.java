package Projeto01.Transactions_API.DTO;

import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public class TransactionRequest {
    @NotNull
    private Double valor;

    @NotNull
    private OffsetDateTime dataHora;

    public Double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}
