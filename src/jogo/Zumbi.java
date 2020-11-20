package jogo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Zumbi extends Inimigo {

	public Zumbi() {
		super(50, 2);
	}

    @Override
    public Inimigo makeCopy() {
        
        Zumbi zumbi = null;
        
            try {
                zumbi = (Zumbi) super.clone();
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(Zumbi.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return zumbi;
    }

}
