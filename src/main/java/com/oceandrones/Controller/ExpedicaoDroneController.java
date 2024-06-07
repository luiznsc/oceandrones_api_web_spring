package com.oceandrones.Controller;

import com.oceandrones.ExpedicaoDrone.ExpedicaoDrone;
import com.oceandrones.ExpedicaoDrone.IExpedicaoDroneRepository;
import com.oceandrones.ExpedicaoDrone.RDadosCadastroExpedicaoDrone;
import com.oceandrones.ExpedicaoDrone.RDadosListagemExpedicaoDrone;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/expedicaodrones")
@CrossOrigin(origins = {"https://oceandrones.vercel.app/", "http://localhost:3000"})
public class ExpedicaoDroneController {

    @Autowired
    private IExpedicaoDroneRepository expedicaoDroneRepository;

    @PostMapping("/cadastrar")
    @Transactional
    @PreAuthorize("hasRole('ADMIN')")
    public void cadastroExpedicaoDrone(@RequestBody @Valid RDadosCadastroExpedicaoDrone dadosCadastroExpedicaoDrone){
        expedicaoDroneRepository.save(new ExpedicaoDrone(dadosCadastroExpedicaoDrone));
    }


    @GetMapping("/buscar/{idExpDrone}")
    public ResponseEntity<Page<RDadosListagemExpedicaoDrone>> lista(
            @PathVariable Long idExpDrone,
            @PageableDefault(size = 10) Pageable paginacao){
        Page<ExpedicaoDrone> expedicaoDrones = expedicaoDroneRepository.findAllByIdExpDrone(idExpDrone, paginacao);
        Page<RDadosListagemExpedicaoDrone> expedicaoDados = expedicaoDrones.map(RDadosListagemExpedicaoDrone::new);
        return ResponseEntity.ok(expedicaoDados);
    }


    @DeleteMapping("/deletar/{idExpDrone}")
    @Transactional
    @PreAuthorize("hasRole('ADMIN')")
    public void deletarExpedicaoDrone(@PathVariable Long idExpDrone){ expedicaoDroneRepository.deleteById(idExpDrone);
    }
}
