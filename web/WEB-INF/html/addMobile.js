$(function () //
    {
        //将标签显示在左边
        $('#tt').tabs({tabPosition: 'left'});
        diy_mainInfo();
    }
);

NBSP = "&nbsp;";

//region 抽取全局变量(html页面中基本信息)
mbName = "mbName";

mbQijiandianName = "mbQijiandianName";

mbPublishDate = "mbPublishDate";

mbPrice = "mbPrice";

mbCpu = "mbCpu";

mbBatteryMemory = "mbBatteryMemory";

mbFrontCamera = "mbFrontCamera";

mbBackCamera = "mbBackCamera";

mbDescription = "mbDescription";

mbYunxingMemory = "mbYunxingMemory";

mbJishenMemory = "mbJishenMemory";

mbCpuBrand = "mbCpuBrand";

//endregion

/**
 * 自定义基本信息选项卡中的非空提醒值
 */
function diy_mainInfo()
{
    //手机名称
    overrideMsg(mbName, "手机名称", "Black");
    overrideMsg(mbQijiandianName, "旗舰店名称", "Brown");
    overrideMsg(mbPublishDate, "发布日期", "Red");
    overrideMsg(mbPrice, "价格", "Aqua");
    overrideMsg(mbCpu, "cpu信息", "Aquamarine");
    overrideMsg(mbBatteryMemory, " 电池", "Bisque");
    overrideMsg(mbFrontCamera, "前置摄像头", "Coral");
    overrideMsg(mbBackCamera, "后置摄像头", "BlueViolet");
    overrideMsg(mbDescription, "描述", "BurlyWood");
    overrideMsg(mbYunxingMemory, "运行内存", "CadetBlue");
    overrideMsg(mbJishenMemory, "机身存储", "Chartreuse");
    overrideMsg(mbCpuBrand, "cpu品牌", "Chocolate");
}

/** 定义新增链接变量 */
var addURL = "/mobile/save.com?";

/**
 * 保存手机信息
 */
function saveMobile()
{
    //1.首先判断基本信息各控件值变量是否为空
    checkSaveSetup1();
    //只是测试url是否正确, 可以输出到控制台
    //console.log(addURL);
	
	//2.保存图片信息
	
	//3.保存分类信息
	
	//4.保存seo信息
	
	//5.执行新增
}

/**
 * 基本信息检查步骤
 */
function checkSaveSetup1()
{
    //接收控件值并直接判断非空
    //并且不能超过最大长度
    var mbNameV = getInputValue(mbName);
    if (checkInputNULL(mbNameV) === 0)
    {
        wrongMsgAlert("手机名称不能为空");
        return;
    }
    if (mbNameV.length > 30)
    {
        wrongMsgAlert("手机名称不能超过30个字符");
        return;
    }

    var mbQijiandianNameV = getInputValue(mbQijiandianName);
    if (checkInputNULL(mbQijiandianNameV) === 0)
    {
        wrongMsgAlert("旗舰店不能为空");
        return;
    }
    if (mbQijiandianNameV.length > 40)
    {
        wrongMsgAlert("旗舰店名称不能超过40个字符");
        return;
    }

    var mbPublishDateV = getInputValue(mbPublishDate);
    if (checkInputNULL(mbPublishDateV) === 0)
    {
        wrongMsgAlert("发布日期不能为空");
        return;
    }

    var mbScreenSizeV = $('#mbScreenSize').combobox('getValue');
    if (checkInputNULL(mbScreenSizeV) === 0)
    {
        wrongMsgAlert("屏幕尺寸大小不能为空");
        return;
    }
    if (mbScreenSizeV.length > 20)
    {
        wrongMsgAlert("屏幕尺寸不能大于20个字符");
        return;
    }

    var mbPriceV = getInputValue(mbPrice);
    if (checkInputNULL(mbPriceV) === 0)
    {
        wrongMsgAlert("价格不能为空");
        return;
    }

    var mbCpuV = getInputValue(mbCpu);
    if (checkInputNULL(mbCpuV) === 0)
    {
        wrongMsgAlert("cpu信息不能为空");
        return;
    }
    if (mbCpuV.length > 20)
    {
        wrongMsgAlert("cpu信息不能超过20个字符");
        return;
    }

    var mbBatteryMemoryV = $('#mbBatteryMemory').combobox('getValue');
    if (checkInputNULL(mbBatteryMemoryV) === 0)
    {
        wrongMsgAlert("电池容量不能为空");
        return;
    }
    if (mbBatteryMemoryV.length > 20)
    {
        wrongMsgAlert("电池容量不能超过20个字符");
        return;
    }

    var mbFrontCameraV = getInputValue(mbFrontCamera);
    if (checkInputNULL(mbFrontCameraV) === 0)
    {
        wrongMsgAlert("前置摄像头不能为空");
        return;
    }
    if (mbFrontCameraV.length > 20)
    {
        wrongMsgAlert("前置摄像头不能超过20个字符");
        return;
    }

    var mbBackCameraV = getInputValue(mbBackCamera);
    if (checkInputNULL(mbBackCameraV) === 0)
    {
        wrongMsgAlert("后置摄像头不能为空");
        return;
    }
    if (mbBackCameraV.length > 20)
    {
        wrongMsgAlert("后置摄像头不能超过20个字符");
        return;
    }

    var mbDescriptionV = getInputValue(mbDescription);
    if (checkInputNULL(mbDescriptionV) === 0)
    {
        wrongMsgAlert("描述不能为空");
        return;
    }
    if (mbDescriptionV.length > 3000)
    {
        wrongMsgAlert("描述不能超过3000个字符");
        return;
    }

    var mbYunxingMemoryV = getInputValue(mbYunxingMemory);
    if (checkInputNULL(mbYunxingMemoryV) === 0)
    {
        wrongMsgAlert("运行内存不能为空");
        return;
    }
    if (mbYunxingMemoryV.length > 20)
    {
        wrongMsgAlert("运行内存不能超过20个字符");
        return;
    }

    var mbJishenMemoryV = getInputValue(mbJishenMemory);
    if (checkInputNULL(mbJishenMemoryV) === 0)
    {
        wrongMsgAlert("机身内存不能为空");
        return;
    }
    if (mbJishenMemoryV.length > 20)
    {
        wrongMsgAlert("机身内存不能超过20个字符");
        return;
    }

    var mbCpuBrandV = getInputValue(mbCpuBrand);
    if (checkInputNULL(mbCpuBrandV) === 0)
    {
        wrongMsgAlert("cpu品牌信息不能为空");
        return;
    }
    if (mbCpuBrandV.length > 20)
    {
        wrongMsgAlert("cpu品牌不能超过20个字符");
        return;
    }

    //拼接我的addURL
    addURL += "mbName=" + mbNameV +
        "       &&mbQijiandianName=" + mbQijiandianNameV +
        "       &&mbPublishDate=" + mbPublishDateV +
        "		&&mbScreenSize=" + mbScreenSizeV +
        "       &&mbPrice=" + mbPriceV +
        "       &&mbCpu=" + mbCpuV +
        "       &&mbBatteryMemory=" + mbBatteryMemoryV +
        "       &&mbFrontCamera=" + mbFrontCameraV +
        "       &&mbBackCamera=" + mbBackCameraV +
        "       &&mbDescription=" + mbDescriptionV +
        "       &&mbYunxingMemory=" + mbYunxingMemoryV +
        "       &&mbJishenMemory=" + mbJishenMemoryV +
        "       &&mbCpuBrand=" + mbCpuBrandV;
}
//end checkSaveSetup1()

/**
 * 将控件后面的错误提示信息封装出来
 *
 * @param inputId 控件id(input的id属性)
 * @param inputName 控件名称(input的label属性)
 * @param inputColor 可以自定义输出字体的颜色
 */
function overrideMsg(inputId, inputName, inputColor)
{
    $("#" + inputId).textbox
    (
        {
            missingMessage:
                "<font style='font-family: 微软雅黑; " +
                "font-size: 21px; color: " + inputColor + "; font-weight: bold;'>" +
                NBSP + NBSP +
                inputName + "不能为空!" +
                NBSP + NBSP +
                "</font>"
        }
    );
}

/**
 * 获取我的input控件的值
 *
 * @param inputId 我的输入控件
 * @returns {*|jQuery} 返回获取到的值
 */
function getInputValue(inputId)
{
    return $('#' + inputId).val();
}

/**
 * 检查控件值是否为空(封装出的方法)
 *
 * @param yourInput 输入控件
 * @returns {number} 不为空返回1
 */
function checkInputNULL(yourInput)
{
    if ("" !== yourInput &&
        undefined !== yourInput &&
        null != yourInput)
    {
        return 1;
    }
    return 0;
}

/**
 * 封装easyui错误信息提示方法
 *
 * @param {*} msg
 */
function wrongMsgAlert(msg)
{
    $.messager.alert('错误!', msg + '!', 'error');

}