package com.corejava.overlaoding;


public class OverLoading {
	   public void methodA(int x){
	        System.out.println(x);
	       
	    }
	    public void methodA(String str){
	        System.out.println(str);
	    }
	    public static void main(String a[])
	    {
	        OverLoading loading= new OverLoading();
	        loading.methodA(4);
	        loading.methodA("hello");
	    }
}
