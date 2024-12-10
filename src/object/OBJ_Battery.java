package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Battery extends SuperObject{
    public OBJ_Battery(){

        name = "Battery";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/battery.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
        collision = true;
    }
}
