public class SingletonEagerLoad {

    //private static variable
    private static SingletonEagerLoad instance = new SingletonEagerLoad();

    //make constructor be private
    private SingletonEagerLoad(){

    }

    public static SingletonEagerLoad getInstance(){
        return instance;
    }
}
