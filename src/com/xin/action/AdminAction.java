/**  
* @Title:  AdminAction.java
* @Package com.xin.action
* @Description: TODO(用一句话描述该文件做什么)
* @author Hou Dongchang
* @date  2017年5月10日 上午9:27:11
* @version V1.0  
* Update Logs:
* ****************************************************
* Name:
* Date:
* Description:
******************************************************
*/
package com.xin.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.xin.bean.PageBean;
import com.xin.bean.Student;
import com.xin.biz.StudentBiz;

/**
 * @ClassName: AdminAction
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Hou Dongchang
 * @date 2017年5月10日 上午9:27:11
 *
 */
public class AdminAction {
    private Student student;
    private StudentBiz biz;
    private PageBean nowPage;

    private String[] cartCheckBox;

    /**
     * @return cartCheckBox
     */
    public String[] getCartCheckBox() {
	return cartCheckBox;
    }

    /**
     * @param cartCheckBox
     *            要设置的 cartCheckBox
     */
    public void setCartCheckBox(String[] cartCheckBox) {
	this.cartCheckBox = cartCheckBox;
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

    /**
     * @return nowPage
     */
    public PageBean getNowPage() {
	return nowPage;
    }

    /**
     * @param nowPage
     *            要设置的 nowPage
     */
    public void setNowPage(PageBean nowPage) {
	this.nowPage = nowPage;
    }

    /**
     * @Title: queryStudent @Description: TODO(这里用一句话描述这个方法的作用) @author Hou
     *         Dongchang @throws
     */
    @SuppressWarnings("unused")
    public String queryStudent() {
	// 思路：
	// 1、调用biz层查询客户的方法进行分页查询,将查询到的结果保存到List集合中
	// 设置默认的当前页
	nowPage = nowPage == null ? new PageBean() : nowPage;
	int currentPage = nowPage.getCurrentPage();
	nowPage.setCurrentPage(currentPage == 0 ? 1 : currentPage);

	PageBean pageInfo = biz.getNowPageAllInfo(nowPage);

	HttpServletRequest request = ServletActionContext.getRequest();
	pageInfo.setUri(getAllUri(request) + "?");

	// 3、成功后，将结果设置到request域中,转发到列表页面读取所有客户的信息予以显示；
	String targetPage = Action.SUCCESS;
	if (pageInfo != null) {
	    request.setAttribute("pageInfo", pageInfo);
	} else {
	    // 失败后，转发到失败页面，显示错误信息
	    targetPage = Action.ERROR;
	    request.setAttribute("msg", "分页查询客户失败！...");
	}

	return targetPage;

    }

    /**
     * @Title: getAllUri @Description: TODO(这里用一句话描述这个方法的作用) @author Hou
     *         Dongchang @param request @return @throws
     */
    private String getAllUri(HttpServletRequest request) {
	String contextPath = request.getContextPath();
	String servletPath = request.getServletPath();
	String queryString = request.getQueryString();

	StringBuffer uri = new StringBuffer();
	uri.append(contextPath).append(servletPath);

	String tmpQueryStr = "";
	if (queryString != null) {
	    int index = queryString.indexOf("nowPage.currentPage");
	    if (index < 0) {
		tmpQueryStr = queryString.substring(0);
	    } else {
		tmpQueryStr = queryString.substring(0, index);// 要排除在外的原因是currentPage=xx有页面中客户点击某个分析链接动态给定的
	    }
	    uri.append(tmpQueryStr);
	}
	return uri.toString();
    }

    public String getAdvancedUri(HttpServletRequest request) {
	String contextPath = request.getContextPath();
	String servletPath = request.getServletPath();
	String queryString = request.getQueryString();

	StringBuffer uri = new StringBuffer();
	uri.append(contextPath).append(servletPath);

	String tmpQueryStr = "";
	if (queryString != null) {
	    uri.append("?");
	    int index = queryString.indexOf("nowPage.currentPage");
	    if (index < 0) {
		tmpQueryStr = queryString.substring(0);
	    } else {
		tmpQueryStr = queryString.substring(0, index);// 要排除在外的原因是currentPage=xx有页面中客户点击某个分析链接动态给定的
		// tmpQueryStr = tmpQueryStr.replace("?nowPage.currentPage",
		// "&nowPage.currentPage");
	    }
	    uri.append(tmpQueryStr);
	}
	return uri.toString();
    }

    /**
     * @Title: findStudentsByCondition @Description:
     *         TODO(这里用一句话描述这个方法的作用) @author Hou Dongchang @throws
     */
    @SuppressWarnings("unused")
    public String findStudentsByCondition() {
	// 若用户全部都不选择，查询所有的客户信息
	String stid = student.getStid();
	String name = student.getName();
	String gender = student.getGender();
	String phone = student.getPhone();
	String province = student.getProvince();
	String city = student.getCity();
	String area = student.getArea();

	if ((stid == null || "".equals(stid)) && (name == null || "".equals(name))
		&& (gender == null || "".equals(gender)) && (phone == null || "".equals(phone))
		&& (province == null || "".equals(province)) && (city == null || "".equals(city))
		&& (area == null || "".equals(area))) {
	    return "queryAll";
	}

	// 思路：
	// 1、调用biz层查询客户的方法进行分页查询,将查询到的结果保存到List集合中
	nowPage = nowPage == null ? new PageBean() : nowPage;
	int currentPage = nowPage.getCurrentPage();
	nowPage.setCurrentPage(currentPage == 0 ? 1 : currentPage);
	// 思路：
	// 1、将表单中的选项值封装到Customer实例中作为检索的条件
	// 2、调用biz层中的根据条件查询的方法，查询出满足条件(包括分页)的客户信息，并将页面信息封装到PageBean中

	PageBean pageInfo = biz.findCustomerByCondition(student, nowPage);
	HttpServletRequest request = ServletActionContext.getRequest();
	pageInfo.setUri(getAdvancedUri(request) + "&");
	pageInfo.setUri(pageInfo.getUri().replace("&&", "&"));

	// 3、成功后，将结果设置到request域中,转发到列表页面读取所有客户的信息予以显示；
	String targetPage = Action.SUCCESS;
	if (pageInfo != null) {
	    request.setAttribute("pageInfo", pageInfo);
	} else {
	    // 失败后，转发到失败页面，显示错误信息
	    targetPage = Action.ERROR;
	    request.setAttribute("msg", "分页查询客户失败！...");
	}

	return targetPage;
    }

    /**
     * @Title: deleteStudent @Description: TODO(这里用一句话描述这个方法的作用) @author Hou
     *         Dongchang @throws
     */
    public String deleteStudent() {
	// 思路：
	// 1、获取删除学生的stid
	// 2、调用biz中的删除方法进行删除

	for (String stid : cartCheckBox) {
	    System.out.println(stid);
	    biz.deleteNowSelectedStudent(stid);

	}
	// 3、后续处理
	// // ①、成功后，转发到本servlet中的queryCustomer方法进行处理
	return Action.SUCCESS;
    }

    /**
     * 预编辑客户
     */
    public String preEditStudent() {
	// 思路：
	// 1、获取待编辑学生的id

	// 2、调用biz中的根据id查询客户的方法进行查询
	Student tmpStudent = biz.findStudentByStid(student.getStid());
	setStudent(tmpStudent);

	ActionContext ac = ActionContext.getContext();
	// 3、后续处理
	if (tmpStudent != null) {
	    // ①、成功后，将学生实例保存到request域中，转发到编辑页面，将该客户的信息显示到页面上
	    return Action.SUCCESS;
	} else {
	    // ②失败后，转发到失败页面，显示错误信息
	    ac.put("msg", "根据stid查询学生（预编辑学生）信息失败！...");
	    return Action.ERROR;
	}
    }

    /**
     * 编辑客户
     */
    public String editStudent() {
	// 思路：
	// 1、将表单中的数据封装到Customer实例中
	// 2、调用Biz层的编辑客户的方法实现编辑操作
	boolean isSuccess = biz.editStudent(student);

	// 3、将反馈的结果设置到request域中
	// 4、转发到信息显示页面
	// 失败，转发到“err.jsp”
	HttpServletRequest request = ServletActionContext.getRequest();
	String msg = "";
	if (isSuccess) {
	    // ①、成功后，重定向到本servlet中的queryCustomer方法进行处理
	    return Action.SUCCESS;
	} else {
	    msg = "编辑客户失败了哇！555...";
	    request.setAttribute("msg", msg);
	    return Action.ERROR;
	}

    }

}
