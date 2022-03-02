package natel.tech.repository;

import natel.tech.entity.Jogador;
import natel.tech.enumeration.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JogadorRepository extends JpaRepository<Jogador, Long> {

    @Query("select s from Jogador s where s.statusOcupacional = 'LIBERADO'")
    List<Jogador> findByStatusOcupacional();

    @Modifying
    @Query("update Jogador j set j.status = :status where j.id = :id")
    void updateStatusById(@Param("status") Status status, @Param("id") Long id);

}

