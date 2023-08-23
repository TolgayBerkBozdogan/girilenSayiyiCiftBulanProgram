import java.util.Scanner;

public class girilenSayiyiCiftBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;
        System.out.print("Sayıyı giriniz: ");
        k = input.nextInt();

        /*for(int i =1; i<=k; i++ ){
            if(i %2 == 0) {
                System.out.println(i);
            }
        }*/
        int i = 1;
        while(i<=k){
            i++;
            if(i %2 == 0){
                System.out.println(i);

            }
        }


    }
}
