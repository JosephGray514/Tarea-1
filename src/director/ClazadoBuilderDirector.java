package director;

import Componentes.*;
import builder.Builder;
import enums.*;

public class ClazadoBuilderDirector {
    public void buildCalzadoCordonAmarillo(Builder builder) {
        builder.setColor(Color.Amarillo);
        builder.setCordon(new Cordon(TipoCordon.Redondo,Color.Negro));
        builder.setSuela(Suela.Cuero);
        builder.setForro(new Forro(Color.Verde,Material.Corcho));
        builder.setlengueta(new Lengueta(Material.Cilicona, Color.Rojo));
        builder.setAlmohadilla(new Almohadilla(TipoAlmohadilla.Antepie, Material.Gel));

    }
    public void buildCalzadoCordonNegro (Builder builder){
        builder.setColor(Color.Negro);
        builder.setCordon(new Cordon(TipoCordon.Cuero,Color.Negro));
        builder.setSuela(Suela.Goma);
    }
    public void buildCalzadoVelcro (Builder builder){
        builder.setColor(Color.Azul);
        builder.setSuela(Suela.Crepe);
        builder.setVelcro(new Velcro(TipoAlmohadilla.Antepie,Color.Azul));
    }

    public void buildCalzadoJoseph(Builder builder){
        builder.setAlmohadilla(new Almohadilla(TipoAlmohadilla.Antepie, Material.Gel));
        builder.setCordon(new Cordon(TipoCordon.Velcro,Color.Negro));
        builder.setForro(new Forro(Color.Negro,Material.Corcho));
        builder.setlengueta(new Lengueta(Material.Cilicona, Color.Negro));
        builder.setTacon(new Tacon(12,MaterialTacon.Metal));
        builder.setColor(Color.Negro);
        builder.setSuela(Suela.Crepe);

    }
}