package br.ufba.mata55.celular;

import java.lang.Math;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Terreno {

    private int largura = 500;
    private int altura = 500;
    private ArrayList<Comida> comidas = new ArrayList<>();
    private ArrayList<Veneno> venenos = new ArrayList<>();
    private Celula celula = new Celula();

    public void adicionaElemento() {
        Comida comida = new Comida();
        comidas.add(comida);
        Veneno veneno = new Veneno();
        venenos.add(veneno);
    }

    public void atualizaPosicao() {
        
        if (this.celula != null) {
            this.adicionaElemento();
            this.colide();
            for (int i = 0; i < this.getComidas().size(); i++) {
                if (this.getComidas().get(i).isAtivo() == false) {
                    this.getComidas().remove(i);
                }
            }

            for (int i = 0; i < this.getVenenos().size(); i++) {
                if (this.getVenenos().get(i).isAtivo() == false) {
                    this.getVenenos().remove(i);
                }
            }
        }

    }

    public void colide() {
        double metade, distancia, subx, suby, raiz;
        int i;

        for (i = 0; i < comidas.size(); i++) {
            subx = comidas.get(i).getX() - celula.getX();
            suby = comidas.get(i).getY() - celula.getY();
            subx = subx * subx;
            suby = suby * suby;
            raiz = subx + suby;
            distancia = Math.sqrt(raiz);

            metade = (comidas.get(i).getTamanho() + celula.getTamanho()) / 2;
            if (distancia < metade) {
                comidas.get(i).setAtivo(false);
                celula.setTamanho(celula.getTamanho() + 1);
            }

        }

        for (i = 0; i < venenos.size(); i++) {
            subx = venenos.get(i).getX() - celula.getX();
            suby = venenos.get(i).getY() - celula.getY();
            subx = subx * subx;
            suby = suby * suby;
            raiz = subx + suby;
            distancia = Math.sqrt(raiz);
            metade = (venenos.get(i).getTamanho() + celula.getTamanho()) / 2;

            if (distancia < metade) {
                venenos.get(i).setAtivo(false);
                celula.setTamanho(celula.getTamanho() - 1);
            }

            if (celula.getTamanho() < 3) {
                celula.setAtivo(false);
                celula = null;
                return;
            }
        }

    }

    public void desenha(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, largura, altura);
        if (this.getCelula() != null) {
            this.getCelula().desenha(g);

            for (Comida c : this.getComidas()) {
                c.desenha(g);
            }

            for (Veneno v : this.getVenenos()) {
                v.desenha(g);
            }
        }
    }

    public Celula getCelula() {
        return celula;
    }

    public void setCelula(Celula celula) {
        this.celula = celula;
    }

    public ArrayList<Comida> getComidas() {
        return comidas;
    }

    public void setComidas(ArrayList<Comida> comidas) {
        this.comidas = comidas;
    }

    public ArrayList<Veneno> getVenenos() {
        return venenos;
    }

    public void setVenenos(ArrayList<Veneno> venenos) {
        this.venenos = venenos;
    }

}
