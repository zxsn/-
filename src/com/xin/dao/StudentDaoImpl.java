/**  
* @Title:  StudentDaoImpl.java
* @Package com.xin.dao
* @Description: TODO(用一句话描述该文件做什么)
* @author Hou Dongchang
* @date  2017年5月6日 下午8:36:22
* @version V1.0  
* Update Logs:
* ****************************************************
* Name:
* Date:
* Description:
******************************************************
*/
package com.xin.dao;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.xin.bean.Student;

/**
 * @ClassName: StudentDaoImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Hou Dongchang
 * @date 2017年5月6日 下午8:36:22
 *
 */
public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {

    /*
     * (非 Javadoc) <p>Title: findStudentByStidAndPwd</p> <p> Description: </p>
     * 
     * @param student
     * 
     * @return
     * 
     * @see com.xin.dao.StudentDao#findStudentByStidAndPwd(com.xin.bean.Student)
     */
    @Override
    public Student findStudentByStidAndPwd(Student student) {
	@SuppressWarnings("unchecked")
	List<Student> students = getHibernateTemplate().find("from Student where stid=? and password=?",
		new Object[] { student.getStid(), student.getPassword() });
	// System.out.println(student.getStid() + "---" +
	// student.getPassword());
	return students != null && students.size() > 0 ? students.get(0) : null;
    }

    /*
     * (非 Javadoc) <p>Title: save</p> <p>Description: </p>
     * 
     * @param student
     * 
     * @return
     * 
     * @see com.xin.dao.StudentDao#save(com.xin.bean.Student)
     */
    @Override
    public boolean save(Student student) {
	Serializable cnt = getHibernateTemplate().save(student);
	return (int) cnt > 0 ? true : false;
	// String idStr = (String) getHibernateTemplate().save(student);
	// return idStr != null && !"".equals(idStr.trim()) ? true : false;
    }

    /*
     * (非 Javadoc) <p>Title: select</p> <p>Description: </p>
     * 
     * @return
     * 
     * @see com.xin.dao.StudentDao#select()
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<Student> select() {
	String hql = "from Student";
	return getHibernateTemplate().find(hql);
    }

    /*
     * (非 Javadoc) <p>Title: getAllRecords</p> <p>Description: </p>
     * 
     * @param student
     * 
     * @return
     * 
     * @see com.xin.dao.StudentDao#getAllRecords(com.xin.bean.Student)
     */
    @Override
    public int getAllRecords(Student student) {
	// 思路：
	// 1、获得Session
	long totalRecords = 0;
	HibernateTemplate template = getHibernateTemplate();

	@SuppressWarnings("rawtypes")
	List cntList = null;
	// 2、判断student是否为null
	if (student != null) {
	    // ①不为null，查询带条件的所有总记录数
	    StringBuffer sql = new StringBuffer("select count(*)  from Student  where 1=1 ");

	    // 存储占位符的参数
	    List<String> params = new LinkedList<>();
	    // 存储值
	    List<String> values = new LinkedList<>();

	    commonSeachCondition(student, sql, params, values);

	    String[] arrParams = paramsToArray(params);
	    cntList = template.findByNamedParam(sql.toString(), arrParams, values.toArray());
	} else {
	    // ②为null，查询所有的记录数
	    cntList = template.find("select count(*) from Student");
	}
	totalRecords = (long) cntList.get(0);
	return (int) totalRecords;
    }

    /**
     * @Title: paramsToArray @Description: TODO(这里用一句话描述这个方法的作用) @author Hou
     *         Dongchang @param params @return @throws
     */
    private String[] paramsToArray(List<String> params) {
	String[] arrs = new String[params.size()];
	for (int i = 0; i < arrs.length; i++) {
	    arrs[i] = params.get(i);
	}
	return arrs;
    }

    /**
     * @Title: commonSeachCondition @Description: TODO(共通的查询条件处理) @author Hou
     *         Dongchang @param student @param sql @param params @param
     *         values @throws
     */
    private void commonSeachCondition(Student student, StringBuffer sql, List<String> params, List<String> values) {

	String stid = student.getStid();
	String name = student.getName();
	String gender = student.getGender();
	String phone = student.getPhone();
	// String province = student.getProvince();
	// String city = student.getCity();
	// String area = student.getArea();

	// 学号
	if (stid != null && !stid.isEmpty()) {
	    sql.append("and stid like :stid");
	    if (params != null && values != null) {
		params.add("stid");
		values.add(stid);
	    }
	}
	// 姓名
	if (name != null && !name.isEmpty()) {
	    sql.append(" and name like :name");
	    if (params != null && values != null) {
		params.add("name");
		values.add(name);
	    }
	}
	// 性别

	if (gender != null && !gender.isEmpty()) {
	    sql.append(" and gender like :gender");
	    if (params != null && values != null) {
		params.add("gender");
		values.add(gender);
	    }
	}
	// 电话
	if (phone != null && !phone.isEmpty()) {
	    sql.append(" and phone like :phone");
	    if (params != null && values != null) {
		params.add("phone");
		values.add(phone);
	    }
	}
	// // 省份
	// if (province != null && !province.isEmpty()) {
	// sql.append(" and province like :province");
	// if (params != null && values != null) {
	// params.add("province");
	// values.add(province);
	// }
	// }
	// // 城市
	// if (city != null && !city.isEmpty()) {
	// sql.append(" and city like :city");
	// if (params != null && values != null) {
	// params.add("city");
	// values.add(city);
	// }
	// }
	// // 县区
	// if (area != null && !area.isEmpty()) {
	// sql.append(" and area like :area");
	// if (params != null && values != null) {
	// params.add("area");
	// values.add(area);
	// }
	// }

    }

    /*
     * (非 Javadoc) <p>Title: getSpecialStudents</p> <p>Description: </p>
     * 
     * @param beginIndex
     * 
     * @param pageSize
     * 
     * @param student
     * 
     * @return
     * 
     * @see com.xin.dao.StudentDao#getSpecialStudents(int, int,
     * com.xin.bean.Student)
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<Student> getSpecialStudents(int beginIndex, int pageSize, Student student) {
	List<Student> students = null;
	Query query = null;
	// 1、获取HibernateTemplate的实例
	Session session = getHibernateTemplate().getSessionFactory().openSession();

	// 2、根据student是否为null进行后续操作
	if (student != null) {
	    // ①不为null，查询带条件的分页信息
	    StringBuffer sql = new StringBuffer("from Student where 1 = 1");
	    commonSeachCondition(student, sql, null, null);
	    query = session.createQuery(sql.toString());
	    changeLikeQueryValue(student, query);
	} else {
	    // ②为null，分页查询所有的记录信息
	    query = session.createQuery("from Student");
	}

	query.setFirstResult(beginIndex);
	query.setMaxResults(pageSize);
	students = query.list();
	return students;
    }

    /**
     * @Title: changeLikeQueryValue @Description: TODO(这里用一句话描述这个方法的作用) @author
     *         Hou Dongchang @param student @param query @throws
     */
    private void changeLikeQueryValue(Student student, Query query) {
	student.setStid(student.getStid() + "%");
	student.setName(student.getName() + "%");
	student.setPhone(student.getPhone() + "%");
	student.setProvince(student.getProvince() + "%");
	student.setCity(student.getCity() + "%");
	student.setArea(student.getArea() + "%");
	query.setProperties(student);

    }

    /*
     * (非 Javadoc) <p>Title: delect</p> <p>Description: </p>
     * 
     * @param stid
     * 
     * @return
     * 
     * @see com.xin.dao.StudentDao#delect(java.lang.String)
     */
    @Override
    public boolean delect(String stid) {

	HibernateTemplate template = getHibernateTemplate();
	@SuppressWarnings("unchecked")
	List<Student> students = getHibernateTemplate().find("from Student where stid=" + stid);
	try {
	    template.delete(students.get(0));
	    return true;
	} catch (DataAccessException e) {
	}
	return false;

    }

    /*
     * (非 Javadoc) <p>Title: queryByStid</p> <p>Description: </p>
     * 
     * @param stid
     * 
     * @return
     * 
     * @see com.xin.dao.StudentDao#queryByStid(java.lang.String)
     */
    @Override
    public Student queryByStid(String stid) {
	return (Student) getHibernateTemplate().find("from Student where stid=?", stid).get(0); // get(Student.class,
												// stid);
    }

    /*
     * (非 Javadoc) <p>Title: updateStudent</p> <p>Description: </p>
     * 
     * @param student
     * 
     * @return
     * 
     * @see com.xin.dao.StudentDao#updateStudent(com.xin.bean.Student)
     */
    @Override
    public boolean updateStudent(Student student) {
	try {
	    getHibernateTemplate().update(student);
	    return true;
	} catch (DataAccessException e) {
	    e.printStackTrace();
	    return false;
	}
    }

}
