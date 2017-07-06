/**  
* @Title:  Attachment.java
* @Package com.xin.bean
* @Description: TODO(用一句话描述该文件做什么)
* @author Hou Dongchang
* @date  2017年5月13日 下午8:58:33
* @version V1.0  
* Update Logs:
* ****************************************************
* Name:
* Date:
* Description:
******************************************************
*/
package com.xin.bean;

/**
 * @ClassName: Attachment
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Hou Dongchang
 * @date 2017年5月13日 下午8:58:33
 *
 */
public class Attachment {
    private Integer id;
    // 附件名称
    private String fileName;
    // 附件路径
    private String filePath;

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
    public Attachment() {
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
     * @param id
     * @param fileName
     * @param filePath
     */
    public Attachment(Integer id, String fileName, String filePath) {
	super();
	this.id = id;
	this.fileName = fileName;
	this.filePath = filePath;
    }

    /**
     * @return id
     */
    public Integer getId() {
	return id;
    }

    /**
     * @param id
     *            要设置的 id
     */
    public void setId(Integer id) {
	this.id = id;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
	return fileName;
    }

    /**
     * @param fileName
     *            要设置的 fileName
     */
    public void setFileName(String fileName) {
	this.fileName = fileName;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
	return filePath;
    }

    /**
     * @param filePath
     *            要设置的 filePath
     */
    public void setFilePath(String filePath) {
	this.filePath = filePath;
    }

}
