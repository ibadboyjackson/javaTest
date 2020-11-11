package javaTest;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		double pu, qte, total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Prix unitaire");
		
		pu = sc.nextDouble();
		
		System.out.println("Quantité");
		
		qte = sc.nextDouble();
		
		total = pu * qte;
		
		System.out.println("Le total est :" +total);
	}
	
}
