/**
 * 
 */
package com.xin.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Description：Hibernate操作工具类<br/>
 * Copyright (c) ， 2017， Jansonxu <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name：HibernateUtil.java<br/>
 * Date：2017年4月17日
 * 
 * @author 徐文波
 * @version : 1.0
 */
public class HibernateUtil {
	private static SessionFactory factory;

	static {
		try {
			// 1、创建Configuration的实例
			Configuration configure = new Configuration().configure();

			// 2，获得SessionFactory的实例
			factory = configure.buildSessionFactory();
		} catch (HibernateException e) {
			e.printStackTrace();
			throw new RuntimeException("获取SessionFactory的实例发生异常了哦！...");
		}
	}

	/**
	 * 获得Session的实例
	 * 
	 * @return
	 */
	public static Session getSessionInstance() {
		return factory.openSession();
	}
	
	/**
	 * 释放Session
	 * 
	 * @return
	 */
	public static void releaseResource(Session session) {
		if(session!=null){
			session.close();
		}
	}
	
	/**
	 * 事务回滚
	 * 
	 */
	public static void transactionRollback(Transaction tx) {
		if(tx!=null){
			tx.rollback();
		}
	}
	
	/**
	 * 事务提交
	 * 
	 */
	public static void transactionCommit(Transaction tx) {
		if(tx!=null){
			tx.commit();
		}
	}
	
	
}
