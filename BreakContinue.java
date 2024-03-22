package test;

public class BreakContinue {

	public static void main(String[] args) {
		// Break Continue Örnek Kullanımı
		boolean a = true;
		int b= 0, c =0;
		while (a) {
			System.out.println("Bu" +c + ". tekrar yazıldı");
			b++;
			c++;
			if (b == 6) {
				c++;
				continue;
			}
			if (b == 10) {
				break;
			}
		}
		System.out.println("Döngü Bitti");
	}

}
