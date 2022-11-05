package yemekKarti2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		String[] yemekler = {"Kofte = 15", "Patates = 12", "Ayran = 6", "Cigkofte = 17", "Doner = 22 "};
		
		int kullanici, kullaniciNo, sifre,  wantBakiye, bakiye = 0, loadedMoney, islem, yemekSec, paraYatir;
		boolean kart = false;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kullanici seciniz: ");
		System.out.println("\n 1- Ogrenci \n 2- Akademisyen \n 3- Idari Personel");
		kullanici = scan.nextInt();
		
		
		
		if(kullanici == 1 || kullanici == 2 || kullanici == 3) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Kullanici numaranizi giriniz: ");
			kullaniciNo = scanner.nextInt();
			System.out.println("Sifrenizi giriniz: ");
			sifre = scanner.nextInt();
			
			YemekKarti yemekKarti = new YemekKarti(kullaniciNo, sifre,bakiye);
			
			System.out.println("Bakiye yuklemek ister misiniz? \n 1- Evet \n 2- Hayir");
			wantBakiye = scanner.nextInt();
			
			if(wantBakiye == 1) {
				System.out.println("Ne kadar yuklemek istersiniz? :");
				loadedMoney = scanner.nextInt();
				yemekKarti.setBakiye(loadedMoney);
				
				System.out.println("Guncel bakiyeniz: " + yemekKarti.getBakiye());
			}else {
				bakiye = 100;
				yemekKarti.setBakiye(bakiye);
				System.out.println("Guncel bakiyeniz: " + yemekKarti.getBakiye());
			}
			
			kart = true;
			
			while(kart) {
				Scanner scanner2 = new Scanner(System.in);
				
				System.out.println("Yapmak istediginiz islemi seciniz: \n 1- Yemek almak \n 2- Bakiye sorgulama \n 3- Para yatirma \n 4- Cikis yap");
				islem = scanner2.nextInt();
				
				if(islem == 1) {
					for(int i = 0; i < yemekler.length; i++) {
						System.out.printf("%d = %s",   i, yemekler[i]);
						System.out.println("\n");
					}
					
					System.out.println("Bir yemek seciniz: ");
					yemekSec = scanner2.nextInt();
					
					yemekKarti.removeBakiye(yemekSec);
					
					System.out.println("Aldiginiz yemek: " + yemekler[yemekSec]);
					System.out.println("Guncel bakiyeniz: " + yemekKarti.getBakiye());
				}else if(islem == 2) {
					System.out.println("Guncel bakiyeniz: " +  yemekKarti.getBakiye());
				}else if(islem == 3) {
					System.out.println("Yatirmak istediginiz miktari giriniz: ");
					paraYatir = scanner2.nextInt();
					
					yemekKarti.setBakiye(paraYatir);
					
					System.out.println("Guncel bakiye: " + yemekKarti.getBakiye());
				}else if(islem == 4) {
					kart = false;
					
					System.out.println("Hoscakalin! yine bekleriz");
				}
			}
			
			
			
		}		
	}
}
