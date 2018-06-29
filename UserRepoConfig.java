
import inter.ILogger;
import inter.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class UserRepoConfig {
    @Autowired
    private ILogger logger;

        @Bean
        public IUserRepository userRepository(){
        implementation.UserRepositoryImpl userRepository= new implementation.UserRepositoryImpl();
        userRepository.setLogger(logger);
        return userRepository;
    }
}
