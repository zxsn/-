/**  
* @Title:  RollcallAction.java
* @Package com.xin.action
* @Description: TODO(用一句话描述该文件做什么)
* @author Hou Dongchang
* @date  2017年5月13日 下午9:18:26
* @version V1.0  
* Update Logs:
* ****************************************************
* Name:
* Date:
* Description:
******************************************************
*/
package com.xin.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName: RollcallAction
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Hou Dongchang
 * @date 2017年5月13日 下午9:18:26
 *
 */
public class RollcallAction extends ActionSupport {
    private String[] tags;

    // private Map<String, Object> map;

    // /**
    // * @return map
    // */
    // public Map<String, Object> getMap() {
    // return map;
    // }
    //
    // /**
    // * @param map
    // * 要设置的 map
    // */
    // public void setMap(Map<String, Object> map) {
    // this.map = map;
    // }

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;

    /**
     * @Title: addArray @Description: TODO(这里用一句话描述这个方法的作用) @author Hou
     *         Dongchang @throws
     */
    public String addStuToArray() {
	// System.out.println(tags.toString());

	// for (String tag : tags) { System.out.println(tag); }
	// HttpServletRequest request = ServletActionContext.getRequest();
	// request.setAttribute("name", tags);
	// request.setAttribute("name", tags);

	for (String tag : tags) {
	    System.out.println(tag);
	}

	/*
	 * map = new HashMap<String, Object>();
	 * 
	 * map.put("tags", tags);
	 */

	return SUCCESS;

    }

    public String[] getTags() {
	return tags;
    }

    public void setTags(String[] tags) {
	this.tags = tags;
    }

}
