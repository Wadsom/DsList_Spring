package com.wpcorp.DsLIst.Entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
    @EmbeddedId
    private Belongingpk id;
    private Integer position;
    public Belonging(){}

    public Belonging(GameEntity game , GameList gameList , Integer position) {
       id.setGameEntity(game);
       id.setGameList(gameList);
        this.position = position;
    }
}
