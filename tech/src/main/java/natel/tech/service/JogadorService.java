package natel.tech.service;

import lombok.AllArgsConstructor;
import natel.tech.entity.Jogador;
import natel.tech.enumeration.Status;
import natel.tech.repository.JogadorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class JogadorService {

    private final JogadorRepository repository;

    //Cria o jogador no banco
    public void create(Jogador jogador) {
        repository.save(jogador);
    }

    //Busca o jogador pelo status Ocupacional
    public List<Jogador> findByStatusOcupacional() {
        return repository.findByStatusOcupacional();
    }

    //Atualiza status jogador
    @Transactional // sempre que tiver um update usar o Transational
    public void updateStatus(Status status, Long id) {
        repository.updateStatusById(status, id);
    }

    //BUsca todos os jogadores
    public List<Jogador> findAll() {
        return repository.findAll();
    }

    //Quando houver o jogador retorna ele, quando nao houver 404
    public Jogador findById(Long id) {
        Optional<Jogador> jogador = repository.findById(id);
        return jogador.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Id Não encontrado"));
    }
}