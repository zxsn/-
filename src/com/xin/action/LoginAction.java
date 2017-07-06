/**  
* @Title:  LoginAction.java
* @Package com.xin.action
* @Description: TODO(用一句话描述该文件做什么)
* @author Hou Dongchang
* @date  2017年5月6日 下午8:23:32
* @version V1.0  
* Update Logs:
* ****************************************************
* Name:
* Date:
* Description:
******************************************************
*/
package com.xin.action;

import com.opensymphony.xwork2.Action;
import com.xin.bean.Student;
import com.xin.biz.StudentBiz;

/**
 * @ClassName: LoginAction
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Hou Dongchang
 * @date 2017年5月6日 下午8:23:32
 *
 */
public class LoginAction {
    private Student student;
    private StudentBiz biz;

    /**
     * 登陆
     * 
     * @return
     */
    public String login() {
	// System.out.println(student.getStid());
	// System.out.println(student.getPassword());
	if ((student.getStid()).equals("admin") && student.getPassword().equals("admin")) {
	    return Action.NONE;
	} else {

	    student = biz.login(student);
	    if (student != null) {

		return Action.SUCCESS;
	    } else {
		return Action.ERROR;
	    }
	}
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
