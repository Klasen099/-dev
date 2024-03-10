package startingjava;

import java.util.List;
import java.util.Scanner;

public class Fonksiyonlar {

		
		
		public static void menuGoruntule() {
			System.out.println("1. Kayıt Girişi\n" + "2. Listeleme\n" + "3. İsim İle Arama\n" + "4. Düzeltme\n"
					+ "5. Silme\n" + "6. Ortalama Sayfa Sayısı\n" + "7. En Büyük Sayfa Sayısı\n"
					+ "8. En Düşük Sayfa Sayısı\n" + "9. Çıkış\n" + "Menü seçimi: ");

		}

		public static void kayitEkle(Scanner scanner, List<String> ad, List<String> yazar, List<String> yayın,
				List<Long> sayfaSayisi, List<Long> basimYili, List<Long> fiyat) {
			System.out.println("Kitap ismini girin: ");
			ad.add(scanner.next());

			System.out.println("Yazar adı: ");
			yazar.add(scanner.next());

			System.out.println("Yayınevi adı: ");
			yayın.add(scanner.next());

			System.out.println("Sayfa sayısı: ");
			sayfaSayisi.add(scanner.nextLong());

			System.out.println("Basım yılı: ");
			basimYili.add(scanner.nextLong());

			System.out.println("Fiyatı girin: ");
			fiyat.add(scanner.nextLong());

			System.out.println("kayıt yapıldı.");

		}

		public static void listele(List<String> ad, List<String> yazar, List<String> yayın, List<Long> sayfaSayisi,
				List<Long> basimYili, List<Long> fiyat) {
			for (int i = 0; i < ad.size(); i++) {
				yazdir(i, ad.get(i), yazar.get(i), yayın.get(i), sayfaSayisi.get(i), basimYili.get(i), fiyat.get(i));
			}

		}

		private static void yazdir(int indis, String ad, String yazar, String yayın, Long sayfaSayisi, Long basimYili,
				Long fiyat) {
			System.out.println("İndis değeri: " + indis);
			System.out.println("İsim: " + ad);
			System.out.println("Yazar: " + yazar);
			System.out.println("Yayın evi: " + yayın);
			System.out.println("Sayfa sayısı: " + sayfaSayisi);
			System.out.println("Basım yılı: " + basimYili);
			System.out.println("Fiyat: " + fiyat);
			System.out.println("---------------------");
		}

		public static void isimAra(Scanner scanner, List<String> ad, List<String> yazar, List<String> yayın,
				List<Long> sayfaSayisi, List<Long> basimYili, List<Long> fiyat) {
			System.out.println("Aranacak ismi girin: ");
			String arananAd = scanner.next();

			for (int i = 0; i < ad.size(); i++) {
				if (ad.get(i).equalsIgnoreCase(arananAd)) {
					yazdir(i, ad.get(i), yazar.get(i), yayın.get(i), sayfaSayisi.get(i), basimYili.get(i), fiyat.get(i));
				}
			}

		}

		public static void duzelt(Scanner scanner, List<String> ad, List<String> yazar, List<String> yayın,
				List<Long> sayfaSayisi, List<Long> basimYili, List<Long> fiyat) {

			System.out.println("Düzeltilecek ismi girin: ");
			String duzeltilecekAd = scanner.next();

			isimAra(scanner, ad, yazar, yayın, sayfaSayisi, basimYili, fiyat);

			System.out.println("Hangi indisdeki kaydı düzelteceksiniz: ");
			int duzeltilecek = scanner.nextInt();

			System.out.println("Yeni ismi girin: ");
			ad.set(duzeltilecek, scanner.next());

			System.out.println("Yazarı girin: ");
			yazar.set(duzeltilecek, scanner.next());

			System.out.println("Yayın evini girin: ");
			yayın.set(duzeltilecek, scanner.next());

			System.out.println("Sayfa sayısını girin: ");
			Long sayfaSayisiYeni = scanner.nextLong();

			System.out.println("Basım yılını girin: ");
			Long basimYiliYeni = scanner.nextLong();

			System.out.println("Fiyatı girin: ");
			Long fiyatYeni = scanner.nextLong();

			sayfaSayisi.set(duzeltilecek, sayfaSayisiYeni);
			basimYili.set(duzeltilecek, basimYiliYeni);
			fiyat.set(duzeltilecek, fiyatYeni);

			System.out.println(duzeltilecekAd + " kaydı başarıyla düzeltildi.");

		}

		public static void sil(Scanner scanner, List<String> ad, List<String> yazar, List<String> yayın,
				List<Long> sayfaSayisi, List<Long> basimYili, List<Long> fiyat) {

			System.out.println("Silinecek ismi girin: ");
			String silinecekAd = scanner.next();

			isimAra(scanner, ad, yazar, yayın, sayfaSayisi, basimYili, fiyat);

			System.out.println("Hangi indisdeki kaydı sileceksiniz: ");
			int silinecek = scanner.nextInt();

			ad.remove(silinecek);
			yazar.remove(silinecek);
			yayın.remove(silinecek);
			sayfaSayisi.remove(silinecek);
			basimYili.remove(silinecek);
			fiyat.remove(silinecek);

			System.out.println(silinecekAd + " kaydı başarıyla silindi.");

		}

		public static void sayfaSayisiOrtalamaHesapla(List<Long> sayfaSayisi) {
			if (sayfaSayisi.isEmpty()) {
				System.out.println("Kayıt bulunmamaktadır.");
				return;
			}

			long toplamSayfa = 0;
			for (Long sayfa : sayfaSayisi) {
				toplamSayfa += sayfa;
			}

			double ortalama = (double) toplamSayfa / sayfaSayisi.size();
			System.out.println("Sayfa sayısı ortalaması: " + ortalama);

		}

		public static void enBuyukSayfaSayisi(List<String> ad, List<Long> sayfaSayisi) {
			if (sayfaSayisi.isEmpty()) {
				System.out.println("Kayıt bulunmamaktadır.");
				return;
			}

			long enBuyukSayfa = sayfaSayisi.get(0);
			int enbuyuk = 0;

			for (int i = 1; i < sayfaSayisi.size(); i++) {
				if (sayfaSayisi.get(i) > enBuyukSayfa) {
					enBuyukSayfa = sayfaSayisi.get(i);
					enbuyuk = i;
				}
			}

			System.out.println("En büyük sayfa sayısı " + ad.get(enbuyuk) + " kitabına aittir: " + enBuyukSayfa);

		}

		public static void enDusukSayfaSayisi(List<String> ad, List<Long> sayfaSayisi) {
			if (sayfaSayisi.isEmpty()) {
				System.out.println("Kayıt bulunmamaktadır.");
				return;
			}

			long enDusukSayfa = sayfaSayisi.get(0);
			int endusuk = 0;

			for (int i = 1; i < sayfaSayisi.size(); i++) {
				if (sayfaSayisi.get(i) < enDusukSayfa) {
					enDusukSayfa = sayfaSayisi.get(i);
					endusuk = i;
				}
			}

			System.out.println("En düşük sayfa sayısı " + ad.get(endusuk) + " kitabına aittir: " + enDusukSayfa);

		}

	}
