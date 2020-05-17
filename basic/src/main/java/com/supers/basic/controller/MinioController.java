package com.supers.basic.controller;

import io.minio.MinioClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

@RestController
@RequestMapping("/minio")
public class MinioController {
    private static String url = "http://39.101.202.67:9000";  //minio服务的IP端口
    private static String accessKey = "super@123";
    private static String secretKey = "super@123";
    private static String bucketName = "minio-basic";

    @PostMapping("upload")
    public String upload(@RequestParam("fileName") MultipartFile file )  {
        try {
            MinioClient minioClient = new MinioClient(url, accessKey, secretKey);
            InputStream fileStream = file.getInputStream(); //得到文件流
            String fileName = file.getOriginalFilename(); //文件名
            String contentType = file.getContentType();  //类型
            minioClient.putObject(bucketName, fileName, fileStream, null); //把文件放置Minio桶(文件夹)
            return  "上传成功";
        }catch (Exception e){
            return "上传失败";
        }
    }
}
