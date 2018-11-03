package env;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/9/9 0009.<br/>
 *
 * @author qinzhengying
 */
public class EnvironmentDomainTest
{
    @Test
    public void make()
    {
        ApplicationContext apx = new
                  ClassPathXmlApplicationContext("applicationContext.xml");
        SessionFactory s = (SessionFactory) apx
                  .getBean("sessionFactory");
    }

}