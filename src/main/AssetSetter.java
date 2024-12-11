package main;

import object.*;

public class AssetSetter {

    GamePanel gp;
    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }
    public void setObject(){

        gp.obj[0] = new OBJ_Key();
        gp.obj[0].worldX = 10 * gp.tileSize;
        gp.obj[0].worldY = 16 * gp.tileSize;

        gp.obj[1] = new OBJ_Boots();
        gp.obj[1].worldX = 18 * gp.tileSize;
        gp.obj[1].worldY = 11 * gp.tileSize;

        gp.obj[2] = new OBJ_Ladder();
        gp.obj[2].worldX = 18 * gp.tileSize;
        gp.obj[2].worldY = 18 * gp.tileSize;

        gp.obj[3] = new OBJ_Door();
        gp.obj[3].worldX = 14 * gp.tileSize;
        gp.obj[3].worldY = 11 * gp.tileSize;

        gp.obj[4] = new OBJ_Chest();
        gp.obj[4].worldX = 11 * gp.tileSize;
        gp.obj[4].worldY = 15 * gp.tileSize;



    }
}
