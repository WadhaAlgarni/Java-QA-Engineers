package Lecture2;

public class Conditions {
    public static void main(String[] args) {
        //Conditions Part 1
        int age = 12;
        if (age > 13) {
            System.out.println("Welcome to our website");
        } else {
            System.out.println("You are not allowed");
        }

        //This is a question in interview to defined if understand between theory and practice
        //BVA -> Boundary Value Analysis
        // هو اسلوب اختبار نركز فيه على القيم الحدودية لانها غالبا اكثر مكان تظهر فيه الاخطاء

        // Boundary Value Analysis (BVA):
        // Condition: age > 13
        // Boundary value = 13
        // Two-point BVA: 13, 14
        // Three-point BVA: 12, 13, 14
        // Extended BVA: 12, 13, 14, 15
        // Expected results:
        // age = 12 → Not allowed
        // age = 13 → Not allowed
        // age = 14 → Welcome
        // age = 15 → Welcome

       // Conditions Part 2
        boolean Internet=true;
        String username = "admin";
        String password = "password123";
        if (username.equals("admin") && password.equals("password123")){
            System.out.println("Login successful");
        } else if (!password.equals("password123")) {
            System.out.println("Password is incorrect");
        }
        else {
            if(Internet==true){
                System.out.println("Invalid Credentials");
            }
            else {
                System.out.println("Please check your internet connection");
            }
        }

    }
}
