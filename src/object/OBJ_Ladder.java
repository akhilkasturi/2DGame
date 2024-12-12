package object;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Ladder extends SuperObject{

    GamePanel gp;

    public OBJ_Ladder(GamePanel gp){
        this.gp = gp;
        name = "Ladder";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/ladder.png"));
            uTool.scaleImage(image,gp.tileSize,gp.tileSize);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
