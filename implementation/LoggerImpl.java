package implementation;

import inter.ILogger;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;

import java.util.Date;

//@Service("withDate")
@Scope(BeanDefinition.SCOPE_SINGLETON)
//@Qualifier("withDate")
public class LoggerImpl implements ILogger {
    public void log(String message) {
        System.out.println(new Date()+": "+message);
    }
}
