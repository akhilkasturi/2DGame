package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Squidward extends SuperObject{
    public OBJ_Squidward(){

        name = "Squidward";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/objects/Squidward.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
