package br.com.montonurb.gestao_vagas.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.montonurb.gestao_vagas.models.JobEntity;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {
}
