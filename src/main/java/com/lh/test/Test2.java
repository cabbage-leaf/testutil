package com.lh.test;

import com.google.common.geometry.S2;
import com.google.common.geometry.S2Cap;
import com.google.common.geometry.S2LatLng;
import com.google.common.geometry.S2LatLngRect;

public class Test2 {

	public static void main(String[] args) {
		//矩形
		S2LatLng startS2 = S2LatLng.fromDegrees(0.8293, 72.004); //左下角
		S2LatLng endS2 = S2LatLng.fromDegrees(55.8271, 137.8347); //右上角
		S2LatLngRect rect = new S2LatLngRect(startS2, endS2);//矩形
		
		//圆形
		double radius = 600.5; //半径
		double capHeight = (2 * S2.M_PI) * (radius / 40075017);
		S2LatLng s2LatLng= S2LatLng.fromDegrees(55.8271, 137.8347);
		S2Cap cap = S2Cap.fromAxisHeight(s2LatLng.toPoint(),capHeight * capHeight / 2);
		
		
		//判断点是否在任意形状内
		S2LatLng point = S2LatLng.fromDegrees(1.8293, 80.004); //点
		boolean contains = rect.contains(point.toPoint()); //点是否在形状内
		System.out.println(contains);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
