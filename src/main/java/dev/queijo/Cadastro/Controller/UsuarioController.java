package dev.queijo.Cadastro.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Anotacao para indicar que esta classe é um controlador REST, ou seja, ela lida com requisições HTTP e retorna respostas em formato JSON ou XML
@RequestMapping // Anotacao para definir o caminho base para as rotas deste controlador.
public class UsuarioController {
    
    @GetMapping("/welcome")
    public String welcome(){
        return "Esta é a página de boas-vindas!";
    }
}
