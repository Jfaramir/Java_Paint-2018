/*
 * esta clase dibuja triángulos

 */
package codigo;

import java.awt.Color;

/**
 *
 * @author Jorge Cisneros
 */
public class Estrella extends Forma {

    

    public Estrella(int _posX, int _posY, Color _color, boolean _relleno) {
        //inicializa el constructor del triangulo correctamente para q guarde tos los puntos
        super(_posX, _posY, 1024, _color, _relleno);
    }  
    @Override
    public void calculaVertices( int _radio, double _giro){
        int n = 20;
        for (int i=0; i<npoints; i++){
            this.xpoints[i] = (int) (x + _radio/(i%n+1) * Math.cos((2 * Math.PI * i + _giro/(i%n+1))/npoints));
            //this.xpoints[i+1] = (int) (x + (_radio/2) * Math.cos((2 * Math.PI * i + _giro)/npoints));
            this.ypoints[i] = (int) (y + _radio/(i%n+1) * Math.sin((2 * Math.PI * i + _giro/(i%n+1))/npoints));
            //this.ypoints[i+1] = (int) (y + (_radio/2) * Math.sin((2 * Math.PI * i + _giro)/npoints));
            //i++;
        } 
    }
    
}
