package main;

import object.OBJ_Key;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;

public class UI {

    GamePanel gp;
    Graphics2D g2;
    Font helvetica_40;
    public boolean messageOn = false;
    public String message = "";
    int messageCounter = 0;
    public boolean gameFinished = false;
    DecimalFormat dFormat = new DecimalFormat("#0.00");

    double playTime;

    public UI(GamePanel gp){
        this.gp = gp;
        helvetica_40 = new Font("Helvetica", Font.PLAIN,40);
    }
    public void showMessage(String text){

        message = text;
        messageOn = true;
    }
    public void draw(Graphics2D g2) {

        this.g2 = g2;

        g2.setFont(helvetica_40);
        g2.setColor(Color.white);

        if (gp.gameState == gp.playState){
            //stuff
        }
        else if (gp.gameState == gp.pauseState){
            drawPauseScreen();
        }
    }
    public void drawPauseScreen(){

        g2.setFont(g2.getFont().deriveFont(Font.PLAIN,80F));
        String text = "PAUSED";
        int x = getXForCenteredText(text);
        int y = gp.screenHeight/2;

        g2.drawString(text,x,y);
    }
    public int getXForCenteredText(String text){
        int length = (int)g2.getFontMetrics().getStringBounds(text,g2).getWidth();
        int x = gp.screenWidth / 2 - length/2;
        return x;
    }
}
