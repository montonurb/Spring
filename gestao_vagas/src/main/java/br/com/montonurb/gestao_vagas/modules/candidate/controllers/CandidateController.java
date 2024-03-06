package br.com.montonurb.gestao_vagas.modules.candidate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.montonurb.gestao_vagas.exceptions.UserFoundException;
import br.com.montonurb.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.montonurb.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.montonurb.gestao_vagas.modules.candidate.services.CandidateService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    CandidateService candidateService;
    
    @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody CandidateEntity candidateEntity) {
        try {
            return ResponseEntity.ok().body(candidateService.execute(candidateEntity));
        } catch (Exception error) {
            return ResponseEntity.badRequest().body(error.getMessage());
        }

    }
}
