package com.wpcorp.DsLIst.Services;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.wpcorp.DsLIst.DTO.GameDTO;
import com.wpcorp.DsLIst.Entity.GameEntity;
import com.wpcorp.DsLIst.Repository.GameRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {
    private  final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }



    public List<GameEntity> sFindAll(){
        List<GameEntity> busca = gameRepository.findAll();
    return busca;

}
public List<GameDTO> Tranfer(){
   List<GameEntity> result = sFindAll();
   List<GameDTO> dtoList = result.stream().map(x -> new GameDTO(x)).toList();
   return dtoList;
}
}
