package soru_6;
import java.util.*;

public class enfazlaSifir {
	public static void main(String[] args) {

        int[] dizi = {1,0, 0,1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0};

        int boyut = dizi.length;
        System.out.println("boyut= " + boyut);
        int sifir_baslangic = -1;
        int sifir_bitis = -1;

        List<ArrayInformation> yeniListe = new ArrayList<ArrayInformation>();

        for (int i = 0; i < boyut; i++) {
            if (dizi[i] == 0) {
                if (sifir_baslangic == -1) {
                    sifir_baslangic = i;
                }
            }
            if (dizi[i] == 1) {
                if (sifir_baslangic != -1) {
                    sifir_bitis = i;
                    ArrayInformation b1 = new ArrayInformation();

                    b1.setBaslangic(sifir_baslangic);
                    b1.setBitis(sifir_bitis);
                    b1.setBoyut(sifir_bitis - sifir_baslangic);
                    yeniListe.add(b1);

                    sifir_baslangic = -1;
                    sifir_bitis = -1;
                }
            }
        }
        int max_boyut = 0;
        int max_boyut_indis = 0;
        for (int i = 0; i < yeniListe.size(); i++) {
            ArrayInformation b2 = new ArrayInformation();
            b2 = yeniListe.get(i);
            if (b2.boyut > max_boyut) {
                max_boyut = b2.boyut;
                max_boyut_indis = i;
            }
        }
        ArrayInformation b2 = new ArrayInformation();
        b2 = yeniListe.get(max_boyut_indis);
        System.out.println("en cok sıfırlı dizinin boyutu  "+b2.getBoyut());
        System.out.println("en cok sıfırlı dizinin başlangic indisi  "+b2.getBaslangic());
        System.out.println("en cok sıfırlı dizinin bitiş indisi  "+b2.getBitis());
    }
}