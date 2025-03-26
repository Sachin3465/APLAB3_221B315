public class Singleton{
    private static Singleton instance= new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }
}
class Main{
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}