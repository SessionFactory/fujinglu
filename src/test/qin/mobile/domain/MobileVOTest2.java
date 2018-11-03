package qin.mobile.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import qin.utils.GlobalArgs;

/**
 * Created by Administrator on 2018/10/27 0027.<br/>
 *
 * @author qinzhengying
 */
public class MobileVOTest2 implements GlobalArgs
{
    /**
     * 测试createSQL方法
     */
    @Test
    public void save()
    {
        ApplicationContext apx = new
                  ClassPathXmlApplicationContext(_applicationContextXmlLocation_);
        SessionFactory sessionFactory =
                  (SessionFactory) apx.getBean(_sessionFactory_);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        String sqlString = "INSERT INTO fujinglu.qin_mobile\n" +
                  "(\n" +
                  "  mb_id, mb_qijiandianName, mb_photo,\n" +
                  "  mb_bigPhotoList, mb_description, mb_publishDate,\n" +
                  "  mb_banben, mb_operatorSystem, mb_name,\n" +
                  "  mb_brand, mb_price, mb_screenSize,\n" +
                  "  mb_Hot, mb_CPU, mb_color,\n" +
                  "  mb_fenbianlv, mb_wangluozhishi, mb_jishenMemory,\n" +
                  "  mb_yunxingMemory, mb_batteryMemory, mb_frontCamera,\n" +
                  "  mb_photoSpecial, mb_backCamera, mb_weight,\n" +
                  "  mb_pingmupeizhi, mb_laorenjipeizhi, mb_youxipeizhi,\n" +
                  "  mb_cpuBrand, mb_duokazhichi, mb_dajiashuo)\n" +
                  "VALUES\n" +
                  "(\n" +
                  "  /*编号, 旗舰店名称, 图片*/\n" +
                  "  3, '京东华为旗舰店', null,\n" +
                  "  /*图片集合, 描述, 发布日期*/\n" +
                  "  null, null, '2018-10-02 13:20:18',\n" +
                  "  /*版本(例如4+64, 6+64), 系统, 手机名称*/\n" +
                  "  null, null, null,\n" +
                  "  /*品牌, 价格, 屏幕大小*/\n" +
                  "  null, 29998, null,\n" +
                  "  /*热点, cpu核数, 机身颜色, 分辨率*/\n" +
                  "  null, null, '黄色',\n" +
                  "  /*分辨率, 网络制式, 前置摄像头*/\n" +
                  "  null, null, '4G',\n" +
                  "  /*运行内存, 电池容量, 前置摄像头*/\n" +
                  "  '64G', null, null,\n" +
                  "  /*拍照特点, 后置摄像头, 机身厚度*/\n" +
                  "  null, null, null,\n" +
                  "  /*屏幕配置, 老人机配置, 游戏配置*/\n" +
                  "  null, null, null,\n" +
                  "  /*cpu品牌, 多卡支持, 大家说*/\n" +
                  "  null, null, null);";

        int i = session.createNativeQuery(sqlString).executeUpdate();
        System.out.println(i);
        transaction.commit();
    }

}