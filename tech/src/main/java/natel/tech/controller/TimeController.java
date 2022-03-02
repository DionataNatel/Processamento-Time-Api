package natel.tech.controller;

import lombok.AllArgsConstructor;
import natel.tech.entity.Jogador;
import natel.tech.entity.Time;
import natel.tech.service.TimeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/time")
@AllArgsConstructor
public class TimeController {

    private final TimeService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createTime(@RequestBody Time time) {
        service.create(time);
    }

    @GetMapping
    public List<Time> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Time findTimeById(@PathVariable Long id) {
        return service.findById(id);
    }


    @PutMapping("/incluir/{idJogador}/{idTime}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void incluir(@PathVariable("idJogador") Long idJogador, @PathVariable("idTime") Long idTime) {
        service.inserir(idJogador, idTime);
    }


    /*@GetMapping("/completo")
    public List<Time> findTimeCompleto() {
        return service.findTimeCompleto();*/
}


