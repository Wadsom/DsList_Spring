package com.wpcorp.DsLIst.Entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class Belongingpk {
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;
    @ManyToOne
    @JoinColumn(name = "game_id")
    private GameEntity gameEntity;

    public Belongingpk() {
    }

    public Belongingpk(GameList gameList, GameEntity gameEntity) {
        this.gameList = gameList;
        this.gameEntity = gameEntity;
    }

    public GameList getGameList() {
        return gameList;
    }

    public void setGameList(GameList gameList) {
        this.gameList = gameList;
    }

    public GameEntity getGameEntity() {
        return gameEntity;
    }

    public void setGameEntity(GameEntity gameEntity) {
        this.gameEntity = gameEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Belongingpk that = (Belongingpk) o;
        return Objects.equals(gameList, that.gameList) && Objects.equals(gameEntity, that.gameEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameList, gameEntity);
    }
}
