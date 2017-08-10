import com.sun.org.apache.bcel.internal.util.ClassPath;
import hello.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by jorye on 2017/7/17 0017.
 */
public class mainClass {

    public static void main(String[] args){

//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld2");
        helloWorld.setUsername("wjy");
        helloWorld.hello();
        System.out.println(helloWorld);
    }

}
