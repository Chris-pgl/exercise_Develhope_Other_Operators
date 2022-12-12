public class Main {
    public static void main(String[] args) {


        int a = 15;

        // add 5
        a += 5;
        System.out.println(a);

        // subtract 4
        a -= 4;
        System.out.println(a);


        int b = a;

        b++;
        System.out.println(b);

        if (b % 2 == 0) {
            System.out.println("B is Even");
        } else {
            System.out.println("B is Odds");
        }


        if(( b * b++)% 3 == 0){
            System.out.println("b è un multiplo di 3: ");
        }else{
            System.out.println("b non è un multiplo di 3");
        }

    }
}