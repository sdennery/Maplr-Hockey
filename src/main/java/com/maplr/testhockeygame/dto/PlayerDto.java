package com.maplr.testhockeygame.dto;

/**
 * Data Transfer Objects
 */
public class PlayerDto {

    private Long number;
    private String name;
    private String lastname;
    private String position;
    private boolean isCaptain;

    public PlayerDto() {
    }

    public PlayerDto(Long number, String name, String lastname, String position, boolean isCaptain) {
        this.number = number;
        this.name = name;
        this.lastname = lastname;
        this.position = position;
        this.isCaptain = isCaptain;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isCaptain() {
        return isCaptain;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }
}
