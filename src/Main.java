import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num,i=1;
        Scanner inp=new Scanner(System.in);

            System.out.println(" bir sayi giriniz: ");
            num=inp.nextInt();

            for (i=1;i<=num;i*=4){
            System.out.println("4'un kati: "+i);
            }
        System.out.println("-------------------");
        for (i=1;i<=num;i*=5){
            System.out.println("5'in kati: "+i);

        }







    }
}
