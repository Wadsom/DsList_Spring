package com.wpcorp.DsLIst.DTO;

import com.wpcorp.DsLIst.Entity.GameEntity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

public class GameDTO {

    private Long id;
    private String title;
    private int year;
    private String imgUrl;
    private String shortDescription;
    public GameDTO (){}

    public GameDTO(GameEntity gameEntity) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
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
