package com.servletfiles;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class FileUpload
 */
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());// sf class if founf in common file
																					// upload jar
			try {
				List<FileItem> files = sf.parseRequest(request);// throws exception, so surround with try catch
				// parseRequest is found in ServletFileUpload class.

				for (FileItem fileItem : files) {
					try {
						
						fileItem.write(new File("C:/Users/DELL/git/java_practice/File-Upload-Demo/"+fileItem.getName()));// give this / instead off \\ which is default path copied from explorer
																								// give / after File-Upload-Demo to create files under that particular folder.
																								// or ele file will be saved in java_practice with name File-Upload-Demo+file name
						System.out.println("File Uploaded");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
