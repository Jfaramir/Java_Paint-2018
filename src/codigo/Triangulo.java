/*
 * esta clase dibuja triángulos

 */
package codigo;

import java.awt.Color;

/**
 *
 * @author Jorge Cisneros
 */
public class Triangulo extends Forma {

    

    public Triangulo(int _posX, int _posY, Color _color, boolean _relleno) {
        //inicializa el constructor del triangulo correctamente para q guarde tos los puntos
        super(_posX, _posY, 3, _color, _relleno);
    }  
}
