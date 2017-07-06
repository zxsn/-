/**  
* @Title:  RegisterAction.java
* @Package com.xin.action
* @Description: TODO(用一句话描述该文件做什么)
* @author Hou Dongchang
* @date  2017年5月8日 上午10:19:54
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
 * @ClassName: RegisterAction
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Hou Dongchang
 * @date 2017年5月8日 上午10:19:54
 *
 */
public class RegisterAction {
    private Student student;
    private StudentBiz biz;

    /**
     * @Title: regist @Description: TODO(这里用一句话描述这个方法的作用) @author Hou
     *         Dongchang @throws
     */
    public String regist() {
	boolean isSuccess = biz.regist(student);
	System.out.println("---" + student.getId());
	System.out.println("---" + student.getStid());
	System.out.println("---" + student.getPassword());
	System.out.println("---" + student.getName());
	System.out.println("---" + student.getGender());
	System.out.println("---" + student.getProvince());
	System.out.println("---" + student.getCity());
	System.out.println("---" + student.getArea());
	System.out.println("---" + student.getBirthday());
	System.out.println("---" + student.getDescription());
	System.out.println("---" + student.getPhone());
	if (isSuccess) {

	    return Action.SUCCESS;
	} else {
	    return Action.ERROR;
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
