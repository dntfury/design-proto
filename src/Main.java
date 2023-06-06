public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        System.out.println("s1 is " +  s1 );
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);
        // all the instance s1 s2 s3 all are same
        //Hello world!
        //s1 is Singleton@4617c264
        //s2 is Singleton@4617c264
        //s3 is Singleton@4617c264

    }
}