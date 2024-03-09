package br.com.montonurb.gestao_vagas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.montonurb.gestao_vagas.models.JobEntity;
import br.com.montonurb.gestao_vagas.services.JobService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/job")
public class JobController {
    @Autowired
    JobService jobService;

    @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody JobEntity jobEntity) {
        try {
            return ResponseEntity.ok().body(jobService.execute(jobEntity));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
