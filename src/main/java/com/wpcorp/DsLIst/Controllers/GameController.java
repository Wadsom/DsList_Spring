package com.wpcorp.DsLIst.Controllers;

import com.wpcorp.DsLIst.DTO.GameDTO;
import com.wpcorp.DsLIst.Entity.GameEntity;
import com.wpcorp.DsLIst.Services.GameService;
import org.apache.coyote.Response;
import org.aspectj.weaver.ast.Var;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/games")
public class GameController {
    private GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }
    @GetMapping
    public ResponseEntity<List<GameDTO>> cFindAll(){
      List<GameEntity> result = gameService.sFindAll();
      List<GameDTO> dtoList = result.stream().map(x -> new GameDTO(x)).toList();
       return ResponseEntity.status(HttpStatus.OK).body(dtoList);
    }
}
