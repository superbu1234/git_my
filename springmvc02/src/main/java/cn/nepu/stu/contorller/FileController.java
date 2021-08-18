package cn.nepu.stu.contorller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/file")
public class FileController {
    @RequestMapping("/fileUpload1")
    public String fileUpload1(HttpServletRequest request) throws FileUploadException {
        System.out.println("文件上传。。。");
        //使用fileupload完成
        //上传位置
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        //判断路径是否存在
        File file = new File(path);
        if (!file.exists()){
            //创建该文件夹
            file.mkdirs();
        }
        //解析request对象，获取上传文件项
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        //解析上传文件项
        List<FileItem> fileItems = upload.parseRequest(request);
        for (FileItem item:
             fileItems) {
            //进行判断，当前item是否是上传文件项
            if(item.isFormField()){
                //说明普通表单项
            }else {
                //说明上传文件项
                //获取上传文件的名称
                String name = item.getName();
                //把文件名设置成唯一值uuid
                UUID uuid = UUID.randomUUID();
                name= String.valueOf(uuid).replace("-","")+name;
                //完成文件上传
                try {
                    item.write(new File(path,name));
                    //删除临时文件
                    item.delete();
                } catch (Exception e) {
                    new Throwable("上传失败！");
                }


            }
        }
        return "success";
    }

    @RequestMapping("/fileUpload2")
    public String fileUpload2(HttpServletRequest request,MultipartFile upload) throws IOException {
        //上传位置
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        //判断路径是否存在
        File file = new File(path);
        if (!file.exists()){
            //创建该文件夹
            file.mkdirs();
        }
        String uploadName = upload.getOriginalFilename();
        uploadName =UUID.randomUUID().toString()+uploadName;
        upload.transferTo(new File(path,uploadName));
        return "success";
    }
}
