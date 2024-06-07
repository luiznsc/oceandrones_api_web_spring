package com.oceandrones.Trajetos;

public enum Trajetos {
    TRAJETOPORTOCHIBATAO("Porto Chibatão"),
    TRAJETOPORTOPARANAGUA("Porto Paranaguá"),
    TRAJETOPORTOSUAPE("Porto de Suape"),
    TRAJETOPORTORIOJANEIRO("Porto do Rio de Janeiro"),
    TRAJETOPORTORIOGRANDE("Porto do Rio Grande"),
    TRAJETOPORTOITAPOA("Porto de Itapoá"),
    TRAJETOPORTONAVE("Porto de Navegantes"),
    TRAJETOPORTOSANTOS("Porto de Santos"),
    TRAJETOPORTOSAOSEBASTIAO("Porto de São Sebastião");

    private final String nomeTrajeto;

    Trajetos(String nomeTrajeto) {
        this.nomeTrajeto = nomeTrajeto;
    }

    public String getNomeTrajeto() {
        return nomeTrajeto;
    }
}
