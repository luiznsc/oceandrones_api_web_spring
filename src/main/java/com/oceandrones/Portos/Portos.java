package com.oceandrones.Portos;

public enum Portos {
    PORTOCHIBATAO("Porto Chibatão"),
    PORTOPARANAGUA("Porto Paranaguá"),
    PORTOSUAPE("Porto de Suape"),
    PORTORIOJANEIRO("Porto do Rio de Janeiro"),
    PORTORIOGRANDE("Porto do Rio Grande"),
    PORTOITAPOA("Porto de Itapoá"),
    PORTONAVE("Porto de Navegantes"),
    PORTOSANTOS("Porto de Santos"),
    PORTOSAOSEBASTIAO("Porto de São Sebastião");

    private final String nomePorto;

    Portos(String nomePorto) {
        this.nomePorto = nomePorto;
    }

    public String getNomePorto() {
        return nomePorto;
    }
}
