package builder;

import Componentes.Almohadilla;
import Componentes.Cordon;
import Componentes.Tacon;
import Componentes.Velcro;
import  Class.*;
import enums.Color;
import enums.TipoAlmohadilla;
import enums.TipoCordon;

public interface Builder {
    void setCordon(Cordon cordon);
    void setTacon(Tacon tacon);
    void setVelcro(Velcro velcro);
    void  setAlmohadilla(Almohadilla almohadilla);
    void  setTipoCordon(TipoCordon tipoCordon);
    void setColor(Color color);
    void setTipoAlmohadilla(TipoAlmohadilla tipoAlmohadilla);

    Calzado getCalsado();
}
