/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.BasicStroke;

/**
 *
 * @author xp
 */
public class trazo extends BasicStroke{
    
    public trazo(int _grosor){
        super(_grosor);
    }
    
    public trazo (int _grosor, boolean rayas){
        super(_grosor,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,10.0f,new float[]{10.0f},0.0f);
    }
}
