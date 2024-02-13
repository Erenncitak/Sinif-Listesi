package proje;
import java.util.Scanner;

public class Proje {
    
    static String[] veriEkle(String[] dizi, String yeniEleman) {
        String[] yeniDizi = new String[dizi.length + 1];
        System.arraycopy(dizi, 0, yeniDizi, 1, dizi.length);
        yeniDizi[0] = yeniEleman;
        return yeniDizi;
    }

    static int[] veriEkle(int[] dizi, int yeniEleman) {
        int[] yeniDizi = new int[dizi.length + 1];
        System.arraycopy(dizi, 0, yeniDizi, 1, dizi.length);
        yeniDizi[0] = yeniEleman;
        return yeniDizi;
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
			String[] tckim = {"12345665432", "98765567892", "13579975311", "65465432113"};
			String[] adi = {"Aslı", "Mehmet", "Derya", "Sedat"};
			String[] soyadi = {"KARA", "UZUN", "DEMİR", "SERT"};
			String[] email = {"aslikara@msn.com", "muzun@google.com.tr", "demirderya@yahoo.com", "sedatsert@hotmail.com"};
			String[] telefon = {"532 544 89 99", "505 325 44 70", "537 888 23 00", "541 777 54 29"};
			String[] bolum = {"Bilgisayar", "Makina", "YBS", "Tıp"};
			String[] dyeri = {"İstanbul", "Artvin", "Aydın", "Denizli"};
			int[] vize = {44, 76, 61, 84};
			int[] finsinav = {40, 30, 50, 95};
			
			anaMenu:
			while (true) {
			    System.out.println("[1] Tüm öğrencilerin listelenmesi\n"
			            + "[2] İstenilen bir öğrencinin listelenmesi\n"
			            + "[3] “0 - sıfır” indise bir veri eklenmesi");

			    int secim;
			    secim = Integer.parseInt(input.nextLine());

			    if (secim > 0 && secim < 4) {

			        switch (secim) {
			            case 1:
			            		for (int i = 0; i < tckim.length; i++) {
				                    System.out.println("Adı: " + adi[i]);
				                    System.out.println("Soyadı: " + soyadi[i]);
				                    System.out.println("E-mail: " + email[i]);
				                    System.out.println("Bölüm: " + bolum[i]);
				                    System.out.println("Telefon: " + telefon[i]);
				                    System.out.println("T.C: " + tckim[i]);
				                    System.out.println("Doğum Yeri: " + dyeri[i]);
				                    if ((vize[i] + finsinav[i]) / 2 >= 50) {
				                        System.out.println("Tebrikler Geçtiniz.!!");
				                        System.out.println("Ortalamanız: " + (vize[i] + finsinav[i]) / 2);
				                    } else {
				                        System.out.println("Üzgünüm Kaldınız.!!");
				                        System.out.println("Ortalamanız: " + (vize[i] + finsinav[i]) / 2);
				                    }
				                    System.out.println("");
				                }
			                break;
			            case 2:
			            	String tc;
			            	System.out.println("T.C Giriniz: ");
			                tc = input.nextLine().trim();
			                
			                int yeniTc=-1;			                
			                
		                    for (int i = 0; i < tckim.length; i++) {
		                        if (tckim[i].equals(tc)) {
		                            yeniTc = i;
		                            break;
		                        }
		                    }
		                    
			                		System.out.println("Adı: " + adi[yeniTc]);
				                    System.out.println("Soyadı: " + soyadi[yeniTc]);
				                    System.out.println("E-mail: " + email[yeniTc]);
				                    System.out.println("Bölüm: " + bolum[yeniTc]);
				                    System.out.println("Telefon: " + telefon[yeniTc]);
				                    System.out.println("T.C: " + tckim[yeniTc]);
				                    System.out.println("Doğum Yeri: " + dyeri[yeniTc]);
				                    if ((vize[yeniTc] + finsinav[yeniTc]) / 2 >= 50) {
				                        System.out.println("Tebrikler Geçtiniz.!!");
				                        System.out.println("Ortalamanız: " + (vize[yeniTc] + finsinav[yeniTc]) / 2);
				                    } else {
				                        System.out.println("Üzgünüm Kaldınız.!!");
				                        System.out.println("Ortalamanız: " + (vize[yeniTc] + finsinav[yeniTc]) / 2);
				                    }
			                
		                    break;
		                    
			            case 3:
			            	
			                System.out.print("Ad: ");
			                String yeniAd = input.nextLine();

			                System.out.print("Soyad: ");
			                String yeniSoyad = input.nextLine();

			                System.out.print("T.C: ");
			                String yeniTcc = input.nextLine();

			                System.out.print("E-mail: ");
			                String yeniEmail = input.nextLine();

			                System.out.print("Telefon: ");
			                String yeniTelefon = input.nextLine();

			                System.out.print("Bölüm: ");
			                String yeniBolum = input.nextLine();

			                System.out.print("Doğum Yeri: ");
			                String yeniDyeri = input.nextLine();

			                System.out.print("Vize Notu: ");
			                int yeniVize = Integer.parseInt(input.nextLine());

			                System.out.print("Final Notu: ");
			                int yeniFinal = Integer.parseInt(input.nextLine());

			                adi = veriEkle(adi, yeniAd);
			                soyadi = veriEkle(soyadi, yeniSoyad);
			                tckim = veriEkle(tckim, yeniTcc);
			                email = veriEkle(email, yeniEmail);
			                telefon = veriEkle(telefon, yeniTelefon);
			                bolum = veriEkle(bolum, yeniBolum);
			                dyeri = veriEkle(dyeri, yeniDyeri);
			                vize = veriEkle(vize, yeniVize);
			                finsinav = veriEkle(finsinav, yeniFinal);

			                break;

			            default:
			                System.out.println("Yanlış seçim yaptınız tekrar deneyiniz.!!");
			                break;
			        }
			    } 
			    else {
			        System.out.println("Lütfen 1-2 veya 3'ü seçiniz..!!");
			    }
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
}
}