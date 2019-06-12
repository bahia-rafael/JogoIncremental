package br.ufba.mata55.celular;

import java.util.Random;

public class Inimigo extends Veneno {

    private String cor;

    public Inimigo() {
        Random random = new Random();
        this.x = random.nextInt(499);
        this.y = random.nextInt(499);
        this.tamanho = random.nextInt(8) + 3;
        this.ativo = true;

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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
