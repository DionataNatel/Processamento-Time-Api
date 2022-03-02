package natel.tech.service;

import lombok.AllArgsConstructor;
import natel.tech.entity.Jogador;
import natel.tech.entity.Time;
import natel.tech.repository.TimeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TimeService {

    private EntityManager manager;

    private final TimeRepository repository;

    private final JogadorService jogadorService;

    public void create(Time time) {
        repository.save(time);
    }

    public List<Time> findAll() {
        return repository.findAll();
    }

    public Time findById(Long id) {
        Optional<Time> time = repository.findById(id);
        return time.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Id Não encontrado"));
    }


   public void inserir(Long idJogador, Long idTime) {
        Jogador jogador = jogadorService.findById(idJogador);
        Optional<Time> time = repository.findById(idTime);

        Time t = time.get();
        t.setJogadores(jogador);;
        repository.save(t);

    }

   /* public List<Time> findTimeCompleto() {
        return repository.findTimeCompleto();*/
}





