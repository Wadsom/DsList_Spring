package com.wpcorp.DsLIst.Repository;

import com.wpcorp.DsLIst.DTO.GameDTO;
import com.wpcorp.DsLIst.Entity.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
//Havia me esquecido da Anotation
public interface GameRepository extends JpaRepository<GameEntity, UUID> {
}
