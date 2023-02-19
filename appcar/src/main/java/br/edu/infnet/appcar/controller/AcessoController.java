package br.edu.infnet.appcar.controller;

import br.edu.infnet.appcar.model.domain.Usuario;
import br.edu.infnet.appcar.repository.AcessoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
public class AcessoController {

    @GetMapping(value = "/login")
    public String telaLogin() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(@RequestParam String email, @RequestParam String senha) {

        Usuario user = new Usuario(email, senha);

        if(Objects.nonNull(AcessoRepository.autenticar(user))) {
            return "redirect:/home";
        }
        return "redirect:/login";
    }
}