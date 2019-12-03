package com.lh.test;

import java.util.concurrent.ConcurrentHashMap;

import cn.hutool.core.thread.ThreadUtil;

public class Test6 {

	public static void main(String[] args) {
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		
		
//		ThreadUtil.execAsync(task);
	
//		ThreadUtil.newExecutor();
	
	// online test aa
	// online test  11 bb cc ee
		
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
		System.out.println(map.put("1", "1"));
		System.out.println(map.putIfAbsent("1", "1"));
		System.out.println(map.put("1", "2"));
		System.out.println(map.get("1"));
	}

}
