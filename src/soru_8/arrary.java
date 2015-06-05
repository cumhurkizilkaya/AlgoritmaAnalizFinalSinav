package soru_8;
import java.util.Scanner;
import java.util.Random;

public class arrary {    

	    public static void main(String[] args) {
	        Random rand = new Random();
	        System.out.println("dizinin boyutunu giriniz :");
	        Scanner newsize = new Scanner (System.in);
	        int boyut=newsize.nextInt();
	        int [] dizi=new int[boyut];
	        for (int i = 0; i < dizi.length; i++) {
	            dizi[i]=rand.nextInt(100);
	            
	        }
	         System.out.println("random oluþturulan dizinin tersten yazilmis hali");
	        for (int i = dizi.length; i >0; i--) {
	           
	            System.out.print("//"+dizi[i-1]);
	            
	        }
	        
	    }
	    
	}