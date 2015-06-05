package soru_7;

public class ternarySearch {

	    int size;

	    public static void main(String[] args) {

	        int[] dizi = {2, 5, 7, 9, 12, 15, 34, 76, 87, 123 };

	        int size= dizi.length;
	        int aranan_sayi=87;
	       
	        int sol_baslangic = 0;
	        int orta_baslangic = dizi.length / 3;
	        int sag_baslangic = orta_baslangic * 2;
	        int sag_bitis = size - 1;

	        while (orta_baslangic >= sol_baslangic) {
	            int test_et = (sol_baslangic + orta_baslangic) / 2;
	            if (dizi[test_et] == aranan_sayi) {
	                System.out.println("bulunan"+ aranan_sayi);
	            }
	            if (dizi[test_et] < aranan_sayi) {
	                sol_baslangic = test_et + 1;
	                while (sag_baslangic >= orta_baslangic) {

	                    int test_et2 = (orta_baslangic + sag_baslangic) / 2;
	                    if (dizi[test_et] == aranan_sayi) {
	                    	System.out.println("bulunan"+ aranan_sayi);
	                    }
	                    orta_baslangic = test_et2 + 1;
	                }
	                while (sag_bitis >= sag_baslangic) {

	                    int test_et3 = (sag_bitis + sag_baslangic) / 2;
	                    if (dizi[test_et] == aranan_sayi) {
	                    	System.out.println("bulunan"+ aranan_sayi);
	                    }
	                    sag_baslangic = test_et3 + 1;
	                }

	            }
	            if (dizi[test_et] > aranan_sayi) {
	                sag_baslangic = test_et - 1;

	            }
	        }
	        System.out.println("sayi bulunamadi");
	    }
	
	}
