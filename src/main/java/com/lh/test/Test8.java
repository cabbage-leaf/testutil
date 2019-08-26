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

public class Test8 {

	public static void main(String[] args) {
		
//		
//		Integer current_time1 = new Long(System.currentTimeMillis()/1000).intValue();
//		
//		System.out.println(System.currentTimeMillis()/1000);
//		System.out.println(current_time1);
//		
//		String row_no_format = "第%s行";
//		System.out.println(String.format(row_no_format, 10));
		
		String str = "a,b";
		System.out.println(str.split(",",-1).length);
		
	}


}
