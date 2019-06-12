package br.ufba.mata55.celular;

import java.awt.Color;
import java.awt.Graphics;

public class Celula extends Entidade {

    public Celula() {
        this.setX(Controle.mouseX);
        this.setY(Controle.mouseY);
    }

    public void desenha(Graphics g) {
        setX(Controle.mouseX);
        setY(Controle.mouseY);
        g.setColor(Color.WHITE);
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

    public void setPoderAtivo(int i) {
        // TODO Auto-generated method stub

    }

}
