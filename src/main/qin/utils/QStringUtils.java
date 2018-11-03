package qin.utils;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/10/28 0028.<br/>
 *
 * @author qinzhengying
 */
public interface QStringUtils extends Serializable
{
    /**
     * 去除空格
     *
     * @param str
     * @return
     */
    default String trim(String str)
    {
        return str.trim();
    }
}
