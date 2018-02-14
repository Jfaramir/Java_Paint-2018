/*
 * La clase forma ...
 * 
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author JP
 */
public class Forma extends Polygon {
    public Color color = null;
    public boolean relleno = false;

     //coordenadas del centro de la forma
    public int x = 0;
    public int y = 0;
    
    public Forma(int _posX, int _posY, int _lados, Color _color, boolean _relleno) {
        //inicializa el constructor del triangulo correctamente para q guarde el num,ero de _lados 
        super(new int[_lados],new int[_lados],_lados); 
        // guardo el centro del triangulo
        this.x = _posX;
        this.y = _posY;
                
        color = _color;
        relleno = _relleno;
    }
    
    public void dibujate(Graphics2D g2, int _posY, int _posX) {
        //redibujas el triangulo
        
               
        calculaVertices( y - _posY, x - _posX);
        
        g2.setColor(color);
        if (relleno) {
            g2.fill(this);
        } else {
            g2.draw(this);
        }
    }    
        //recalcula la posicion de los vertices de un triangulo regular
        private void calculaVertices (int _radio, double _giro){
           for (int i=0; i<npoints; i++){
            this.xpoints[i] = (int) (x + _radio * Math.cos((2 * Math.PI * i + _giro)/npoints));
            this.ypoints[i] = (int) (y + _radio * Math.sin((2 * Math.PI * i + _giro)/npoints));
        } 
    }
}
