package qin.mobile.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2018/10/27 0027.<br/>
 *
 * @author qinzhengying
 */
public class MobileVOTest
{
    final String _applicationContextLocation_ = "classpath:applicationContext.xml";

    @Test
    public void save()
    {
        ApplicationContext apx = new
                  ClassPathXmlApplicationContext(_applicationContextLocation_);
        SessionFactory sessionFactory =
                  (SessionFactory) apx.getBean("sessionFactory");
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        //

        //获取表中最大主键
        String searchMaxIdSQL = "select max(mb_id)\n" +
                  "from qin_mobile";
        List list = session.createNativeQuery(searchMaxIdSQL).list();
        System.out.println(list.size());
    }

}