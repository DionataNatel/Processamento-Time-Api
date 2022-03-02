package natel.tech.entity;

import lombok.Data;
import natel.tech.enumeration.Status;
import natel.tech.enumeration.StatusFederativo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate dataFundacao;
    private String telefone;
    private String estado;
    private String cidade;

    @Enumerated(EnumType.STRING)
    private StatusFederativo statusFederativo;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "jogadores_id")
    private Jogador jogadores;


}