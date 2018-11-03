/*
=====基本信息

mbName           手机名称
mbQijiandianName 旗舰店名称
mbPublishDate    发布日期
mbScreenSize     屏幕尺寸
mbPrice          价格
mbCpu            cpu信息
mbBatteryMemory  电池
mbFrontCamera    前置摄像头
mbBackCamera     后置摄像头
mbDescription    描述
mbYunxingMemory  运行内存
mbJishenMemory   机身存储
mbCpuBrand       cpu品牌

=====图片
mbPhoto          图片
mbBigPhotoList   图片集合

=====分类
mbBrand          品牌

=====seo
mbDajiashuo      大家说
mbDuokazhichi    多开制式
mbYouxipeizhi    游戏配置
mbLaorenjipeizhi 老人机配置
mbPingmupeizhi   屏幕配置
mbWeight         重量
mbPhotoSpecial   拍照特效
mbBanben         版本
mbOperatorSystem 操作系统
mbHot            热点
mbColor          机身颜色
mbWangluozhishi  网络制式
mbFenbianlv      分辨率

 */


package qin.mobile.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/10/23 0023.<br/>
 */
public class MobileVO implements Serializable
{
    private static final long serialVersionUID = -5541796160632186639L;

    public MobileVO()
    {
    }

    /**
     * @param mbQijiandianName 旗舰店名称
     * @param mbPhoto          图片
     * @param mbBigPhotoList   图片集合
     * @param mbDescription    描述
     * @param mbPublishDate    发布日期
     * @param mbBanben         版本
     * @param mbOperatorSystem 操作系统
     * @param mbName           手机名称
     * @param mbBrand          品牌
     * @param mbPrice          价格
     * @param mbScreenSize     屏幕尺寸
     * @param mbHot            热点
     * @param mbCpu            cpu信息
     * @param mbColor          机身颜色
     * @param mbFenbianlv      分辨率
     * @param mbWangluozhishi  网络制式
     * @param mbJishenMemory   机身存储
     * @param mbYunxingMemory  运行内存
     * @param mbBatteryMemory  电池
     * @param mbFrontCamera    前置摄像头
     * @param mbPhotoSpecial   拍照特效
     * @param mbBackCamera     后置摄像头
     * @param mbWeight         重量
     * @param mbPingmupeizhi   屏幕配置
     * @param mbLaorenjipeizhi 老人机配置
     * @param mbYouxipeizhi    游戏配置
     * @param mbCpuBrand       cpu品牌
     * @param mbDuokazhichi    多开制式
     * @param mbDajiashuo      大家说
     */
    public MobileVO(String mbQijiandianName, String mbPhoto,
                    String mbBigPhotoList, String mbDescription,
                    String mbPublishDate, String mbBanben,
                    String mbOperatorSystem, String mbName,
                    String mbBrand, String mbPrice,
                    String mbScreenSize, String mbHot,
                    String mbCpu, String mbColor,
                    String mbFenbianlv, String mbWangluozhishi,
                    String mbJishenMemory, String mbYunxingMemory,
                    String mbBatteryMemory, String mbFrontCamera,
                    String mbPhotoSpecial, String mbBackCamera,
                    String mbWeight, String mbPingmupeizhi,
                    String mbLaorenjipeizhi, String mbYouxipeizhi,
                    String mbCpuBrand, String mbDuokazhichi,
                    String mbDajiashuo)
    {
        this.mbQijiandianName = mbQijiandianName;
        this.mbPhoto = mbPhoto;
        this.mbBigPhotoList = mbBigPhotoList;
        this.mbDescription = mbDescription;
        this.mbPublishDate = mbPublishDate;
        this.mbBanben = mbBanben;
        this.mbOperatorSystem = mbOperatorSystem;
        this.mbName = mbName;
        this.mbBrand = mbBrand;
        this.mbPrice = mbPrice;
        this.mbScreenSize = mbScreenSize;
        this.mbHot = mbHot;
        this.mbCpu = mbCpu;
        this.mbColor = mbColor;
        this.mbFenbianlv = mbFenbianlv;
        this.mbWangluozhishi = mbWangluozhishi;
        this.mbJishenMemory = mbJishenMemory;
        this.mbYunxingMemory = mbYunxingMemory;
        this.mbBatteryMemory = mbBatteryMemory;
        this.mbFrontCamera = mbFrontCamera;
        this.mbPhotoSpecial = mbPhotoSpecial;
        this.mbBackCamera = mbBackCamera;
        this.mbWeight = mbWeight;
        this.mbPingmupeizhi = mbPingmupeizhi;
        this.mbLaorenjipeizhi = mbLaorenjipeizhi;
        this.mbYouxipeizhi = mbYouxipeizhi;
        this.mbCpuBrand = mbCpuBrand;
        this.mbDuokazhichi = mbDuokazhichi;
        this.mbDajiashuo = mbDajiashuo;
    }

    private int mbId;

    private String mbQijiandianName;

    private String mbPhoto;

    private String mbBigPhotoList;

    private String mbDescription;

    private String mbPublishDate;

    private String mbBanben;

    private String mbOperatorSystem;

    private String mbName;

    private String mbBrand;

    private String mbPrice;

    private String mbScreenSize;

    private String mbHot;

    private String mbCpu;

    private String mbColor;

    private String mbFenbianlv;

    private String mbWangluozhishi;

    private String mbJishenMemory;

    private String mbYunxingMemory;

    private String mbBatteryMemory;

    private String mbFrontCamera;

    private String mbPhotoSpecial;

    private String mbBackCamera;

    private String mbWeight;

    private String mbPingmupeizhi;

    private String mbLaorenjipeizhi;

    private String mbYouxipeizhi;

    private String mbCpuBrand;

    private String mbDuokazhichi;

    private String mbDajiashuo;

    public int getMbId()
    {
        return mbId;
    }

    public void setMbId(int mbId)
    {
        this.mbId = mbId;
    }

    public String getMbQijiandianName()
    {
        return mbQijiandianName;
    }

    public void setMbQijiandianName(String mbQijiandianName)
    {
        this.mbQijiandianName = mbQijiandianName;
    }

    public String getMbPhoto()
    {
        return mbPhoto;
    }

    public void setMbPhoto(String mbPhoto)
    {
        this.mbPhoto = mbPhoto;
    }

    public String getMbBigPhotoList()
    {
        return mbBigPhotoList;
    }

    public void setMbBigPhotoList(String mbBigPhotoList)
    {
        this.mbBigPhotoList = mbBigPhotoList;
    }

    public String getMbDescription()
    {
        return mbDescription;
    }

    public void setMbDescription(String mbDescription)
    {
        this.mbDescription = mbDescription;
    }

    public String getMbPublishDate()
    {
        return mbPublishDate;
    }

    public void setMbPublishDate(String mbPublishDate)
    {
        this.mbPublishDate = mbPublishDate;
    }

    public String getMbBanben()
    {
        return mbBanben;
    }

    public void setMbBanben(String mbBanben)
    {
        this.mbBanben = mbBanben;
    }

    public String getMbOperatorSystem()
    {
        return mbOperatorSystem;
    }

    public void setMbOperatorSystem(String mbOperatorSystem)
    {
        this.mbOperatorSystem = mbOperatorSystem;
    }

    public String getMbName()
    {
        return mbName;
    }

    public void setMbName(String mbName)
    {
        this.mbName = mbName;
    }

    public String getMbBrand()
    {
        return mbBrand;
    }

    public void setMbBrand(String mbBrand)
    {
        this.mbBrand = mbBrand;
    }

    public String getMbPrice()
    {
        return mbPrice;
    }

    public void setMbPrice(String mbPrice)
    {
        this.mbPrice = mbPrice;
    }

    public String getMbScreenSize()
    {
        return mbScreenSize;
    }

    public void setMbScreenSize(String mbScreenSize)
    {
        this.mbScreenSize = mbScreenSize;
    }

    public String getMbHot()
    {
        return mbHot;
    }

    public void setMbHot(String mbHot)
    {
        this.mbHot = mbHot;
    }

    public String getMbCpu()
    {
        return mbCpu;
    }

    public void setMbCpu(String mbCpu)
    {
        this.mbCpu = mbCpu;
    }

    public String getMbColor()
    {
        return mbColor;
    }

    public void setMbColor(String mbColor)
    {
        this.mbColor = mbColor;
    }

    public String getMbFenbianlv()
    {
        return mbFenbianlv;
    }

    public void setMbFenbianlv(String mbFenbianlv)
    {
        this.mbFenbianlv = mbFenbianlv;
    }

    public String getMbWangluozhishi()
    {
        return mbWangluozhishi;
    }

    public void setMbWangluozhishi(String mbWangluozhishi)
    {
        this.mbWangluozhishi = mbWangluozhishi;
    }

    public String getMbJishenMemory()
    {
        return mbJishenMemory;
    }

    public void setMbJishenMemory(String mbJishenMemory)
    {
        this.mbJishenMemory = mbJishenMemory;
    }

    public String getMbYunxingMemory()
    {
        return mbYunxingMemory;
    }

    public void setMbYunxingMemory(String mbYunxingMemory)
    {
        this.mbYunxingMemory = mbYunxingMemory;
    }

    public String getMbBatteryMemory()
    {
        return mbBatteryMemory;
    }

    public void setMbBatteryMemory(String mbBatteryMemory)
    {
        this.mbBatteryMemory = mbBatteryMemory;
    }

    public String getMbFrontCamera()
    {
        return mbFrontCamera;
    }

    public void setMbFrontCamera(String mbFrontCamera)
    {
        this.mbFrontCamera = mbFrontCamera;
    }

    public String getMbPhotoSpecial()
    {
        return mbPhotoSpecial;
    }

    public void setMbPhotoSpecial(String mbPhotoSpecial)
    {
        this.mbPhotoSpecial = mbPhotoSpecial;
    }

    public String getMbBackCamera()
    {
        return mbBackCamera;
    }

    public void setMbBackCamera(String mbBackCamera)
    {
        this.mbBackCamera = mbBackCamera;
    }

    public String getMbWeight()
    {
        return mbWeight;
    }

    public void setMbWeight(String mbWeight)
    {
        this.mbWeight = mbWeight;
    }

    public String getMbPingmupeizhi()
    {
        return mbPingmupeizhi;
    }

    public void setMbPingmupeizhi(String mbPingmupeizhi)
    {
        this.mbPingmupeizhi = mbPingmupeizhi;
    }

    public String getMbLaorenjipeizhi()
    {
        return mbLaorenjipeizhi;
    }

    public void setMbLaorenjipeizhi(String mbLaorenjipeizhi)
    {
        this.mbLaorenjipeizhi = mbLaorenjipeizhi;
    }

    public String getMbYouxipeizhi()
    {
        return mbYouxipeizhi;
    }

    public void setMbYouxipeizhi(String mbYouxipeizhi)
    {
        this.mbYouxipeizhi = mbYouxipeizhi;
    }

    public String getMbCpuBrand()
    {
        return mbCpuBrand;
    }

    public void setMbCpuBrand(String mbCpuBrand)
    {
        this.mbCpuBrand = mbCpuBrand;
    }

    public String getMbDuokazhichi()
    {
        return mbDuokazhichi;
    }

    public void setMbDuokazhichi(String mbDuokazhichi)
    {
        this.mbDuokazhichi = mbDuokazhichi;
    }

    public String getMbDajiashuo()
    {
        return mbDajiashuo;
    }

    public void setMbDajiashuo(String mbDajiashuo)
    {
        this.mbDajiashuo = mbDajiashuo;
    }

}