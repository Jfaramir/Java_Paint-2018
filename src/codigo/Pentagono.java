/*
 * esta clase dibuja pentagonos (o eso creo)

 */
package codigo;

import java.awt.Color;

/**
 *
 * @author Jorge Cisneros
 */
public class Pentagono extends Forma {

    public Pentagono(int _posX, int _posY,  Color _color, boolean _relleno) {
        //inicializa el constructor del pentagono correctamente para q guarde 5 lados
        super(_posX,_posY,5,_color,_relleno); 
    }
}
