package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_SpongeBot extends SuperObject{
    public OBJ_SpongeBot(){

            name = "SpongeBot";
            try{
                image = ImageIO.read(getClass().getResourceAsStream("/objects/SpongeBot.png"));
            }catch(IOException e){
                e.printStackTrace();
            }
    }
}

