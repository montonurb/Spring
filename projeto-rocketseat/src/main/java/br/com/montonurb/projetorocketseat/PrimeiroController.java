package br.com.montonurb.projetorocketseat;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@RestController
@RequestMapping("/meusCursos")
public class PrimeiroController {
    @RequestMapping("/java")
    public String cursoJava() {
        return "Bem vindo ao curso de Java!";
    }

    @GetMapping("/java/aula/{id}")
    public String metodoComPathVariable(@PathVariable String id) {
        return "Id é " + id;
    }

    @GetMapping("/java/aula")
    public String getMethodName(@RequestParam Map<String, String> params) {
        return "Parametros: " + params.entrySet();
    }

    @PostMapping("/metodoComBody")
    public String metodoComBody(@RequestBody String aula) {
        return "aula enviada: " + aula;
    }
    
    @PostMapping("/metodoComBodyEntity")
    public String metodoComBodyEntity(@RequestBody Usuario usuario) {
        return "Nome do Usuario: " + usuario.nome() + ", Senha: " + usuario.senha();
    }

    record Usuario(String nome, String senha) {
    }

    @PostMapping("/metodoComHeaders")
    public String metodoComHeaders(@RequestHeader("nome") String dadoHeader) {
        return "Testando com Header: " + dadoHeader;
    }

    @PostMapping("/metodoComListersHeaders")
    public String metodoComListersHeaders(@RequestHeader Map<String, String> headers) {
        return "Informando os parametros: " + headers;
    }
}
