package br.com.montonurb.gestao_vagas.exceptions;

public class JobCompanyFoundException extends RuntimeException {
    public JobCompanyFoundException() {
        super("Vaga já cadastrada!");
    }
}
