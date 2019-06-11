package br.ufba.mata55.celular;
import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;

public class Comida extends Entidade{



    public Comida() {
    	Random gerador = new Random();
    	this.setX(gerador.nextInt(501));
    	this.setY(gerador.nextInt(501));
    	this.setTamanho(gerador.nextInt(14)+3);    	
    }
    
    Random gerador = new Random();
	
	public void desenha(Graphics g) {		 
		 g.setColor(Color.GREEN);
	     g.fillRect(getX()-getTamanho()/2, getY()-getTamanho()/2, getTamanho(), getTamanho());
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public Random getGerador() {
		return gerador;
	}

	public void setGerador(Random gerador) {
		this.gerador = gerador;
	}
	
}
