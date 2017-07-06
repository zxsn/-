/**  
* @Title:  StudentDao.java
* @Package com.xin.dao
* @Description: TODO(用一句话描述该文件做什么)
* @author Hou Dongchang
* @date  2017年5月6日 下午8:33:07
* @version V1.0  
* Update Logs:
* ****************************************************
* Name:
* Date:
* Description:
******************************************************
*/
package com.xin.dao;

import java.util.List;

import com.xin.bean.Student;

/**
 * @ClassName: StudentDao
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Hou Dongchang
 * @date 2017年5月6日 下午8:33:07
 *
 */
public interface StudentDao {

    /**
     * @Title: findStudentByStidAndPwd @Description:
     *         TODO(这里用一句话描述这个方法的作用) @author Hou Dongchang @param
     *         student @return @throws
     */
    Student findStudentByStidAndPwd(Student student);

    /**
     * @Title: save @Description: TODO(这里用一句话描述这个方法的作用) @author Hou
     *         Dongchang @param student @return @throws
     */
    boolean save(Student student);

    /**
     * @Title: select @Description: TODO(这里用一句话描述这个方法的作用) @author Hou
     *         Dongchang @return @throws
     */
    List<Student> select();

    /**
     * @Title: getAllRecords @Description: TODO(这里用一句话描述这个方法的作用) @author Hou
     *         Dongchang @param student @return @throws
     */
    int getAllRecords(Student student);

    /**
     * @Title: getSpecialStudents @Description: TODO(这里用一句话描述这个方法的作用) @author
     *         Hou Dongchang @param beginIndex @param pageCnt @param
     *         student @return @throws
     */
    List<Student> getSpecialStudents(int beginIndex, int pageSize, Student student);

    /**
     * @Title: delect @Description: TODO(这里用一句话描述这个方法的作用) @author Hou
     *         Dongchang @param stid @return @throws
     */
    boolean delect(String stid);

    /**
     * @Title: queryByStid @Description: TODO(这里用一句话描述这个方法的作用) @author Hou
     *         Dongchang @param stid @return @throws
     */
    Student queryByStid(String stid);

    /**
     * @Title: updateStudent @Description: TODO(这里用一句话描述这个方法的作用) @author Hou
     * Dongchang @param student @return @throws
     */
    boolean updateStudent(Student student);

}
