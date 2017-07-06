/**  
* @Title:  UploadAction.java
* @Package com.xin.action
* @Description: TODO(用一句话描述该文件做什么)
* @author Hou Dongchang
* @date  2017年5月12日 下午1:24:33
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
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName: UploadAction
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Hou Dongchang
 * @date 2017年5月12日 下午1:24:33
 *
 */
public class UploadAction extends ActionSupport {

    /**
     * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
     */
    private static final long serialVersionUID = 1L;

    // 上传
    private List<File> file;// 文件
    private List<String> fileContentType;// 文件类型
    private List<String> fileFileName;// 文件名
    private String saveRealPath;// 上传资源在服务器那个目录下

    String realPath = ServletActionContext.getServletContext().getRealPath(saveRealPath);

    /*
     * (非 Javadoc) <p>Title: execute</p> <p>Description: </p>
     * 
     * @return
     * 
     * @throws Exception
     * 
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
    public String upload() throws Exception {
	// 步骤：
	// 1，获得输入流的实例

	BufferedInputStream bis = null;
	// 2,获得输出流的实例

	BufferedOutputStream bos = null;

	System.out.println(realPath);
	for (int i = 0; i < file.size(); i++) {
	    bis = new BufferedInputStream(new FileInputStream(file.get(i)));
	    File outFile = new File(realPath, fileFileName.get(i));
	    bos = new BufferedOutputStream(new FileOutputStream(outFile));
	    // 3,将输入流中的数据读取到输出流中
	    int len = -1;
	    byte[] b = new byte[1024];
	    while ((len = bis.read(b)) != -1) {
		bos.write(b, 0, len);
		bos.flush();
	    }
	    // 4，资源释放
	    bos.close();
	    bis.close();
	}

	return SUCCESS;
    }

    /**
     * @Title: download @Description: TODO(这里用一句话描述这个方法的作用) @author Hou
     *         Dongchang @throws
     */
    public String download() throws Exception {
	return SUCCESS;

    }

    /**
     * @return file
     */
    public List<File> getFile() {
	return file;
    }

    /**
     * @param file
     *            要设置的 file
     */
    public void setFile(List<File> file) {
	this.file = file;
    }

    /**
     * @return fileContentType
     */
    public List<String> getFileContentType() {
	return fileContentType;
    }

    /**
     * @param fileContentType
     *            要设置的 fileContentType
     */
    public void setFileContentType(List<String> fileContentType) {
	this.fileContentType = fileContentType;
    }

    /**
     * @return fileFileName
     */
    public List<String> getFileFileName() {
	return fileFileName;
    }

    /**
     * @param fileFileName
     *            要设置的 fileFileName
     */
    public void setFileFileName(List<String> fileFileName) {
	this.fileFileName = fileFileName;
    }

    /**
     * @return saveRealPath
     */
    public String getSaveRealPath() {
	return saveRealPath;
    }

    /**
     * @param saveRealPath
     *            要设置的 saveRealPath
     */
    public void setSaveRealPath(String saveRealPath) {
	this.saveRealPath = saveRealPath;
    }

}
