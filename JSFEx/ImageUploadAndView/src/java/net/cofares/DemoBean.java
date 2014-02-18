package net.cofares;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;  
import javax.faces.bean.SessionScoped;  


import javax.servlet.http.Part;

/**
 *
 * @author pascalfares
 */
@ManagedBean
@SessionScoped
public class DemoBean implements Serializable {
    private Part file1;  
    private Part file2;  
  
    // getters and setters for file1 and file2  
  
    public String upload() throws IOException {  
        try (InputStream inputStream = getFile1().getInputStream()) {
            System.out.println(getFilename(getFile1()));
            FileOutputStream outputStream = new FileOutputStream("/home/pascalfares/"+getFilename(getFile1()));
            
            byte[] buffer = new byte[4096];
            int bytesRead = 0;
            while(true) {
                bytesRead = inputStream.read(buffer);
                if(bytesRead > 0) {
                    outputStream.write(buffer, 0, bytesRead);
                }else {
                    break;
                }
            }
            outputStream.close();
        }  
         
        return "success";  
    }  
  
    private static String getFilename(Part part) {  
        for (String cd : part.getHeader("content-disposition").split(";")) {  
            if (cd.trim().startsWith("filename")) {  
                String filename = cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");  
                return filename.substring(filename.lastIndexOf('/') + 1).substring(filename.lastIndexOf('\\') + 1); // MSIE fix.  
            }  
        }  
        return null;  
    }  

    /**
     * @return the file1
     */
    public Part getFile1() {
        return file1;
    }

    /**
     * @param file1 the file1 to set
     */
    public void setFile1(Part file1) {
        this.file1 = file1;
    }

    /**
     * @return the file2
     */
    public Part getFile2() {
        return file2;
    }

    /**
     * @param file2 the file2 to set
     */
    public void setFile2(Part file2) {
        this.file2 = file2;
    }
}
