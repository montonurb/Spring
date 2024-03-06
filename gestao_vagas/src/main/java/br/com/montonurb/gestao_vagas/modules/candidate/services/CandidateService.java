package br.com.montonurb.gestao_vagas.modules.candidate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.montonurb.gestao_vagas.exceptions.UserFoundException;
import br.com.montonurb.gestao_vagas.modules.candidate.CandidateEntity;
import br.com.montonurb.gestao_vagas.modules.candidate.CandidateRepository;

@Service
public class CandidateService {
    @Autowired
    CandidateRepository candidateRepository;

    public CandidateEntity execute(CandidateEntity candidateEntity) {
        this.candidateRepository.findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail()).ifPresent((user) -> {
            throw new UserFoundException();
        });;
        
        return candidateRepository.save(candidateEntity);
    }
}
