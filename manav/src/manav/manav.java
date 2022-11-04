package manav;

import java.util.Scanner;

public class manav {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		double armut = 2.14;
		double elma = 3.67;
		double domates = 1.11;
		double muz = 0.95;
		double patlican = 5.0;

		System.out.println("Armut kaç kilo?  ");
		double armutMiktar = myObj.nextDouble(); 
		
		System.out.println("Elma kaç kilo?  ");
		double elmaMiktar = myObj.nextDouble(); 
		
		System.out.println("Domates kaç kilo?  ");
		double domatesMiktar = myObj.nextDouble(); 
		
		System.out.println("Muz kaç kilo?  ");
		double muzMiktar = myObj.nextDouble(); 
		
		System.out.println("patlican kaç kilo?  ");
		double patlicanMiktar = myObj.nextDouble(); 

		double toplam = (armut*armutMiktar+elma*elmaMiktar+domates*domatesMiktar+muz*muzMiktar+patlican*patlicanMiktar);

		System.out.println("Toplam tutar: "+toplam);
	}

}
