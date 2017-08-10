package hello;

/**
 * Created by jorye on 2017/7/17 0017.
 */
public class HelloWorld {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void hello(){
        System.out.println(this.username+" this is me");
    }
    public HelloWorld(){
        System.out.println("HelloWorld's Constainer");
        System.out.println("HelloWorld's Constainer");
        System.out.println("HelloWorld's Constainer");
    }
}
