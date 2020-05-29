package com.lh.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;


import cn.hutool.core.lang.Console;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

public class Test8 {

	public byte bySupport;
	
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
		
//		String topic = "";
//		
//		switch("bbb"){//从匹配项开始往下执行，如果没有break的话，则一直执行到最后
//			case "aaa":
//				System.out.println("aaa");
//				break;
//			case "bbb":
//				System.out.println("bbb");
//				break;
//			case "ccc":
//				System.out.println("ccc");
//				break;
//			default:
//				break;
//		}
		
//		System.out.println(Integer.parseInt("-1"));
		
		
//		long ip= NetUtil.ipv4ToLong("192.168.0.100");
//		System.out.println(ip);
//		System.out.println(NetUtil.longToIpv4(ip));
//		System.out.println(NetUtil.getUsableLocalPort(20000));
		
//		System.out.println(ZipUtil.zlib("我爱你中国", CharsetUtil.UTF_8, 9));
		
		
//		//请求列表页
//		String listContent = HttpUtil.get("https://www.oschina.net/action/ajax/get_more_news_list?newsType=&p=2");
//		System.out.println(listContent);
//		//使用正则获取所有标题
//		List<String> titles = ReUtil.findAll("<span class=\"text-ellipsis\">(.*?)</span>", listContent, 1);
//		for (String title : titles) {
//		    //打印标题
//		    Console.log(title);
//		}
		
//		Integer type = 4;
//		System.out.println(4 == type);
				
//		String exception_states = "0";
//		String exception_state = exception_states.substring(exception_states.lastIndexOf(",")+1,exception_states.length());
//		System.out.println(exception_state);
		
//		BigDecimal crowedCoefficient = new BigDecimal(1).divide(new BigDecimal(23), 1, RoundingMode.HALF_UP);
//		System.out.println(crowedCoefficient);
		
//		String file_path ="abc_123";
//		file_path = file_path.replaceFirst("abc", "");
//		System.out.println(file_path);
		
		int exam_duration = (int)Math.ceil(2/10) * 463;
		System.out.println(exam_duration);
		System.out.println(Math.ceil(2/10));
		float  a = (float)2/10;
//		float num= (float)2/3;
		System.out.println(a);
		
		int num = new BigDecimal("0").divide(new BigDecimal("10"),BigDecimal.ROUND_CEILING).intValue();
		System.out.println(num);
		System.out.println("-------");
		
		System.out.println(new Test8().bySupport);
	}


}
