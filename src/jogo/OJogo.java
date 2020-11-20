package jogo;

import jogo.Ogro;
import jogo.Spawner;
import jogo.Zumbi;

public class OJogo {

	public static void main(String[] args) throws Exception {
		Spawner<Ogro> caverna = new Spawner<Ogro>(new Ogro());
		
		Ogro clone = caverna.spawn();
		System.out.println(clone);
		
		Spawner<Zumbi> lab = new Spawner<Zumbi>(new Zumbi());
		
		Zumbi zClone = lab.spawn();
		System.out.println(zClone);
		System.out.println(lab.spawn());
		
		Zumbi superZ = lab.spawn();
		superZ.setVida(100);
		System.out.println(superZ);

	}

}
	