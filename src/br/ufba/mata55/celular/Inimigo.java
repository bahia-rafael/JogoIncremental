package br.ufba.mata55.celular;

import java.util.Random;

public class Inimigo extends Veneno {
	public Inimigo() {
		   Random random = new Random();
		    this.x = random.nextInt(499);
		    this.y = random.nextInt(499);
		    this.tamanho = random.nextInt(8) + 3;

		        this.ativo = true;
		
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

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public String getCor() {
		return getCor();
	}

	public void setCor(String cor) {
	}
}
