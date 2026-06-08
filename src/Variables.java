public class Variables {
    public static void main(String[] args) {
        // Variables and Data Type

        //String variables
        String base_url="https://www.nezamacademy.com/";
        String home_page= "author/dashboard";
        System.out.println(base_url);

        //Numeric variables
        int x=5;
        double Pi=3.14;
        //int y=7.7; error
        System.out.println(x);
        System.out.println(base_url + home_page);
        System.out.println(Pi);

        //Double can store integer values
        double y=7;
        System.out.println("The value of Y is: "+y);

        //Variable declaration
        int w;

        //Variable initialization
        w=33;
        //Variable declaration and initialization in one line
        int q=7;

        // if a variable appears in black, it means is used in the code.
        // if it appears in grey, it means it is declared but never used.
        // Unused variable should be removed to keep the code clean.


        //Boolean
        boolean loggedIn=false;
        System.out.println(loggedIn);
          //loggedIn=7; error
          loggedIn=true;

          char m='t';

    }
}
