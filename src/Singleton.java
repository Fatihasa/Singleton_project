public class Singleton {

    private String string = "Hello hello";
    private Singleton intance;

    public Singleton(){
    }

    public Singleton getIntance() {
        if(intance == null){
            return intance = new Singleton();
        }
        return intance;
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString(){
        return string;
    }
}
