import java.util.Scanner;

public class siralama {
    public static void main(String[] args) {


        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.println("1.değeri giriniz");

        a = input.nextInt();

        System.out.println("2.değeri giriniz");
        b = input.nextInt();

        System.out.println("3.değeri giriniz");
        c = input.nextInt();

        if(a>b && a>c){
            if(b>c){
                System.out.println("a > b > c");
            } else {
                System.out.println(" a > c > b");
            }


        } else if (b>a && b>c){
            if (b>a && a>c){
                System.out.println("b>a>c");

            }else{
                System.out.println("b > c > a");
            }

        } else if (c>a && c>b) {
            if (c > a && b > a) {
                System.out.println("c>b>a");

            } else {
                System.out.println("c>a>b");
            }

        }
        else if ((a == c) || (a == b)){
            System.out.println("Lütfen Farklı değerler giriniz");
        }
        else if ((b==c)){
            System.out.println("Lütfen Farklı Değerler Giriniz");
        }





    }
}
