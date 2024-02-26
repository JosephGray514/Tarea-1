package director;

import Componentes.Cordon;
import Componentes.Tacon;
import Componentes.Velcro;
import builder.Builder;
import enums.Color;
import enums.Material;
import enums.Tipo;

public class ClazadoBuilderDirector {

    public void buildCalzadoCordonAmarillo(Builder builder) {

        builder.setColor(Color.Amarillo);
        builder.setTipo(Tipo.Redondo);

    }
    public void buildCalzadoCordonNegro (Builder builder){

        builder.setColor(Color.Negro);
        builder.setTipo(Tipo.Ovalado);
    }

    public void buildCalzadoVelcro (Builder builder){
        builder.setTipo(Tipo.Velcro);
        builder.setColor(Color.Azul);
    }

    public void buildCalzadoAlmohadilla(Builder builder){

    }

    public void buildCalzadoTacon (Builder builder){

    }

   }