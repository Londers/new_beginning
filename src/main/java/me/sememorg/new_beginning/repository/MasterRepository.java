package me.sememorg.new_beginning.repository;

import me.sememorg.new_beginning.model.Master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface MasterRepository extends JpaRepository<Master, Integer> {
    Optional<Master> findByName(String name);

    @Transactional
    @Modifying
    Integer deleteByName(String name);
    boolean existsByName(String name);
}
