package lesson21;

public class Test4 {
    public void abc(String s){
        System.out.println(s);
    }
    public void abc(boolean b){
        System.out.println(b);
    }
    public void abc(int i){
        System.out.println(i);
    }
    private StringBuilder abc(StringBuilder sb){
        System.out.println(sb);
        return sb;
    }
}
