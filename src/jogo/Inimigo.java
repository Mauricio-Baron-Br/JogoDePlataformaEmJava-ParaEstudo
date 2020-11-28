package jogo;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Inimigo {
	private Image imagem;
	private int x, y;
	private int largura, altura;
	private boolean isVisivel;
	private static int contador;

	private static final int LARGURA_TELA = 500;
	private static final int VELOCIDADE = 2;

	public Inimigo(int x, int y) {
		this.x = x;
		this.y = y;
		ImageIcon referencia;
		if (contador++ % 3 == 0) {
			referencia = new ImageIcon("res\\inimigo_1.gif");
		} else {
			referencia = new ImageIcon("res\\inimigo_2.gif");
		}
		imagem = referencia.getImage();
		this.largura = imagem.getWidth(null);
		this.altura = imagem.getHeight(null);

		isVisivel = true;

	}

	public void mexer() {
		if (this.x < 0) {
			this.x = LARGURA_TELA;
		} else {
			this.x -= VELOCIDADE;
		}
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

	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	public Image getImagem() {
		return imagem;
	}

	public Rectangle getBounds() {

		return new Rectangle(x, y, largura, altura);

	}

}
