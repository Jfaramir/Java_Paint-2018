/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author xp
 */
public class linea extends Forma{
        
    public linea(int _posX, int _posY, Color _color, boolean _relleno) {
        //inicializa el constructor del cuadrado correctamente para q guarde tos los puntos
        super(_posX, _posY, 2, _color, _relleno);
    }  
}
