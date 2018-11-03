package qin.mobile.dao.impl;

import org.junit.Test;
import qin.mobile.domain.MobileVO;
import qin.utils.GlobalArgs;

/**
 * Created by Administrator on 2018/10/28 0028.<br/>
 *
 * @author qinzhengying
 */
public class MobileDAOImplTest
          implements GlobalArgs
{

    @Test
    public void save()
    {
        MobileDAOImplSQL m = new MobileDAOImplSQL();
        MobileVO v = new MobileVO();
        v.setMbBackCamera("1");
        v.setMbBanben("1");
        v.setMbBatteryMemory("1");
        v.setMbBigPhotoList("1");
        v.setMbBrand("1");
        v.setMbColor("");
        v.setMbCpu("");
        v.setMbCpuBrand("1");
        v.setMbDajiashuo("1");
        v.setMbDescription("");
        v.setMbDuokazhichi("1");
        v.setMbFenbianlv("1");
        v.setMbFrontCamera("1");
        v.setMbHot("1");
        v.setMbJishenMemory("1");
        v.setMbLaorenjipeizhi("1");
        v.setMbName("1");
        v.setMbOperatorSystem("1");
        v.setMbPhoto("1");
        v.setMbPhotoSpecial("1");
        v.setMbPingmupeizhi("1");
        v.setMbPrice("1");
        v.setMbPublishDate("2018-10-02");
        v.setMbQijiandianName("2018-10-02 ");
        v.setMbScreenSize("1");
        v.setMbWangluozhishi("1");
        v.setMbWeight("1");
        v.setMbYouxipeizhi("1");
        v.setMbYunxingMemory("1");

        m.save(v);
    }
}