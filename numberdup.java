import java.util.Arrays;
public class numberdup {
    public static void main(String[]args){
        int [] list={10,20,20,10,10,20,5,20};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        int counter=1;

       for(int i=0; i< list.length; i++){
           if(i==0){
               for ( int j=0; j< list.length; j++){
                   if(i!=j && list[i]== list[j]){
                       counter++;
                   }
               }
               System.out.println(list[i]+ " sayısı " +counter+" tekrar edildi.");
           } else if(list[i]!=list[i-1]){
               for (int j=0; j< list.length; j++){
                   if(i!=j && list[i]==list[j]){
                       counter++;
                   }
               }
               System.out.println(list[i]+ " sayısı " +counter+" tekrar edildi.");

           } counter=1;

       }



        }
    }

