package br.com.montonurb.gestao_vagas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.montonurb.gestao_vagas.exceptions.CompanyFoundException;
import br.com.montonurb.gestao_vagas.models.CompanyEntity;
import br.com.montonurb.gestao_vagas.repositories.CompanyRepository;

@Service
public class CompanyService {
    @Autowired
    CompanyRepository companyRepository;

    public CompanyEntity execute(CompanyEntity companyEntity) {
        this.companyRepository.findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail()).ifPresent((company) -> {
            throw new CompanyFoundException();
        });

        return companyRepository.save(companyEntity);
    }
}
