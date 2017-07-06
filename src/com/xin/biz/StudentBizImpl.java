/**  
* @Title:  StudentBizImpl.java
* @Package com.xin.biz
* @Description: TODO(用一句话描述该文件做什么)
* @author Hou Dongchang
* @date  2017年5月6日 下午8:30:33
* @version V1.0  
* Update Logs:
* ****************************************************
* Name:
* Date:
* Description:
******************************************************
*/
package com.xin.biz;

import java.util.List;

import com.xin.bean.PageBean;
import com.xin.bean.Student;
import com.xin.dao.StudentDao;

/**
 * @ClassName: StudentBizImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Hou Dongchang
 * @date 2017年5月6日 下午8:30:33
 *
 */
public class StudentBizImpl implements StudentBiz {
    private StudentDao dao;

    /**
     * <p>
     * Title:
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @author Hou Dongchang
     */
    public StudentBizImpl() {
	super();
    }

    /**
     * <p>
     * Title:
     * </p>
     * <p>
     * Description:
     * </p>
     * 
     * @author Hou Dongchang
     * @param dao
     */
    public StudentBizImpl(StudentDao dao) {
	super();
	this.dao = dao;
    }

    /*
     * (非 Javadoc) <p>Title: login</p> <p>Description: </p>
     * 
     * @param student
     * 
     * @return
     * 
     * @see com.xin.biz.StudentBiz#login(com.xin.bean.Student)
     */
    @Override
    public Student login(Student student) {
	return dao.findStudentByStidAndPwd(student);
    }

    /*
     * (非 Javadoc) <p>Title: regist</p> <p>Description: </p>
     * 
     * @param student
     * 
     * @return
     * 
     * @see com.xin.biz.StudentBiz#regist(com.xin.bean.Student)
     */
    @Override
    public boolean regist(Student student) {
	return dao.save(student);
    }

    /*
     * (非 Javadoc) <p>Title: getNowPageAllInfo</p> <p>Description: </p>
     * 
     * @param nowPage
     * 
     * @return
     * 
     * @see com.xin.biz.StudentBiz#getNowPageAllInfo(com.xin.bean.PageBean)
     */
    @Override
    public PageBean getNowPageAllInfo(PageBean page) {
	return tempGetNowPageInfo(page, null);
    }

    /**
     * @Title: tempGetNowPageInfo @Description: TODO(临时获取当前页的信息) 此方法有两个地方会调用到：
     *         ①所有记录的分页信息 ②带条件的分页信息
     * @author Hou Dongchang @param page @param student @return @throws
     */
    private PageBean tempGetNowPageInfo(PageBean page, Student student) {
	// 步骤：
	// 1、创建PageBean的实例
	PageBean pageInfo = new PageBean();
	// 2、将参数中能够确定的属性值设置进去
	pageInfo.setCurrentPage(page.getCurrentPage());

	// 3、去查询数据库，将查询到的信息设置进去

	int totalRecords = dao.getAllRecords(student);

	int beginIndex = page.getBeginIndex();

	page.setTotalRecords(totalRecords);

	List<Student> students = dao.getSpecialStudents(beginIndex, PageBean.getPageCnt(), student);
	pageInfo.setStudents(students);

	pageInfo.setTotalRecords(totalRecords);

	// 4、返回
	return pageInfo;
    }

    /*
     * (非 Javadoc) <p>Title: queryAllStudents</p> <p>Description: </p>
     * 
     * @return
     * 
     * @see com.xin.biz.StudentBiz#queryAllStudents()
     */
    @Override
    public List<Student> queryAllStudents() {

	return dao.select();
    }

    /*
     * (非 Javadoc) <p>Title: findCustomerByCondition</p> <p>Description: </p>
     * 
     * @param student
     * 
     * @param nowPage
     * 
     * @return
     * 
     * @see com.xin.biz.StudentBiz#findCustomerByCondition(com.xin.bean.Student,
     * com.xin.bean.PageBean)
     */
    @Override
    public PageBean findCustomerByCondition(Student student, PageBean page) {

	return tempGetNowPageInfo(page, student);
    }

    /*
     * (非 Javadoc) <p>Title: deleteNowSelectedStudent</p> <p>Description: </p>
     * 
     * @param stid
     * 
     * @return
     * 
     * @see com.xin.biz.StudentBiz#deleteNowSelectedStudent(java.lang.String)
     */
    @Override
    public boolean deleteNowSelectedStudent(String stid) {
	return dao.delect(stid);
    }

    /*
     * (非 Javadoc) <p>Title: findStudentByStid</p> <p>Description: </p>
     * 
     * @param stid
     * 
     * @return
     * 
     * @see com.xin.biz.StudentBiz#findStudentByStid(java.lang.String)
     */
    @Override
    public Student findStudentByStid(String stid) {
	return dao.queryByStid(stid);
    }

    /*
     * (非 Javadoc) <p>Title: editStudent</p> <p>Description: </p>
     * 
     * @param student
     * 
     * @return
     * 
     * @see com.xin.biz.StudentBiz#editStudent(com.xin.bean.Student)
     */
    @Override
    public boolean editStudent(Student student) {
	return dao.updateStudent(student);
    }

}
