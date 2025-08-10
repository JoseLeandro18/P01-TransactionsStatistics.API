package Projeto01.Transactions_API.model;

import java.time.OffsetDateTime;

public class Transaction {
    private Double valor;
    private OffsetDateTime dataHora;

    public Transaction(Double valor, OffsetDateTime dataHora){
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public Double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}
