package com.lh.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

public class Test7 {

	public static void main(String[] args) {
		
		try {
            //创建压缩文件
            ZipFile zipFile = new ZipFile("D:/test.zip");
            ArrayList<File> files = new ArrayList<>();
            files.add(new File("D:/小田.jpg"));

            //设置压缩文件参数
            ZipParameters parameters = new ZipParameters();
            //设置压缩方法
            parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);

            //设置压缩级别
            //DEFLATE_LEVEL_FASTEST     - Lowest compression level but higher speed of compression
            //DEFLATE_LEVEL_FAST        - Low compression level but higher speed of compression
            //DEFLATE_LEVEL_NORMAL  - Optimal balance between compression level/speed
            //DEFLATE_LEVEL_MAXIMUM     - High compression level with a compromise of speed
            //DEFLATE_LEVEL_ULTRA       - Highest compression level but low speed
            parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);

            //设置压缩文件加密
            parameters.setEncryptFiles(true);

            //设置加密方法
            parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES);

            //设置aes加密强度
            parameters.setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);

            //设置密码
            parameters.setPassword("123456");

            //添加文件到压缩文件d
//            zipFile.addFiles(files, parameters);
            
            FileInputStream fis;
			try {
				fis = new FileInputStream(new File("D:/小田.jpg"));
				zipFile.addStream(fis, parameters);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
        } catch (ZipException e) {
            e.printStackTrace();
        }

	}


}
