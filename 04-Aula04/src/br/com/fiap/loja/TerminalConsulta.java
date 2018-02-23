package br.com.fiap.loja;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class TerminalConsulta {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
			Calendar hoje = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println	("FIAP					  " + sdf.format(hoje.getTime()));
		System.out.println("*********************************************************");
		int codigo;
		do {
		System.out.print("Codigo do produto: ");
		codigo =sc.nextInt();
		if (codigo == 401){
		System.out.println("Camisera masculina");
		}else if (codigo == 102) {
		System.out.println("Camisa Feminina");
	}else if (codigo == 0) {
		System.out.println("Tchau");
		
	}else {
		System.out.println("Produto nao cadastrado");
		System.out.println();
	}
		}while(codigo !=0);
		System.out.println("FIm da aplicação");
		sc.close();

	}

}