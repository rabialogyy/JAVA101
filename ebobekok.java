import java.util.Scanner;
public class ebobekok {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in) ;
        System.out.println("EBOB - EKOK bulan program");

        System.out.println("n1 sayısını giriniz:");
        int n1=input.nextInt();
        System.out.println("n2 sayısını  giriniz:");
        int n2 =input.nextInt();
        int ebob=1;

       /* for (int i=1; i<=n1;i++){
            if (n1%i==0 && n2%i==0){
                System.out.println(i);
                ebob=i;
            }

        }
        System.out.println("==");
        for (int k=n1; k>=1; k-- ){
            if (n1%k==0 && n2%k==0){
                ebob=k;
                System.out.println("EBOB:"+ebob);
                break;
            }
        }
        for (int i=1; i<=(n1*n2);i++){
            if (i%n1==0 && i%n2 ==0){
                System.out.println("ekok:"+i )  ;
                break;
            }
        }

        */


        // WHİLE DÖNGÜSÜ İLE YAPIMI
        int i=1;
        while( i <=n1){
            i++;
            if (n1%i==0&& n2%i==0){
                ebob=i;
            }

        }
        int ekok=1;
        ekok =(n1*n2)/ebob;
        System.out.println("EBOB:"+ebob);
        System.out.println("EKOK:"+ekok);














    }








}
