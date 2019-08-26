package com.lh.test;

import java.util.List;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;

public class Test {

	
	
	
	
	
	public static void main(String[] args) {
		
		List<String> row1 = CollUtil.newArrayList("aa", "bb", "cc", "dd");
		List<String> row2 = CollUtil.newArrayList("aa1", "bb1", "cc1", "dd1");
		List<String> row3 = CollUtil.newArrayList("aa2", "bb2", "cc2", "dd2");
		List<String> row4 = CollUtil.newArrayList("aa3", "bb3", "cc3", "dd3");
		List<String> row5 = CollUtil.newArrayList("aa4", "bb4", "cc4", "dd4");

		List<List<String>> rows = CollUtil.newArrayList(row1, row2, row3, row4, row5);
		
		//通过工具类创建writer
		ExcelWriter writer = ExcelUtil.getWriter("d:/writeTest.xlsx");
		//通过构造方法创建writer
		//ExcelWriter writer = new ExcelWriter("d:/writeTest.xls");

		//跳过当前行，既第一行，非必须，在此演示用
		writer.passCurrentRow();

		//合并单元格后的标题行，使用默认标题样式
		writer.merge(row1.size() - 1, "测试标题");
		
		//合并行
		writer.merge(8, 10, 1, 2, "hahahaha", false);
		
		//一次性写出内容
		writer.write(rows);
		
		
		
		//关闭writer，释放内存
		writer.close();
		
		
////		String ID_18 = "321083197812162119";
////		String province = IdcardUtil.getProvinceByIdCard(ID_18);
////		System.out.println(province);
//		
//		Object obj = JSONObject.fromObject("{}").get("status");
//		String status = (null != obj) ? obj.toString() : "fail";
//		System.out.println(status);
//		System.out.println(obj.toString());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
