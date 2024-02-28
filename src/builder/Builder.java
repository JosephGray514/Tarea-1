package builder;


import Componentes.*;
import enums.Color;
import enums.TipoAlmohadilla;
import enums.TipoCordon;
import Class.*;

public interface Builder {
    void setCordon(Cordon cordon);
    void setTacon(Tacon tacon);
    void setVelcro(Velcro velcro);
    void  setAlmohadilla(Almohadilla almohadilla);
    void  setTipoCordon(TipoCordon tipoCordon);
    void setColor(Color color);
    void setTipoAlmohadilla(TipoAlmohadilla tipoAlmohadilla);

    void setForro(Forro forro);
    void setlengueta(lengueta lengueta);

    Calzado getCalsado();
}
