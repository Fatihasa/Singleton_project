public class Main {
    public static void main(String[] args) {

        Singleton obj1 = new Singleton();
        Singleton obj2 = new Singleton();

        System.out.println(obj1.toString()+ obj1.toString().hashCode() );
        System.out.println(obj2.toString()+ obj2.toString().hashCode() );
    }
}
