package director;

import Componentes.*;
import builder.Builder;
import enums.*;

public class ClazadoBuilderDirector {
    public void buildCalzadoCordon(Builder builder) {
        builder.setColor(Color.Amarillo);
        builder.setCordon(new Cordon(TipoCordon.Redondo,Color.Negro));
        builder.setSuela(Suela.Cuero);
        builder.setForro(new Forro(Color.Verde,Material.Corcho));
        builder.setlengueta(new Lengueta(Material.Cilicona, Color.Rojo));
        builder.setEmpeine(new Empeine(12,EstiloEmpeine.texturizado,Color.Gris));
        builder.setPicadoMaria(new PicadoMaria("asimetrico",3));
    }

    public void buildCalzadoVelcro (Builder builder){
        builder.setColor(Color.Azul);
        builder.setSuela(Suela.Crepe);
        builder.setVelcro(new Velcro(Color.Azul));
        builder.setForro(new Forro(Color.Azul,Material.Cilicona));
        builder.setlengueta(new Lengueta(Material.Corcho,Color.Blanco));
        builder.setEmpeine(new Empeine(15,EstiloEmpeine.estampado,Color.Blanco));
        builder.setPicadoMaria(new PicadoMaria("clasico",2));
    }

    public void buildCalzadoConAlmohadilla(Builder builder){
        builder.setColor(Color.Gris);
        builder.setSuela(Suela.Crepe);
        builder.setCordon(new Cordon(TipoCordon.Plano,Color.Blanco));
        builder.setForro(new Forro(Color.Gris,Material.Cilicona));
        builder.setlengueta(new Lengueta(Material.Corcho,Color.Azul));
        builder.setEmpeine(new Empeine(13,EstiloEmpeine.perforado,Color.Blanco));
        builder.setPicadoMaria(new PicadoMaria("texturizado",2));
        builder.setAlmohadilla(new Almohadilla(TipoAlmohadilla.Metatarciana,Material.Gel));
    }

    public void buildCalzadoTacon(Builder builder){
        builder.setColor(Color.Amarillo);
        builder.setSuela(Suela.Esparto);
        builder.setVelcro(new Velcro(Color.Azul));
        builder.setForro(new Forro(Color.Gris,Material.Cilicona));
        builder.setlengueta(new Lengueta(Material.Gel,Color.Negro));
        builder.setEmpeine(new Empeine(15,EstiloEmpeine.tejido,Color.Verde));
        builder.setPicadoMaria(new PicadoMaria("sintetico",4));
        builder.setTacon(new Tacon(4,MaterialTacon.Cuero));
    }
}