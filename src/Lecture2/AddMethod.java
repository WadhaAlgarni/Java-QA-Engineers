package Lecture2;

public class AddMethod {
    public static void main(String[] args) {

        int delivery = 20;
        double tax =.5;
        int tomato=70;
        int cafe = 40;
        double total_to_print=calculateTotalPrice(add2(tomato,cafe),delivery,tax);
        System.out.println("Total Price is: "+ total_to_print);

    }
    public static void add(int x, int y){
        System.out.println("The sum is: "+(x+y));
    }

    public static int add2(int x, int y){
        return (x+y);
    }
    public static double calculateTotalPrice(int itemsprice, int delivery,double tax ){
        int total_before_tax = itemsprice +delivery;
        double total_after_tax= total_before_tax+(total_before_tax*tax);
        return (total_after_tax);

    }

}
