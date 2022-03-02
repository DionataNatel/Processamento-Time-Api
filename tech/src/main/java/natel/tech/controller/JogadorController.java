package natel.tech.controller;

import lombok.AllArgsConstructor;
import natel.tech.dto.JogadorDTO;
import natel.tech.entity.Jogador;
import natel.tech.service.JogadorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogador")
@AllArgsConstructor
public class JogadorController {

    private final JogadorService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createJogador(@RequestBody Jogador jogador) {
        service.create(jogador);
    }

    @GetMapping
    public List<Jogador> findJogador() {
        return service.findAll();
    }
    @GetMapping("/statusOcupacional")
    public List<Jogador> findStatusOcupacional() {
        return service.findByStatusOcupacional();
    }

    @PatchMapping("/status/{id}")
    public void updateStatus(@PathVariable Long id, @RequestBody JogadorDTO jogador) {
        service.updateStatus(jogador.getStatus(), id);
    }


    @GetMapping("/{id}")
    public Jogador findJogadorById(@PathVariable Long id) {
        return service.findById(id);
    }
}
