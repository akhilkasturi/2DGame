package entity;

import main.GamePanel;

import java.util.Random;

public class NPC_Mummy extends Entity{
    public NPC_Mummy(GamePanel gp){
        super(gp);

        direction = "down";
        speed = 1;

        getImage();
    }
    public void getImage(){

        up1 = setup("/npc/mummy_up_1");
        up2 = setup("/npc/mummy_up_2");
        down1 = setup("/npc/mummy_down_1");
        down2 = setup("/npc/mummy_down_2");
        left1 = setup("/npc/mummy_left_1");
        left2 = setup("/npc/mummy_left_2");
        right1 = setup("/npc/mummy_right_1");
        right2 = setup("/npc/mummy_right_2");

    }
    public void setAction(){

        actionLockCounter ++;

        if (actionLockCounter == 120){

            Random random = new Random();
            int i = random.nextInt(100)+1;
            if (i <= 25){
                direction = "up";
            }
            if (i > 25 && i <= 50){
                direction = "down";
            }
            if (i > 50 && i <= 75){
                direction = "left";
            }
            if (i > 75 && i <= 100){
                direction = "right";
            }

            actionLockCounter = 0;
        }

    }
}
