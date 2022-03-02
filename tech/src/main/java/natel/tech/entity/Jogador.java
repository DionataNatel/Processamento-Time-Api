package natel.tech.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import natel.tech.enumeration.Posicao;
import natel.tech.enumeration.Status;
import natel.tech.enumeration.StatusOcupacional;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data@Table(name = "JOGADOR")
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private String telefone;

    @Enumerated(EnumType.STRING)
    private Posicao posicao;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private StatusOcupacional statusOcupacional;
}
