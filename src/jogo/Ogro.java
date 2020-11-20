package jogo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ogro extends Inimigo {

	public Ogro() {
		super(100, 5);
	}

    @Override
    public Inimigo makeCopy() {
        
        Ogro ogro = null;
        
            try {
                ogro = (Ogro) super.clone();
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(Ogro.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return ogro;
    }
     
}
