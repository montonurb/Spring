package br.com.montonurb.projetorocketseat;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meusCursos")
public class PrimeiroController {
    @RequestMapping("/java")
    public String cursoJava() {
        return "Bem vindo ao curso de Java!";
    }
    
}
