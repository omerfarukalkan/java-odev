package yemekKarti2;

public class YemekKarti {
	private int bakiye;
	private int kullaniciNo;
	private int sifre;
	
	public YemekKarti(int kullaniciNo, int sifre,  int bakiye) {
		this.bakiye = bakiye;
		this.kullaniciNo = kullaniciNo;
		this.sifre = sifre;
	}

	void setBakiye(int newBakiye) {
		this.bakiye += newBakiye;
	}
	
	int getBakiye() {
		return this.bakiye;
	}
	
	void removeBakiye(int yemek) {
		
		if(bakiye <= 0) {
			System.out.println("Yetersiz bakiye!");
		}
		
		switch(yemek) {
			case 1:
				this.bakiye = this.bakiye - 15;
			case 2:
				this.bakiye = this.bakiye - 12;
			case 3:
				this.bakiye = this.bakiye - 6;
			case 4:
				this.bakiye = this.bakiye - 17;
			case 5:
				this.bakiye = this.bakiye - 2;
		}
	}
}

