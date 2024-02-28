package builder;


import Componentes.*;
import enums.Color;
import enums.Suela;
import enums.TipoCordon;
import Class.*;

public interface Builder {
    void setCordon(Cordon cordon);
    void setTacon(Tacon tacon);
    void setVelcro(Velcro velcro);
    void  setAlmohadilla(Almohadilla almohadilla);
    void setColor(Color color);
    void setForro(Forro forro);
    void setlengueta(Lengueta lengueta);
    void setSuela(Suela suela);
    Calzado getCalsado();
}
