package com.oceandrones.ExpedicaoDrone;

import com.oceandrones.Drones.Drones;
import com.oceandrones.Portos.Portos;
import com.oceandrones.Trajetos.Trajetos;
import com.oceandrones.UF.UfExpedicao;

public record RDadosListagemExpedicaoDrone(
        Long idReqExpDrone,
        Drones drones,
        UfExpedicao ufexpedicao,
        Portos portos,
        Trajetos trajetos
) {

    public RDadosListagemExpedicaoDrone(ExpedicaoDrone expedicaoDrone){
        this(expedicaoDrone.getIdExpDrone(), expedicaoDrone.getDrone(), expedicaoDrone.getUfexpedicao(), expedicaoDrone.getPorto(), expedicaoDrone.getTrajeto());
    }
}
