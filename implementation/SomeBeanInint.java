package implementation;

import inter.ILogger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.logging.Logger;

public class SomeBeanInint implements InitializingBean, DisposableBean {
    private Logger logger= Logger.getLogger(SomeBeanInint.class.getName());

    public void destroy() throws Exception {
        logger.info("Destroy");
    }

    public void afterPropertiesSet() throws Exception {
        logger.info("Start");
    }

    @PostConstruct
    public void afterStrat(){
        logger.info("Strat11!!");
    }

    @PreDestroy
    public void beforDestroy(){
        logger.info("Im gonna explode");
    }

    public void destroyMethode(){
        System.out.println("die");
    }
    public void startMethode(){
        System.out.println("wakeUp");
    }
}
