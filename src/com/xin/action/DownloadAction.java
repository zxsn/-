/**  
* @Title:  DownloadAction.java
* @Package com.xin.action
* @Description: TODO(用一句话描述该文件做什么)
* @author Hou Dongchang
* @date  2017年5月13日 下午6:25:01
* @version V1.0  
* Update Logs:
* ****************************************************
* Name:
* Date:
* Description:
******************************************************
*/
package com.xin.action;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName: DownloadAction
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Hou Dongchang
 * @date 2017年5月13日 下午6:25:01
 *
 */
public class DownloadAction extends ActionSupport {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;
    // 文件名
    private String fileName;

    public String getFileName() {
	return fileName;
    }

    public void setFileName(String fileName) throws UnsupportedEncodingException {
	// 用UTF-8重新编码文件名,解决中文乱码
	this.fileName = new String(fileName.getBytes("ISO-8859-1"), "UTF-8");
    }

    public InputStream getInputStream() throws UnsupportedEncodingException, FileNotFoundException {
	HttpServletResponse response = ServletActionContext.getResponse();
	// attachment,以附件的方式下载文件,会打开保存文件对话框;inline,以内联的方式下载,浏览器会直接打开文件
	response.setHeader("Content-Disposition",
		"attachment;fileName=" + java.net.URLEncoder.encode(fileName, "UTF-8"));// java.net.URLEncoder.encode(fileName,"UTF-8")
											// 编码转换，解决乱码

	// 如果fileName是相对路径
	// return
	// ServletActionContext.getServletContext().getResourceAsStream(fileName);
	// 如果fileName是绝对路径
	return new BufferedInputStream(new FileInputStream(fileName));
    }

    @Override
    public String execute() throws Exception {
	return SUCCESS;
    }
}
