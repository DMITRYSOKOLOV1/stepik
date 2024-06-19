package lesson17_StringBuilder;

class Car{}
public class Test1 {
    public static void main(String[] args) {
        // cоздание объектов StringBuilder
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb2);
        //методы
        System.out.println("размер - " + sb2.length());
        System.out.println("элемент на 0-вом индексе - " + sb2.charAt(0));
        System.out.println("индекс у ! - " + sb2.indexOf("!"));
        System.out.println(sb4.indexOf("o",2));
        String s = sb2.substring(5);
        String s2 = sb2.substring(0,4);
        System.out.println("sb2.substring(0,4); " + s + " " + s2);

        System.out.println(sb2.subSequence(5,9));

        StringBuilder sb5 = sb2.append(100);
        System.out.println("sb5 - " + sb5);
        sb2.append(true);
        System.out.println("sb2 - " + sb2);
        StringBuilder sb6 = sb4.append(new Car());
        System.out.println("sb4 - " + sb4);

        sb3.insert(0,"H");
        sb3.insert(1,"i");
        sb3.insert(2," ");
        sb3.insert(3,3);
        System.out.println("sb3 - " + sb3);

        sb3.delete(2,4);
        System.out.println("sb3 после удаления - " + sb3);

        StringBuilder sb7 = new StringBuilder("Hello World");
        sb7.deleteCharAt(6);
        System.out.println("sb7 - " + sb7);
        sb7.reverse();
        System.out.println("sb7 после reverse - " + sb7);

        sb1.replace(0,1,"J");
        System.out.println("sb1 - " + sb1);

        System.out.println("sb1 capasity " + sb1.capacity());
    }
}
