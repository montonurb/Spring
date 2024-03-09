package br.com.montonurb.gestao_vagas.models;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity(name = "company")
public class CompanyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    @NotBlank()
    @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaço.")
    private String username;
    @Email(message = "O campo deve conter um e-mail válido!")
    private String email;
    private String password;
    private String website;
    private String description;
    @CreationTimestamp
    private LocalDateTime createdAt;
}