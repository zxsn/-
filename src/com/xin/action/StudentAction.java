/**  
* @Title:  StudentAction.java
* @Package com.xin.action
* @Description: TODO(用一句话描述该文件做什么)
* @author Hou Dongchang
* @date  2017年5月16日 上午9:28:50
* @version V1.0  
* Update Logs:
* ****************************************************
* Name:
* Date:
* Description:
******************************************************
*/
package com.xin.action;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.xin.bean.Student;
import com.xin.biz.StudentBiz;

/**
 * @ClassName: StudentAction
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Hou Dongchang
 * @date 2017年5月16日 上午9:28:50
 *
 */
public class StudentAction extends ActionSupport {
    private Student student;
    private StudentBiz biz;
    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;

    /**
     * @throws UnsupportedEncodingException
     * @Title: transferStid @Description: TODO(传递stid) @author Hou
     *         Dongchang @throws
     */
    public String transferName() throws UnsupportedEncodingException {
	// System.out.println(student.getName());
	String name = URLDecoder.decode(student.getName(), "UTF-8");
	student.setName(name);
	return Action.SUCCESS;

    }

    /**
     * @Title: transferStid @Description: TODO(传递stid) @author Hou
     *         Dongchang @throws
     */
    public String transferStid() {
	// System.out.println(student.getStid());
	return Action.SUCCESS;

    }

    /**
     * @return student
     */
    public Student getStudent() {
	return student;
    }

    /**
     * @param student
     *            要设置的 student
     */
    public void setStudent(Student student) {
	this.student = student;
    }

    /**
     * @return biz
     */
    public StudentBiz getBiz() {
	return biz;
    }

    /**
     * @param biz
     *            要设置的 biz
     */
    public void setBiz(StudentBiz biz) {
	this.biz = biz;
    }

}
