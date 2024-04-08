package entity;

import java.awt.image.BufferedImage;

public class Entity {
    public int x;
    public int y;
    public int speed;

    public BufferedImage standR, standL, walkR, walkL, walkR2, walkL2, walkR3, walkL3;
    public String direction;

    public int spriteCounter = 0;
    public int spriteNum = 1;
}