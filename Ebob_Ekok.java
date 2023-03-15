
package ebob_ekok;

import java.util.Scanner;

public class Ebob_Ekok {

    public static void main(String[] args) {
        
        Scanner giris=new Scanner(System.in);
        int n,sayi;
        int max=Integer.MIN_VALUE, min= Integer.MAX_VALUE;
        //max value en yüksek değeri tutar, minde en düşük
        System.out.println("kaç adet sayi gircen: ");
        n=giris.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i+". sayiyi gir:");
            sayi=giris.nextInt();
            if(sayi>max){
                max=sayi;
            }
             if(sayi<min){
                min=sayi;
            }   
        }
        System.out.println("en büyük sayi "+max+"en kucuk sayi "+min);
    }
    
}
