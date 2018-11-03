package qin.mobile.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import qin.mobile.dao.MobileDAO;
import qin.mobile.domain.MobileVO;
import qin.utils.GlobalArgs;
import qin.utils.QStringUtils;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * Created by Administrator on 2018/10/28 0028.<br/>
 * 手机实体类数据访问层实现类
 */
@Repository("md")
@Transactional
public class MobileDAOImpl
          extends HibernateTemplate
          implements MobileDAO,
          QStringUtils, GlobalArgs
{
    private static final long serialVersionUID = -5951976908831884960L;

    //region session

    //------------------------获取SessionFactory和Session

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory()
    {
        return this.sessionFactory;
    }

    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }

    private Session session;

    /**
     * 获取我的Hibernate Session
     *
     * @return
     */
    public Session getSession()
    {
        //如果获取到的session为空则开启并且设置
        if (session == null)
        {
            final Session session = getSessionFactory().openSession();
            setSession(session);
            return session;
        }
        else
        {
            //由于新增之后在finally块中已关闭session
            //所以在这里进行开启并且设置我的session
            if (session.isOpen())
            {
                return this.session;
            }
            else
            {
                final Session session = getSessionFactory().openSession();
                setSession(session);
                return session;
            }
        }
    }

    public void setSession(Session session)
    {
        this.session = session;
    }

    private Transaction transaction;

    /**
     * 获取我的Hibernate事务
     *
     * @return
     */
    public Transaction getTransaction()
    {
        try
        {
            if (this.transaction == null)
            {
                return getSession().beginTransaction();
            }
            else
            {
                //事务不为空
                //判断事务是否激活
                if (this.transaction.isActive())
                {
                    return this.transaction;
                }
                else
                {
                    //开启事务
                    return getSession().beginTransaction();
                }
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return null;
        }
    }

    //endregion

    //------------------------doSave

    /**
     * 保存手机实体类(通过MySQL方式)
     *
     * @param entity 接收手机实体类
     * @return
     * @throws DataAccessException
     */
    @Override
    public Serializable save(Object entity) throws DataAccessException
    {
        //转换类对象
        MobileVO mobileVO = (MobileVO) entity;

        //获取表中最大主键值并加一
        String getMaxIdSQL = "select max(mb_id) from qin_mobile;";
        //查找表中最大主键的值
        Integer maxId = 6;

        /*try
        {
            maxId = (Integer) getSession()
                      .createNativeQuery(getMaxIdSQL)
                      .list().get(0);
        }
        catch (Exception turnExp)
        {
            LogFactory.get(getClass())
                      .info("获取手机表中最大主键失败!" +
                                      new Throwable(turnExp));
            //说明表中没有任何记录, 直接将主键修改成1
            maxId = 1;
        }*/

        Integer mobileId = maxId + 1;

        String mb_qijiandianName = trim(mobileVO.getMbQijiandianName());
        String mb_photo = trim(mobileVO.getMbPhoto());

        //"  mb_bigPhotoList, mb_description, mb_publishDate,\n" +
        String mb_bigPhotoList =
                  trim(mobileVO.getMbBigPhotoList());
        String mb_description =
                  trim(mobileVO.getMbDescription());
        String mb_publishDate =
                  trim(mobileVO.getMbPublishDate());

        // "  mb_banben, mb_operatorSystem, mb_name,\n" +
        String mb_banben =
                  trim(mobileVO.getMbBanben());
        String mb_operatorSystem =
                  trim(mobileVO.getMbOperatorSystem());
        String mb_name =
                  trim(mobileVO.getMbName());

        // "  mb_brand, mb_price, mb_screenSize,\n" +
        String mb_brand =
                  trim(mobileVO.getMbBrand());
        Double mb_price =
                  Double.valueOf(trim(mobileVO.getMbPrice()));
        String mb_screenSize =
                  trim(mobileVO.getMbScreenSize());

        // "  mb_Hot, mb_CPU, mb_color,\n" +
        String mb_Hot =
                  trim(mobileVO.getMbHot());
        String mb_CPU =
                  trim(mobileVO.getMbCpu());
        String mb_color =
                  trim(mobileVO.getMbColor());

        // "  mb_fenbianlv, mb_wangluozhishi, mb_jishenMemory,\n" +
        String mb_fenbianlv =
                  trim(mobileVO.getMbFenbianlv());
        String mb_wangluozhishi =
                  trim(mobileVO.getMbWangluozhishi());
        String mb_jishenMemory =
                  trim(mobileVO.getMbJishenMemory());

        // "  mb_yunxingMemory, mb_batteryMemory, mb_frontCamera,\n" +
        String mb_yunxingMemory =
                  trim(mobileVO.getMbYunxingMemory());
        String mb_batteryMemory =
                  trim(mobileVO.getMbBatteryMemory());
        String mb_frontCamera =
                  trim(mobileVO.getMbFrontCamera());

        // "  mb_photoSpecial, mb_backCamera, mb_weight,\n" +
        String mb_photoSpecial =
                  trim(mobileVO.getMbPhotoSpecial());
        String mb_backCamera =
                  trim(mobileVO.getMbBackCamera());
        String mb_weight =
                  trim(mobileVO.getMbWeight());

        // "  mb_pingmupeizhi, mb_laorenjipeizhi, mb_youxipeizhi,\n" +
        String mb_pingmupeizhi =
                  trim(mobileVO.getMbPingmupeizhi());
        String mb_laorenjipeizhi =
                  trim(mobileVO.getMbLaorenjipeizhi());
        String mb_youxipeizhi =
                  trim(mobileVO.getMbYouxipeizhi());

        // "  mb_cpuBrand, mb_duokazhichi, mb_dajiashuo)\n" +
        String mb_cpuBrand =
                  trim(mobileVO.getMbCpuBrand());
        Integer mb_duokazhichi =
                  Integer.valueOf(trim(mobileVO.getMbDuokazhichi()));
        String mb_dajiashuo =
                  trim(mobileVO.getMbDajiashuo());

        String sqlString = "insert into fujinglu.qin_mobile\n" +
                  "(/**/\n" +
                  "  mb_id, mb_qijiandianName, mb_photo,\n" +
                  "  mb_bigPhotoList, mb_description,\n" +
                  "  mb_publishDate, mb_banben, mb_operatorSystem,\n" +
                  "  mb_name, mb_brand, mb_price,\n" +
                  "  mb_screenSize, mb_Hot, mb_CPU,\n" +
                  "  mb_color, mb_fenbianlv, mb_wangluozhishi,\n" +
                  "  mb_jishenMemory, mb_yunxingMemory,\n" +
                  "  mb_batteryMemory, mb_frontCamera, mb_photoSpecial,\n" +
                  "  mb_backCamera, mb_weight, mb_pingmupeizhi,\n" +
                  "  mb_laorenjipeizhi, mb_youxipeizhi, mb_cpuBrand,\n" +
                  "  mb_duokazhichi, mb_dajiashuo/**/\n" +
                  ")\n" +
                  "values\n" +
                  "(/**/\n" +
                  "  " + mobileId + ", '" + mb_qijiandianName + "', '" + mb_photo + "',\n" +
                  "  '" + mb_bigPhotoList + "', '" + mb_description + "', '" + mb_publishDate + " 00:20:18',\n" +
                  "  '" + mb_banben + "', '" + mb_operatorSystem + "', '" + mb_name + "',\n" +
                  "  '" + mb_brand + "', " + mb_price + ", '" + mb_screenSize + "',\n" +
                  "  '" + mb_Hot + "', '" + mb_CPU + "', '" + mb_color + "',\n" +
                  "  '" + mb_fenbianlv + "', '" + mb_wangluozhishi + "', '" + mb_jishenMemory + "',\n" +
                  "  '" + mb_yunxingMemory + "', '" + mb_batteryMemory + "', '" + mb_frontCamera + "',\n" +
                  "  '" + mb_photoSpecial + "', '" + mb_backCamera + "', '" + mb_weight + "',\n" +
                  "  '" + mb_pingmupeizhi + "', '" + mb_laorenjipeizhi + "', '" + mb_youxipeizhi + "',\n" +
                  "  '" + mb_cpuBrand + "', " + mb_duokazhichi + ", '" + mb_dajiashuo + "'/**/\n" +
                  ");";

        //执行新增
        int executeUpdate = getSession()
                  .createNativeQuery(sqlString)
                  .executeUpdate();

        if (executeUpdate == 0)
        {
            return new RuntimeException("新增失败");
        }

        getTransaction().commit();

        return executeUpdate;
    }
}