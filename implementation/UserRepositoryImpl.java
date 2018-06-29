package implementation;

import entity.User;
import inter.ILogger;
import inter.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userRepo")
public class UserRepositoryImpl implements IUserRepository {

    @Autowired(required = false)
    //@Qualifier("logger")
    //@Resource//(name="withDate")
    private ILogger logger;

    public User createUser(String name, int age) {
        User user= new User(name,age);
        if (logger !=null)
            logger.log("Tworzenie użytkownika: "+name);
        return user;
    }

    public void setLogger(ILogger logger) {
        this.logger = logger;
    }

}
