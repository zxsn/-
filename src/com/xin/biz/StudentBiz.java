/**  
* @Title:  StudentBiz.java
* @Package com.xin.biz
* @Description: TODO(用一句话描述该文件做什么)
* @author Hou Dongchang
* @date  2017年5月6日 下午8:29:32
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

/**
 * @ClassName: StudentBiz
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Hou Dongchang
 * @date 2017年5月6日 下午8:29:32
 *
 */
public interface StudentBiz {

    /**
     * @Title: login @Description: TODO(这里用一句话描述这个方法的作用) @author Hou
     *         Dongchang @param student @return @throws
     */
    Student login(Student student);

    /**
     * @Title: regist @Description: TODO(这里用一句话描述这个方法的作用) @author Hou
     *         Dongchang @param student @return @throws
     */
    boolean regist(Student student);

    /**
     * @Title: queryAllCustomers @Description: TODO(这里用一句话描述这个方法的作用) @author Hou
     *         Dongchang @throws
     */
    List<Student> queryAllStudents();

    /**
     * @Title: getNowPageAllInfo @Description: TODO(这里用一句话描述这个方法的作用) @author Hou
     *         Dongchang @param page @return @throws
     */
    PageBean getNowPageAllInfo(PageBean page);

    /**
     * @Title: findCustomerByCondition @Description:
     *         TODO(这里用一句话描述这个方法的作用) @author Hou Dongchang @param student @param
     *         nowPage @return @throws
     */
    PageBean findCustomerByCondition(Student student, PageBean nowPage);

    /**
     * @Title: deleteNowSelectedStudent @Description:
     *         TODO(这里用一句话描述这个方法的作用) @author Hou Dongchang @param
     *         stid @return @throws
     */
    boolean deleteNowSelectedStudent(String stid);

    /**
     * @Title: findStudentByStid @Description: TODO(这里用一句话描述这个方法的作用) @author Hou
     *         Dongchang @param stid @return @throws
     */
    Student findStudentByStid(String stid);

    /**
     * @Title: editStudent @Description: TODO(这里用一句话描述这个方法的作用) @author Hou
     * Dongchang @param student @return @throws
     */
    boolean editStudent(Student student);

}
