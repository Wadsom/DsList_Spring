package com.wpcorp.DsLIst.Repository;

import com.wpcorp.DsLIst.DTO.GameDTO;
import com.wpcorp.DsLIst.Entity.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GameRepository extends JpaRepository<GameEntity, UUID> {
}
