import implementation.LoggerImpl;
import inter.ILogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggerConfig {
    @Bean
       public ILogger logger(){
            return new LoggerImpl();
    }
}
