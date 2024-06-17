package lesson16_String;

public class Test3 {
    public static void main(String[] args) {
        String s2 = new String("Stepik");
        String string = s2.substring(2); // присвой значение начиная со второго индекса
        //System.out.println(string);
        String string1 = s2.substring(3,6);// присвой значение начиная с 0 индекса и кончая по 2-ой
        //System.out.println(string1);
        String trim = s2.trim(); //убирает пробелы по бокам
        //System.out.println(trim);
        String string2 = s2.replace('S','W'); // меняет char на новый
        //System.out.println(string2);
        String string3 = s2.replace("pik","p"); // меняет String на новый
        //System.out.println(string3);

        String string4 = s2.concat("-top"); // конкатенация
        System.out.println(string4);
    }
}
