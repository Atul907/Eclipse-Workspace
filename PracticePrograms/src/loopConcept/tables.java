
    import java.util.Scanner;
    public class TableOfNumber {
        public static void main(String args[]){
        int number, i, table;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its multiplication table:");
        number = sc.nextInt();
        System.out.println("Multiplication table of "+number+" is:");
        for(i=1; i<=10; i++){
            table = number*i;
            System.out.println(number+" * "+i+" = "+table);
        }
    }
}