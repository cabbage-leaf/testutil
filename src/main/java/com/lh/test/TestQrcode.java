package com.lh.test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;

import javax.imageio.ImageIO;

import com.google.zxing.Binarizer;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;


public class TestQrcode {
	
	public static void main(String[] args) {
	    BufferedImage image = null;
	    Result result = null;
	    String barcodePath = "D://qrcode2.jpg"; //图片地址
	    try {
        	image = ImageIO.read(new File(barcodePath));
        	if (image != null) {
        		LuminanceSource source = new BufferedImageLuminanceSource(image);
        		Binarizer binarizer = new HybridBinarizer(source);
        		BinaryBitmap bitmap = new BinaryBitmap(binarizer);
        		HashMap<DecodeHintType, Object> decodeHints = new HashMap<DecodeHintType, Object>();
        		decodeHints.put(DecodeHintType.CHARACTER_SET, "UTF-8");
        		System.out.println(bitmap.getWidth() + " "+bitmap.getHeight());
        		result = new MultiFormatReader().decode(bitmap, decodeHints);
        		if (null != result){
        			ResultPoint[] points = result.getResultPoints();
        			System.out.println(points.length);
        			System.out.println(points[0]);//取bottomleft位置
        			System.out.println(points[1]);//取topleft位置
        			System.out.println(points[2]);//取topright位置
        		}
    		} else {
    			System.out.println("the decode image may be not exit.");
    		}
       } catch (Exception e) {
          e.printStackTrace();
       }
	    
	}
	
	//-----------
	//local
	
}
