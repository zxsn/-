/**
 * 
 */
package com.xin.util;

/**
 * Description：实例工厂工具类<br/>
 * Copyright (c) ， 2017， Jansonxu <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name：InstanceFactory.java<br/>
 * Date：2017年4月13日
 * 
 * @author 徐文波
 * @version : 1.0
 */
public class InstanceFactory {
	/**
	 * 根据传入的接口名，通过反射的机制构建接口实现类的实例
	 * 
	 * @param interName
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getInstance(String interfaceName) {
		// com.wenqian.biz.impl.CustomerBizImpl
		String value = PropertiesUtil.getPropertyValue(interfaceName);
		try {
			Class<?> clz = Class.forName(value);
			return (T) clz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
