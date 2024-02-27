package director;

import builder.Builder;
import enums.Color;
import enums.TipoAlmohadilla;
import enums.TipoCordon;

public class ClazadoBuilderDirector {

    public void buildCalzadoCordonAmarillo(Builder builder) {

        builder.setColor(Color.Amarillo);
        builder.setTipoCordon(TipoCordon.Redondo);

    }
    public void buildCalzadoCordonNegro (Builder builder){

        builder.setColor(Color.Negro);
        builder.setTipoCordon(TipoCordon.Ovalado);
    }

    public void buildCalzadoVelcro (Builder builder){
        builder.setTipoCordon(TipoCordon.Velcro);
        builder.setColor(Color.Azul);
    }

    public void buildCalzadoAlmohadilla(Builder builder){

    }

    public void buildCalzadoTacon (Builder builder){

    }

   }