public class Main {
    public static void main(String[] args) {
        
        //Fatih ASA 36470
        
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj1.toString()+ obj1.toString().hashCode() );
        System.out.println(obj2.toString()+ obj2.toString().hashCode() );
    }
}
