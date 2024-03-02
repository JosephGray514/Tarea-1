package director;

import Componentes.*;
import builder.Builder;
import enums.*;

public class ClazadoBuilderDirector {
    public void buildCalzadoCordon(Builder builder) {
        builder.setColor(Color.Amarillo);
        builder.setCordon(new Cordon(TipoCordon.Redondo,Color.Rojo));
        builder.setSuela(Suela.Cuero);
        builder.setForro(new Forro(Color.Verde,Material.Corcho));
        builder.setlengueta(new Lengueta(Material.Cilicona, Color.Rojo));
        builder.setEmpeine(new Empeine(12,EstiloEmpeine.texturizado,Color.Gris));
        builder.setPicadoMaria(new PicadoMaria("asimetrico",3));
    }
    public void buildCalzadoVelcro (Builder builder){
        builder.setColor(Color.Rojo);
        builder.setSuela(Suela.Crepe);
        builder.setVelcro(new Velcro(Color.PURPURA));
        builder.setForro(new Forro(Color.Amarillo,Material.Cilicona));
        builder.setlengueta(new Lengueta(Material.Corcho,Color.Gris));
        builder.setEmpeine(new Empeine(15,EstiloEmpeine.estampado,Color.Gris));
        builder.setPicadoMaria(new PicadoMaria("clasico",2));
    }

    public void buildCalzadoConAlmohadilla(Builder builder){
        builder.setColor(Color.PURPURA);
        builder.setSuela(Suela.Crepe);
        builder.setCordon(new Cordon(TipoCordon.Plano,Color.PURPURA));
        builder.setForro(new Forro(Color.Gris,Material.Cilicona));
        builder.setlengueta(new Lengueta(Material.Corcho,Color.Rojo));
        builder.setEmpeine(new Empeine(13,EstiloEmpeine.perforado,Color.Verde));
        builder.setPicadoMaria(new PicadoMaria("texturizado",2));
        builder.setAlmohadilla(new Almohadilla(TipoAlmohadilla.Metatarciana,Material.Gel));
    }

    public void buildCalzadoTacon(Builder builder){
        builder.setColor(Color.Amarillo);
        builder.setSuela(Suela.Esparto);
        builder.setVelcro(new Velcro(Color.Rojo));
        builder.setForro(new Forro(Color.Verde,Material.Cilicona));
        builder.setlengueta(new Lengueta(Material.Gel,Color.PURPURA));
        builder.setEmpeine(new Empeine(15,EstiloEmpeine.tejido,Color.Amarillo));
        builder.setPicadoMaria(new PicadoMaria("sintetico",4));
        builder.setTacon(new Tacon(4,MaterialTacon.Cuero));
    }
}