package me.sememorg.new_beginning.repository;

import me.sememorg.new_beginning.model.Slave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlaveRepository extends JpaRepository<Slave, Integer> {
}
