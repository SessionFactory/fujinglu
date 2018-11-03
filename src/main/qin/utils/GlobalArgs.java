package qin.utils;

/**
 * Created by Administrator on 2018/10/28 0028.<br/>
 * 定义全局变量
 *
 * @author qinzhengying
 */
public interface GlobalArgs
{
    /**
     * 路径为classpath:applicationContext.xml
     */
    String _applicationContextXmlLocation_ =
              "classpath:applicationContext.xml";

    /**
     * 用于spring的sessionFactory bean名称
     */
    String _sessionFactory_ = "sessionFactory";
}
