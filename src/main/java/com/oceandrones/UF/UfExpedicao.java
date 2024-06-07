package com.oceandrones.UF;

public enum UfExpedicao {
    AM("Amazonas"),
    PR("Paraná"),
    PE("Pernambuco"),
    RJ("Rio de Janeiro"),
    RS("Rio Grande do Sul"),
    SC("Santa Catarina"),
    SP("São Paulo");

    private final String ufdescricao;

    UfExpedicao(String ufdescricao) {
        this.ufdescricao = ufdescricao;
    }

    public String getUfDescricao() {
        return ufdescricao;
    }
}
