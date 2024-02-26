package builder;

import Componentes.Almohadilla;
import Componentes.Cordon;
import Componentes.Tacon;
import Componentes.Velcro;
import  Class.*;
import enums.Color;
import enums.Tipo;

public interface Builder {
    void setCordon(Cordon cordon);
    void setTacon(Tacon tacon);
    void setVelcro(Velcro velcro);
    void  setAlmohadilla(Almohadilla almohadilla);
    void  setTipo(Tipo tipo);
    void setColor(Color color);

    Calzado getCalsado();
}
