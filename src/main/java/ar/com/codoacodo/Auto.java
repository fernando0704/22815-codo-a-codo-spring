package ar.com.codoacodo;

public class Auto {
	
	/*
	 atributos
	*/
	private boolean encendido; //tipos de datos?//false
	private float velocidadActual;//alt+shit+r// > 0 
	private String marcas;//null
	private String modelo;//null
	private int anio;//0
	private float velocidadMaxima;//0
	
	//todas las clases tienen un constructor por defecto
	//contructor por defecto/explicito
	Auto() {
		//aca va el codigo cuando nace el auto
		this.encendido = false;//esta apagado
		this.velocidadMaxima = 200;
		this.velocidadActual = 0;
	}
	
	//new Auto(250)
	Auto(final float velocidadMaxima) {// const algo = "";
		//this
		this.velocidadActual = 0;
		this.velocidadMaxima = velocidadMaxima;
	}
		
	//metodos
	void encender() {
		if(!encendido) {
			System.out.println("se ha encendido");
			encendido = true;
		}else {
			System.out.println("ya esta encendido");
		}
	}
	
	void apagar() {
		
	}
	
	void acelerar() {
		if(this.encendido) {
			if(this.velocidadActual < velocidadMaxima) {
				System.out.println("acelerando");
				this.velocidadActual++;
			}else {
				System.out.println("se quema el auto");	
			}
		}else {
			System.out.println("debe encender el auto");
		}
	}
	
	void frenar() {
		
	}
	
	void mostrarInfo() {
		System.out.println("encendido:" + encendido);
	}
}

