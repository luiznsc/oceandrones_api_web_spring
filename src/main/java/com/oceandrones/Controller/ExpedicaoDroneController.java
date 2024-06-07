package com.oceandrones.Controller;

import com.oceandrones.ExpedicaoDrone.ExpedicaoDrone;
import com.oceandrones.ExpedicaoDrone.IExpedicaoDroneRepository;
import com.oceandrones.ExpedicaoDrone.RDadosCadastroExpedicaoDrone;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
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

    @DeleteMapping("/deletar/{idExpDrone}")
    @Transactional
    @PreAuthorize("hasRole('ADMIN')")
    public void deletarExpedicaoDrone(@PathVariable Long idExpDrone){ expedicaoDroneRepository.deleteById(idExpDrone);
    }
}
