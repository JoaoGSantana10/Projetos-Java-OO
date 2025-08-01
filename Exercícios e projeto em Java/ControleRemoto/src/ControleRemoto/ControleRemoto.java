package ControleRemoto;
public class ControleRemoto implements Controlador {

	// Atributos
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	// Métodos Especiais
	
	public ControleRemoto() {
		
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
		
	private int getVolume() {
		
		return volume;
	}
	
	private int setVolume(int v) {
		
		return this.volume = volume;
	}
	
	private boolean getLigado() {
		
		return ligado;
	}

	private boolean setLigado(boolean ligado) {
		
		return this.ligado = ligado;
	}
	
	private boolean getTocando() {
		
		return tocando;
	}
	
	private boolean setTocando(boolean tocando) {
		
		return this.tocando = tocando;
	}

	@Override
	public void ligar() {
		
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("---MENU---");
		System.out.println("Está ligado? " + this.getLigado() );
		System.out.println("Está tocando? " + this.getTocando());
		System.out.print("Volume: " + this.getVolume());
		
		for (int i = 0; i <= this.getVolume(); i+=10) {
			System.out.print("|");
		}
		
	}

	@Override
	public void fecharMenu() {
		System.out.println("\n");
		System.out.println("Fechando Menu...");
		
	}

	@Override
	public void maisVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() + 5);
		}
		else {
			System.out.println("Impossível aumentar volume");
		}
	}

	@Override
	public void menosVolume() {
		if (this.getLigado()) {
			this.setVolume(this.getVolume() - 5);
		}
		else {
			System.out.println("Impossível diminuir volume");
		}
	}

	@Override
	public void ligarMudo() {
	if (this.getLigado() && this.getVolume() > 0) {
		this.setVolume(0);
	}
		
	}

	@Override
	public void desligarMudo() {
	if (this.getLigado() && this.getVolume() == 0) {
		this.setVolume(50);
	}
		
	}

	@Override
	public void play() {
		if (this.getLigado() && (this.getTocando())) {
			this.setTocando(true);
		} else {
				System.out.println("Não consegui reproduzir");
			}
	}

	@Override
	public void pause() {
		if ( this.getLigado() && !(this.getTocando())) {
			this.setTocando(false);
		} else {
				System.out.println("Não consegui pausar");
			}
	}
}
