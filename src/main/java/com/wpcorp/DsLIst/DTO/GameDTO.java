package com.wpcorp.DsLIst.DTO;

import com.wpcorp.DsLIst.Entity.GameEntity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

public class GameDTO {

    private long id;
    private String title;
    private int year;
    private String imgUrl;
    private String shortDescription;
    public GameDTO (){}

    public GameDTO(GameEntity gameEntity) {
        this.id = gameEntity.getId();
        this.title = gameEntity.getTitle();
        this.year = gameEntity.getYear();
        this.imgUrl = gameEntity.getImgUrl();
        this.shortDescription = gameEntity.getShortDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
