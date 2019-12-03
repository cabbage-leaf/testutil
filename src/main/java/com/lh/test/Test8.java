package com.lh.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.google.common.base.CaseFormat;

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
		
//		String str = "a,b";
//		System.out.println(str.split(",",-1).length);
		
//		System.out.println(new BigDecimal((2+3)*0));
	
//		int index = 65;
//		String str= String.valueOf((char)index++);
//		System.out.println(str);
//		System.out.println(index);
		
//		System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "user_nAme.idS")); //下划线转驼峰
//		System.out.println(CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, "userName.ids")); //驼峰转下划线
		
		
		
//		String testlet_range = "1,1,13,1,,,4,5,6,7,8,9,10";
//		
//		testlet_range = testlet_range.endsWith(",")?testlet_range.substring(0, testlet_range.length()-1):testlet_range;
//		//取集合中最大值和最小值来组合成题组范围
//		List<String> testlet_num_list = Arrays.asList(testlet_range.split(","));
//		Comparator<String> comp = new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				o1 = StringUtils.isNumeric(o1) && StringUtils.isNotBlank(o1)? o1 : "1";
//				o2 = StringUtils.isNumeric(o2) && StringUtils.isNotBlank(o2)? o2 : "1";
//				return Integer.valueOf(o1) - Integer.valueOf(o2);
//			}
//		};
//		String min_num = Collections.min(testlet_num_list, comp);
//		String max_num = Collections.max(testlet_num_list, comp);
//		testlet_range = min_num+"-"+max_num;
//		System.out.println(testlet_range);
		
		String topic = "";
		
		switch("bbb"){//从匹配项开始往下执行，如果没有break的话，则一直执行到最后
			case "aaa":
				System.out.println("aaa");
				break;
			case "bbb":
				System.out.println("bbb");
				break;
			case "ccc":
				System.out.println("ccc");
				break;
			default:
				break;
		}
		
		
	}


}
