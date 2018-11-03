package qin.mobile.dao.impl;

import cn.hutool.log.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateTemplate;
import qin.mobile.dao.MobileDAO;
import qin.mobile.domain.MobileVO;
import qin.utils.GlobalArgs;
import qin.utils.QStringUtils;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/10/28 0028.<br/>
 * 手机实体类数据访问层实现类
 */
@SuppressWarnings("all")
public class MobileDAOImplSQL
          extends HibernateTemplate
          implements MobileDAO,
          QStringUtils, GlobalArgs
{
    private static final long serialVersionUID = -5951976908831884960L;

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
        ApplicationContext apx = new
                  ClassPathXmlApplicationContext(_applicationContextXmlLocation_);
        SessionFactory sessionFactory =
                  (SessionFactory) apx.getBean(_sessionFactory_);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        //转换类对象
        MobileVO mobileVO = (MobileVO) entity;

        //获取表中最大主键值并加一
        String getMaxIdSQL = "select max(mb_id) from qin_mobile;";
        //查找表中最大主键的值
        Integer maxId = -1;

        try
        {
            List obj = session
                      .createNativeQuery(getMaxIdSQL)
                      .list();
            if (obj.get(0) != null)
            {
                maxId = (Integer) obj.get(0);
            }
        }
        catch (Exception turnExp)
        {
            LogFactory.get(getClass())
                      .info("获取手机表中最大主键失败!" +
                                      new Throwable(turnExp));
            //说明表中没有任何记录, 直接将主键修改成1
            maxId = 1;
        }

        Integer mobileId = maxId + 1;

        String mb_qijiandianName =
                  trim(mobileVO.getMbQijiandianName());
        String mb_photo =
                  trim(mobileVO.getMbPhoto());

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

        //region sqlString
        String sqlString = new StringBuilder()
                  .append("insert into fujinglu.qin_mobile\n")
                  .append("(/**/\n")
                  .append("  mb_id, mb_qijiandianName, mb_photo,\n")
                  .append("  mb_bigPhotoList, mb_description,\n")
                  .append("  mb_publishDate, mb_banben, mb_operatorSystem,\n")
                  .append("  mb_name, mb_brand, mb_price,\n")
                  .append("  mb_screenSize, mb_Hot, mb_CPU,\n")
                  .append("  mb_color, mb_fenbianlv, mb_wangluozhishi,\n")
                  .append("  mb_jishenMemory, mb_yunxingMemory,\n")
                  .append("  mb_batteryMemory, mb_frontCamera, mb_photoSpecial,\n")
                  .append("  mb_backCamera, mb_weight, mb_pingmupeizhi,\n")
                  .append("  mb_laorenjipeizhi, mb_youxipeizhi, mb_cpuBrand,\n")
                  .append("  mb_duokazhichi, mb_dajiashuo/**/\n")
                  .append(")\n")
                  .append("values\n")
                  .append("(/**/\n")
                  .append("  ")
                  .append(mobileId)
                  .append(", '")
                  .append(mb_qijiandianName)
                  .append("', '")
                  .append(mb_photo)
                  .append("',\n")
                  .append("  '")
                  .append(mb_bigPhotoList)
                  .append("', '")
                  .append(mb_description)
                  .append("', '")
                  .append(mb_publishDate)
                  .append(" 00:20:18',\n")
                  .append("  '")
                  .append(mb_banben)
                  .append("', '")
                  .append(mb_operatorSystem)
                  .append("', '")
                  .append(mb_name)
                  .append("',\n")
                  .append("  '")
                  .append(mb_brand)
                  .append("', ")
                  .append(mb_price)
                  .append(", '")
                  .append(mb_screenSize)
                  .append("',\n")
                  .append("  '")
                  .append(mb_Hot)
                  .append("', '")
                  .append(mb_CPU)
                  .append("', '")
                  .append(mb_color)
                  .append("',\n")
                  .append("  '")
                  .append(mb_fenbianlv)
                  .append("', '")
                  .append(mb_wangluozhishi)
                  .append("', '")
                  .append(mb_jishenMemory)
                  .append("',\n")
                  .append("  '")
                  .append(mb_yunxingMemory)
                  .append("', '")
                  .append(mb_batteryMemory)
                  .append("', '")
                  .append(mb_frontCamera)
                  .append("',\n")
                  .append("  '")
                  .append(mb_photoSpecial)
                  .append("', '")
                  .append(mb_backCamera)
                  .append("', '")
                  .append(mb_weight)
                  .append("',\n")
                  .append("  '")
                  .append(mb_pingmupeizhi)
                  .append("', '")
                  .append(mb_laorenjipeizhi)
                  .append("', '")
                  .append(mb_youxipeizhi)
                  .append("',\n")
                  .append("  '")
                  .append(mb_cpuBrand)
                  .append("', ")
                  .append(mb_duokazhichi)
                  .append(", '")
                  .append(mb_dajiashuo)
                  .append("'/**/\n")
                  .append(");").toString();
        //endregion

        //执行新增
        int executeUpdate = session
                  .createNativeQuery(sqlString)
                  .executeUpdate();

        if (executeUpdate == 0)
        {
            return new RuntimeException("新增失败");
        }

        transaction.commit();

        return 1;
    }
}