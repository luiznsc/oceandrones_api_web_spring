package com.oceandrones.ExpedicaoDrone;

import com.oceandrones.Drones.Drones;
import com.oceandrones.Portos.Portos;
import com.oceandrones.Trajetos.Trajetos;
import com.oceandrones.UF.UfExpedicao;

public record RDadosCadastroExpedicaoDrone(
        Drones drones,
        UfExpedicao ufExpedicao,
        Portos porto,
        Trajetos trajeto
) {
}
