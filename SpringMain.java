import implementation.SomeBeanInint;
import implementation.UserRepositoryImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        AbstractApplicationContext context= new AnnotationConfigApplicationContext(AppCOnfig.class,UserRepoConfig.class,LoggerConfig.class);
       // AbstractApplicationContext context= new AnnotationConfigApplicationContext(AppCOnfig.class);
        context.registerShutdownHook();
        UserRepositoryImpl userRepository = context.getBean("userRepo", UserRepositoryImpl.class);
        userRepository.createUser("Alan",32);

        SomeBeanInint someBeanInint = context.getBean("someBeanInint", SomeBeanInint.class);
        context.close();
        System.out.println("Coś nowego!!!!");
    }
}
