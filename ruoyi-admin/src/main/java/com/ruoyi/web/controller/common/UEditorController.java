package com.ruoyi.web.controller.common;

import com.alibaba.druid.util.Utils;
import com.ruoyi.common.config.RuoYiConfig;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.file.FileUploadUtils;
import com.ruoyi.framework.config.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

//import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author jzg
 * @ClassName UEditorController
 * @description 百度编辑器图片上传
 * @Version
 * @create: 2024-03-04
 */
@RestController
@RequestMapping("/ueditor")
public class UEditorController {

    @Autowired
    private ServerConfig serverConfig;

    /**
     * 读取配置文件
     * @param action
     * @param noCache
     * @return
     * @throws IOException
     */
    @GetMapping("/upload")
    public String getConfig(String action,String noCache) throws IOException {
        Resource resource = new ClassPathResource("UEditorConfig.json");
        InputStream in=resource.getInputStream();
        if (in != null) {
            String  text = Utils.read(in);
            return text;
        }
        return null;
    }

    /**
     * editor通用上传请求（单个）
     */
    @PostMapping("/upload")
    public AjaxResult editorUploadFile(String action, MultipartFile upfile) {
        try{
            AjaxResult ajax = AjaxResult.success();
            // 上传文件路径
            String filePath = RuoYiConfig.getUploadPath()+"/ueditor";
            // 上传并返回新文件名称
            String fileName = FileUploadUtils.upload(filePath, upfile);
            //String url = serverConfig.getUrl() + fileName;
            ajax.put("state", "SUCCESS");
            ajax.put("url", fileName);
            ajax.put("original", upfile.getOriginalFilename());
            if (action.equals("uploadimage")) {
                ajax.put("title", "图片文件");
            } else if (action.equals("uploadvideo")) {
                ajax.put("title", "视频文件");
            } else {
                ajax.put("title", "文件");
            }
            return ajax;
        }catch (Exception e){
            e.printStackTrace();
            return AjaxResult.error("上传失败");
        }

    }

}
