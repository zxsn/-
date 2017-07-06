/**  
* @Title:  MultiFileDownloadAction.java
* @Package com.xin.action
* @Description: TODO(用一句话描述该文件做什么)
* @author Hou Dongchang
* @date  2017年5月13日 下午6:28:09
* @version V1.0  
* Update Logs:
* ****************************************************
* Name:
* Date:
* Description:
******************************************************
*/
package com.xin.action;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.xin.util.ZipFileUtil;

/**
 * @ClassName: MultiFileDownloadAction
 * @Description: TODO(处理多个附件下载)
 * @author Hou Dongchang
 * @date 2017年5月13日 下午6:28:09
 *
 */
public class MultiFileDownloadAction extends ActionSupport {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;
    // 接收JSP页面传递过来的附件的路径
    private String attachmentPath;

    // 最终压缩后的zip文件的路径，传递给通用的下载Action
    private String fileName;

    /**
     * 下载多个附件 实现：将多个附近压缩成zip包,然后再下载zip包
     */
    public String downloadMultiFile() {
	// 使用当前时间生成文件名称
	String formatDate = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
	// 压缩后的zip文件存放路径
	fileName = "D:/test/" + formatDate + ".zip";

	if (attachmentPath != null && !"".equals(attachmentPath)) {
	    // 将多个附件的路径取出
	    String[] attachmentPathArray = attachmentPath.split(",");
	    if (attachmentPathArray != null && attachmentPathArray.length > 0) {
		File[] files = new File[attachmentPathArray.length];
		for (int i = 0; i < attachmentPathArray.length; i++) {
		    if (attachmentPathArray[i] != null) {
			File file = new File(attachmentPathArray[i].trim());
			if (file.exists()) {
			    files[i] = file;
			}
		    }
		}
		// 将多个附件压缩成zip
		ZipFileUtil.compressFiles2Zip(files, fileName);
	    }

	}
	return SUCCESS;
    }

    public String getAttachmentPath() {
	return attachmentPath;
    }

    public void setAttachmentPath(String attachmentPath) {
	this.attachmentPath = attachmentPath;
    }

    public String getFileName() {
	return fileName;
    }

    public void setFileName(String fileName) {
	this.fileName = fileName;
    }

}
