public class Singleton {
    private static Singleton instance;

    private Singleton(){}

    // synchronized to make thread safe
    // without synchronized we still can use, but it will not be thread safe
    public static synchronized Singleton getInstance(){
        if (instance==null){
            instance= new Singleton();
        }
        return instance;
    }
}
