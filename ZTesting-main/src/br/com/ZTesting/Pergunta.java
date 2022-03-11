package br.com.ZTesting;

import java.util.Scanner;

public class Pergunta {
	
	 Scanner entrada= new Scanner(System.in);
	 
	 private char marcaProcessador;
	 private char marcaPlaca;
	 private char modeloPlaca;
	 private char modeloProcessador;
	 private String memoriaRam;
	 private int e;
	 private int v;
	 private int m = Integer.parseInt("0");
	 private String regex = "^[A-Za-z]+$";
	 	 
	 void escolhaMarcaProcessador () {
		 System.out.println("Qual a Marca do seu processador?");
		 System.out.println("\n1.Intel\n2.AMD");
		 marcaProcessador = entrada.next().charAt(0);
		 System.out.println("\n==================================================================\n");
		 
		 while(getMarcaProcessador() != '1' && getMarcaProcessador() != '2') {
			 System.out.println("Valor digitado invalido. \n\nQual o Marca do seu processador?");
			 System.out.println("\n1.Intel\n2.AMD");			
			 setMarcaProcessador(entrada.next().charAt(0));
			 System.out.println("\n==================================================================\n");
		 }
		 
		 if(getMarcaProcessador() == '1') {
			 escolhaProcessadorIntel();
		 }
		 
		 else {
			 escolhaProcessadorAMD();
			 
		 }	 
	 }
	 
	 void escolhaProcessadorIntel () { 	 
			 System.out.println("Selecione o Modelo Intel do seu processador:");
			 System.out.println("\n1.Core 2 duo E4500\n2.I3 4330\n3.i5-8400");			
			 setModeloProcessador(entrada.next().charAt(0));
			 System.out.println("\n==================================================================\n");
			 
			 while(getModeloProcessador() != '1' && getModeloProcessador() != '2' && getModeloProcessador()!= '3') {
				 System.out.println("Valor digitado invalido. \n\nQual o Modelo do seu processador?");
				 System.out.println("\n1.Core 2 duo E4500\n2.I3 4330\n3.i5-8400");				
				 setModeloProcessador(entrada.next().charAt(0));
				 System.out.println("\n==================================================================\n");
			 }
			 e = (int) Character.getNumericValue(getModeloProcessador());
	 }

	void escolhaProcessadorAMD() {
			
			 System.out.println("Selecione o Modelo AMD do seu processador:");
			 System.out.println("\n1.Athlon 64 X2 4800 plus\n2.ryzen 3 1200\n3.ryzen 3 3300x");
			 setModeloProcessador(entrada.next().charAt(0));	
			 System.out.println("\n==================================================================\n");
			 
			 while(getModeloProcessador() != '1' && getModeloProcessador() != '2' && getModeloProcessador()!= '3') {
				 System.out.println("Valor digitado invalido. \n\nQual o Modelo do seu processador?");
				 System.out.println("\n1.Athlon 64 X2 4800 plus\n2.ryzen 3 1200\n3.ryzen 3 3300x");
				 setModeloProcessador(entrada.next().charAt(0));
				 System.out.println("\n==================================================================\n");
				 
			 }
			 e = (int) Character.getNumericValue(getModeloProcessador());
	 }
	
	void escolhaPlacaDeVideo() {
		
		
		System.out.println("Qual a marca da sua placa de v�deo? ");
		System.out.println("\n1.Integrada \n2.Nvidia \n3.AMD");
		setMarcaPlaca(entrada.next().charAt(0));
		 System.out.println("\n==================================================================\n");
		
		 while(getMarcaPlaca() != '1' && getMarcaPlaca() != '2' && getMarcaPlaca() != '3') {
			 System.out.println("Valor digitado invalido. \n\nQual a Marca da sua placa de v�deo?");
			 System.out.println("\n1.Integrada\n2.Nvidia\n3.AMD");
			 setMarcaPlaca(entrada.next().charAt(0));	
			 System.out.println("\n==================================================================\n");
			 
			 
		 }
		 
		 if(getMarcaPlaca() == '2') {
			 
			 escolhaPlacaDeVideoNvidia();
			
		 }
		 
		 else if(getMarcaPlaca() == '3') {
			 
			 escolhaPlacaDeVideoAMD();
			 			 
		 }
		 
		 else {
			 v = (int) Character.getNumericValue(getMarcaPlaca());
			 
		 }		 
	}

	void escolhaPlacaDeVideoNvidia() {
		
		 System.out.println("Selecione o Modelo Nvidia da sua Placa de V�deo:");
		 System.out.println("\n1.Geforce GT 520\n2.Geforce GT 730\n3.Geforce GTX 650");
		 setModeloPlaca(entrada.next().charAt(0));
		 System.out.println("\n==================================================================\n");
		 
		 while(getModeloPlaca() != '1' && getModeloPlaca() != '2' && getModeloPlaca()!= '3') {
			 System.out.println("Valor digitado invalido. \n\nQual o Modelo da sua Placa de V�deo?");
			 System.out.println("\n1.Geforce GT 520\n2.Geforce GT 730\n3.Geforce GTX 650");
			 setModeloPlaca(entrada.next().charAt(0));	
			 System.out.println("\n==================================================================\n");
		 }
		 v = (int) Character.getNumericValue(getModeloPlaca());
	}
	
	void escolhaPlacaDeVideoAMD() {
		
		 System.out.println("Selecione o Modelo AMD da sua Placa de V�deo:");
		 System.out.println("\n1.Geforce GT 520\n2.Geforce GT 730\n3.Geforce GTX 650");
		 setModeloPlaca(entrada.next().charAt(0));
		 System.out.println("\n==================================================================\n");
		 
		 while(getModeloPlaca() != '1' && getModeloPlaca() != '2' && getModeloPlaca()!= '3') {
			 System.out.println("Valor digitado invalido. \n\nQual o Modelo da sua Placa de V�deo?");
			 System.out.println("\n1.Radeon HD 5570\n2.Radeon R7 240\n3.Radeon RX 550");
			 setModeloPlaca(entrada.next().charAt(0));	
			 System.out.println("\n==================================================================\n");
		 }	
		 v = (int) Character.getNumericValue(getModeloPlaca());
	}
	
	void escolhaMemoriaRam() {
		
		System.out.println("Digite a quantidade de memoria Ram do seu computador:");
		setMemoriaRam(entrada.next());	
		 System.out.println("\n==================================================================\n");

		while(getMemoriaRam().matches(regex)) {
			System.out.println("Valor digitado invalido.");
			System.out.println("\nDigite quanto de memoria Ram seu computador tem ?");
			setMemoriaRam(entrada.next());	
			 System.out.println("\n==================================================================\n");
		
		}		
		m = Integer.parseInt(getMemoriaRam());

	}
		
			

	public char getMarcaProcessador() {
		return marcaProcessador;
	}

	public void setMarcaProcessador(char marcaProcessador) {
		this.marcaProcessador = marcaProcessador;
	}

	public char getModeloProcessador() {
		return modeloProcessador;
	}

	public void setModeloProcessador(char modeloProcessador) {
		this.modeloProcessador = modeloProcessador;
	}

	public char getMarcaPlaca() {
		return marcaPlaca;
	}

	public void setMarcaPlaca(char marcaPlaca) {
		this.marcaPlaca = marcaPlaca;
	}

	public char getModeloPlaca() {
		return modeloPlaca;
	}

	public void setModeloPlaca(char modeloPlaca) {
		this.modeloPlaca = modeloPlaca;
	}

	public String getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(String memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}
	
}
