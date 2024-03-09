package br.com.montonurb.gestao_vagas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.montonurb.gestao_vagas.models.JobEntity;
import br.com.montonurb.gestao_vagas.repositories.JobRepository;

@Service
public class JobService {
    @Autowired
    JobRepository jobRepository;

    public JobEntity execute(JobEntity jobEntity) {
        return this.jobRepository.save(jobEntity);
    }
}
