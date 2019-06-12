package br.ufba.mata55.celular;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Veneno extends Entidade {

    public Veneno() {
        Random gerador = new Random();
        this.setX(gerador.nextInt(501));
        this.setY(gerador.nextInt(501));
        this.setTamanho(gerador.nextInt(18) + 3);
    }

    public void desenha(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(getX() - getTamanho() / 2, getY() - getTamanho() / 2, getTamanho(), getTamanho());
        g.setColor(Color.cyan);
        g.fillOval(getX() - getTamanho() / 2, getY() - getTamanho() / 2, getTamanho(), getTamanho());
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getTamanho() {
        return tamanho;
    }

    @Override
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public boolean isAtivo() {
        return ativo;
    }

    @Override
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
