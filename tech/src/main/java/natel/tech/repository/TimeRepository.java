package natel.tech.repository;

import natel.tech.entity.Time;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository<Time, Long> {

   /* @Query("select t from Time t join fetch t.jogadores where t.jogadores = ?5")
    List<Time> findTimeCompleto();*/



}
