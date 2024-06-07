package com.oceandrones.ExpedicaoDrone;
import com.oceandrones.Drones.Drones;
import com.oceandrones.Portos.Portos;
import com.oceandrones.Trajetos.Trajetos;
import com.oceandrones.UF.UfExpedicao;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "TB_REQ_EXPEDICAO_DRONE")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idExpDrone")

public class ExpedicaoDrone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EXPEDICAO_DRONE")
    private Long idExpDrone;

    @Enumerated(EnumType.STRING)
    private Drones drone;

    @Enumerated(EnumType.STRING)
    private UfExpedicao ufexpedicao;

    @Enumerated(EnumType.STRING)
    private Portos porto;

    @Enumerated(EnumType.STRING)
    private Trajetos trajeto;

    public ExpedicaoDrone(Drones drones, UfExpedicao ufexpedicao, Portos portos, Trajetos trajetos) {
        this.drone = drones;
        this.ufexpedicao = ufexpedicao;
        this.porto = portos;
        this.trajeto = trajetos;
    }

    public ExpedicaoDrone(RDadosCadastroExpedicaoDrone dadosExpedicao) {
        this.drone = dadosExpedicao.drones();
        this.ufexpedicao = dadosExpedicao.ufExpedicao();
        this.porto = dadosExpedicao.porto();
        this.trajeto = dadosExpedicao.trajeto();
    }


    public void excluirExpedicao() {
        this.drone = null;
        this.ufexpedicao = null;
        this.porto = null;
        this.trajeto = null;
    }
}
