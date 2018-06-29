package inter;

import entity.User;
import inter.ILogger;

public interface IUserRepository {
    public User createUser(String name, int age);
    public void setLogger(ILogger logger);
}
