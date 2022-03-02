package natel.tech.entity;

import lombok.Data;
import natel.tech.enumeration.Status;
import natel.tech.enumeration.StatusFederativo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "TIME")
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

    @OneToMany(cascade = CascadeType.ALL)
    private List<Jogador> jogadores;
}