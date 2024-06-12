package lesson12;


public class Test13 {
     void max(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("max - " + a);
        } else if (b > a && b > c) {
            System.out.println("max - " + b);
        } else {System.out.println("max - " + c);
        }
    }
    public static void main(String[] args) {
        Test13 test13 = new Test13();
        test13.max(14,6,8);
    }
}

class Test14{
    //String str;
    // int a = 10;
   void abc() {
       String str;
       int a = 10;
       if (a >= 10) {
           str = "Privet";
       }
       if (a < 10) {
           str = "Poka";
       } else {str = null;}
       System.out.println(str);
   }
   public static void main(String[] args) {
       int b = 10;
       int c = 20;

       int max = (b>c) ? b : c;
       System.out.println(max);
   }
}
