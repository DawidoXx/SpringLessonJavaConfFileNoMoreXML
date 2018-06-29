import implementation.SomeBeanInint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import({LoggerConfig.class,UserRepoConfig.class})
@ComponentScan(basePackages = "implementation")
public class AppCOnfig {
    @Bean(initMethod ="startMethode",destroyMethod ="destroyMethode" )
    public SomeBeanInint someBeanInint(){
        return new SomeBeanInint();
    }
}
