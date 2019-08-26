package com.lh.test;

import java.math.BigDecimal;

public class Test5 {

	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("1.00");
		BigDecimal b = new BigDecimal(1);
		
		System.out.println(a.equals(b));
		System.out.println(a.compareTo(b)==0);
		
		/**
		 * ****可以看出，double类型的数，在new bigdemical（）和Bigdemical.valueof()求出的结果是不一样的，
		 * 因为new bigdemical（）内部是利用的double的构造方法，而这个构造方法jdk的描述是，其结果具有一定的不可预料性，很难对小数做出精确的描述；
		 * 所以，在我们利用bigdemical的时候应尽量将参数变为字符串再进行计算；
		 * 否则，针对double类型的小数就要用Bigdemical.valueOf(double d)了；
		 */
		BigDecimal bigDecimal = new BigDecimal("4.44");
	    BigDecimal decimal = new BigDecimal(4.44);
	    BigDecimal valueOf = BigDecimal.valueOf(4.44);
	    BigDecimal bigDecimal2 = new BigDecimal(999999999999L);
	    BigDecimal valueOf2 = BigDecimal.valueOf(999999999999L);
	    System.err.println("bigDecimal="+bigDecimal);
	    System.err.println("decimal="+decimal);
	    System.err.println("valueOf="+valueOf);    
	    System.err.println("bigDecimal2="+bigDecimal2);
	    System.err.println("valueOf2="+valueOf2);
	    
	    
	}


}
