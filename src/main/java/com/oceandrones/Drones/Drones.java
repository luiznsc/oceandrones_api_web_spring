package com.oceandrones.Drones;

public enum Drones {
    IBUBBLE("Ibubble - Capacidade mergulho 60m, sem fio, controle remoto, bateria 1h, dimensões 60cm x 45cm 35cm"),
    DTG3ROV("DTG3 Rov - Capacidade mergulho 200m, com fio, bateria 12h"),
    GLADIUSMINI("Gladius Mini - Capacidade mergulho 100m, sem fio, controle remoto, bateria 2h, dimensões 385 x 226 x 138mm"),
    POWERRAY("PowerRay - Capacidade mergulho 30m, sem fio, controle remoto, bateria 4h, dimensões 50cm x 40cm x 30cm"),
    TITANGENEINNO("Titan Geneinno - Capacidade mergulho 150m, com/sem fio, controle remoto, qualidade img 4k, dimensões 90 x 374 x 165");

    private String descricao;

    Drones(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
