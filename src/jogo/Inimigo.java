package jogo;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Inimigo implements Cloneable {

	private int velocidade;
	private int vida;

	public Inimigo(int vida, int velocidade) {
		this.vida = vida;
		this.velocidade = velocidade;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	@Override
	public String toString() {
		return velocidade + " " + vida;
	}
        
        public abstract Inimigo makeCopy();
	
}
