package qin.mobile.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateOperations;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/10/28 0028.<br/>
 *
 * @author qinzhengying
 */
public interface MobileDAO
          extends HibernateOperations, Serializable
{
    /**
     * 保存我的手机实体类
     *
     * @param entity 接收手机实体类
     * @return 返回对象
     * @throws DataAccessException 抛出RuntimeException异常
     */
    @Override
    Serializable save(Object entity) throws DataAccessException;
}
