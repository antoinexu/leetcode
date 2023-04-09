public class Singleton {

    // static volatile variable
    private static volatile Singleton instance;
    //make constructor private
    private Singleton(){

    }

    //static synchronized getInstance method
    public static Singleton getInstance(){
        //make sure thread safe, improve performance
        if(instance == null){
            synchronized (Singleton.class){ //make sure only thread can enter
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
