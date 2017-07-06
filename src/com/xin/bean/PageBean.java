/**
 * 
 */
package com.xin.bean;

import java.util.LinkedList;
import java.util.List;

/**
 * Description：Page实体类(承担着双重任务：①封装数据库中查询到的数据；②封装页面上要查询的条件)<br/>
 * Copyright (c) ， 2017， Jansonxu <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name：PageBean.java<br/>
 * Date：2017年4月7日
 * 
 * @author 徐文波
 * @version : 1.0
 */
public class PageBean {
    private List<Student> students = new LinkedList<>();// 每页信息
    private int totalRecords;// 总记录数
    private static final int PAGE_CNT = 35;// 每页的记录数(约定的常量值)
    private static final int PAGE_NUMS = 35;// 每页的最大页码(约定的常量值)
    private int totalPages;// 总页数
    private int currentPage;// 当前页
    private int beginIndex;// 开始索引
    private int endIndex; // 结束索引
    private String uri; // 页面的url，如：${pageContext.servletContext.contextPath
			// }/CustomerServlet?method=方法名

    private List<Integer> pageNums = new LinkedList<>();// 存放页码的容器

    /**
     * @return students
     */
    public List<Student> getStudents() {
	return students;
    }

    /**
     * @param students
     *            要设置的 students
     */
    public void setStudents(List<Student> students) {
	this.students = students;
    }

    /**
     * @return totalRecords
     */
    public int getTotalRecords() {
	return totalRecords;
    }

    /**
     * @param totalRecords
     *            要设置的 totalRecords
     */
    public void setTotalRecords(int totalRecords) {
	this.totalRecords = totalRecords;
    }

    /**
     * @return totalPages
     */
    public int getTotalPages() {

	// 总页数 = 总记录数/每页的记录数
	int totalPagesTmp = totalRecords / PAGE_CNT;
	int cnt = totalRecords % PAGE_CNT;
	totalPages = cnt == 0 ? totalPagesTmp : totalPagesTmp + 1;
	return totalPages;
    }

    /**
     * @param totalPages
     *            要设置的 totalPages
     */
    public void setTotalPages(int totalPages) {
	this.totalPages = totalPages;
    }

    /**
     * @return currentPage
     */
    public int getCurrentPage() {
	return currentPage;
    }

    /**
     * @param currentPage
     *            要设置的 currentPage
     */
    public void setCurrentPage(int currentPage) {
	this.currentPage = currentPage;
    }

    /**
     * @return beginIndex
     */
    public int getBeginIndex() {
	// 规律：(当前页-1)*每页记录数+1
	// DButils:
	// beginIndex = (currentPage - 1) * PAGE_CNT +1;

	// 若是Hibernate,
	beginIndex = (currentPage - 1) * PAGE_CNT;

	// 调整边界值
	beginIndex = beginIndex <= 0 ? 0 : beginIndex;
	return beginIndex;
    }

    /**
     * @param beginIndex
     *            要设置的 beginIndex
     */
    public void setBeginIndex(int beginIndex) {
	this.beginIndex = beginIndex;
    }

    /**
     * @return endIndex
     */
    public int getEndIndex() {
	// 规律：当前页*每页记录数

	endIndex = currentPage * PAGE_CNT;

	// 调整边界值
	endIndex = endIndex > totalRecords ? totalRecords : endIndex;
	return endIndex;
    }

    /**
     * @param endIndex
     *            要设置的 endIndex
     */
    public void setEndIndex(int endIndex) {
	this.endIndex = endIndex;
    }

    /**
     * @return uri
     */
    public String getUri() {
	return uri;
    }

    /**
     * @param uri
     *            要设置的 uri
     */
    public void setUri(String uri) {
	this.uri = uri;
    }

    /**
     * @return pageNums
     */
    public List<Integer> getPageNums() {
	// 定义开始和结束的页码
	int beginNum = 0;
	int endNum = 0;

	// 若currentPage>=1 && <= 6
	// 数组元素的取值范围：1～10
	if (currentPage >= 1 && currentPage <= 6) {
	    beginNum = 1;
	    endNum = 10;
	} else if (currentPage >= 7) {
	    // 若currentPage>=7
	    // 数组元素的取值范围：
	    // 开始 = 当前页- 数组长度/2
	    beginNum = currentPage - PAGE_NUMS / 2;

	    // 结束 = 当前页 + (数组长度/2-1)
	    endNum = currentPage + (PAGE_NUMS / 2 - 1);
	}

	// 边界值：
	// 开始<=0,开始 = 1
	if (beginNum <= 0) {
	    beginNum = 1;
	}

	// 结束>总页数，结束 = 总页数
	if (endNum > totalPages) {
	    endNum = totalPages;
	}

	// 将确定好的页码置于容器中
	for (int i = beginNum; i <= endNum; i++) {
	    pageNums.add(i);
	}
	return pageNums;
    }

    /**
     * @param pageNums
     *            要设置的 pageNums
     */
    public void setPageNums(List<Integer> pageNums) {
	this.pageNums = pageNums;
    }

    /**
     * @return pageCnt
     */
    public static int getPageCnt() {
	return PAGE_CNT;
    }

}
