package br.com.montonurb.gestao_vagas.exceptions;

public class CompanyFoundException extends RuntimeException {
    public CompanyFoundException() {
        super("Empresa já cadastrada!");
    }
}
