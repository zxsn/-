/**
 * 
 */
package com.xin.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Description：资源文件操作工具类<br/>
 * Copyright (c) ， 2017， Jansonxu <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name：PropertiesUtil.java<br/>
 * Date：2017年4月13日
 * 
 * @author 徐文波
 * @version : 1.0
 */
public class PropertiesUtil {
    private static Properties prop;
    static {
	prop = new Properties();
	InputStream is = null;
	try {
	    is = PropertiesUtil.class.getResourceAsStream("student.properties");
	    prop.load(is);
	} catch (IOException e) {
	    e.printStackTrace();
	} finally {
	    if (is != null) {
		try {
		    is.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	    }
	}
    }

    /**
     * 从资源文件中根据key读取到对应的值
     * 
     * @param key
     * @return
     */
    public static String getPropertyValue(String key) {
	return prop.getProperty(key);
    }
}
