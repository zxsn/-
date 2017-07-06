/**  
* @Title:  Student.java
* @Package com.xin.bean
* @Description: TODO(用一句话描述该文件做什么)
* @author Hou Dongchang
* @date  2017年5月6日 下午6:31:02
* @version V1.0  
* Update Logs:
* ****************************************************
* Name:
* Date:
* Description:
******************************************************
*/
package com.xin.bean;

import java.util.Date;

/**
 * @ClassName: Student
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Hou Dongchang
 * @date 2017年5月6日 下午6:31:02
 *
 */
public class Student {
    private int id;
    private String stid;
    private String name;
    private String password;
    private String gender;
    private String phone;
    private String province;
    private String city;
    private String area;
    private Date birthday;
    private String description;

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
    public Student() {
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
     * @param stid
     * @param name
     * @param password
     * @param gender
     * @param phone
     * @param province
     * @param city
     * @param area
     * @param birthday
     * @param description
     */
    public Student(int id, String stid, String name, String password, String gender, String phone, String province,
	    String city, String area, Date birthday, String description) {
	super();
	this.id = id;
	this.stid = stid;
	this.name = name;
	this.password = password;
	this.gender = gender;
	this.phone = phone;
	this.province = province;
	this.city = city;
	this.area = area;
	this.birthday = birthday;
	this.description = description;
    }

    /**
     * @return id
     */
    public int getId() {
	return id;
    }

    /**
     * @param id
     *            要设置的 id
     */
    public void setId(int id) {
	this.id = id;
    }

    /**
     * @return stid
     */
    public String getStid() {
	return stid;
    }

    /**
     * @param stid
     *            要设置的 stid
     */
    public void setStid(String stid) {
	this.stid = stid;
    }

    /**
     * @return name
     */
    public String getName() {
	return name;
    }

    /**
     * @param name
     *            要设置的 name
     */
    public void setName(String name) {
	this.name = name;
    }

    /**
     * @return password
     */
    public String getPassword() {
	return password;
    }

    /**
     * @param password
     *            要设置的 password
     */
    public void setPassword(String password) {
	this.password = password;
    }

    /**
     * @return gender
     */
    public String getGender() {
	return gender;
    }

    /**
     * @param gender
     *            要设置的 gender
     */
    public void setGender(String gender) {
	this.gender = gender;
    }

    /**
     * @return phone
     */
    public String getPhone() {
	return phone;
    }

    /**
     * @param phone
     *            要设置的 phone
     */
    public void setPhone(String phone) {
	this.phone = phone;
    }

    /**
     * @return province
     */
    public String getProvince() {
	return province;
    }

    /**
     * @param province
     *            要设置的 province
     */
    public void setProvince(String province) {
	this.province = province;
    }

    /**
     * @return city
     */
    public String getCity() {
	return city;
    }

    /**
     * @param city
     *            要设置的 city
     */
    public void setCity(String city) {
	this.city = city;
    }

    /**
     * @return area
     */
    public String getArea() {
	return area;
    }

    /**
     * @param area
     *            要设置的 area
     */
    public void setArea(String area) {
	this.area = area;
    }

    /**
     * @return birthday
     */
    public Date getBirthday() {
	return birthday;
    }

    /**
     * @param birthday
     *            要设置的 birthday
     */
    public void setBirthday(Date birthday) {
	this.birthday = birthday;
    }

    /**
     * @return description
     */
    public String getDescription() {
	return description;
    }

    /**
     * @param description
     *            要设置的 description
     */
    public void setDescription(String description) {
	this.description = description;
    }

}
