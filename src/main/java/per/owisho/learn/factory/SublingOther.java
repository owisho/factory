package per.owisho.learn.factory;

import per.owisho.learn.model.InMethod;
import per.owisho.learn.model.Out;

/**
 * 测试不同包中的其他类的访问
 * 
 * 通过new方式和getInnerInstance()方法只能访问public内部类的public成员和public方法；
 * 如果使用接口的引用，则可以访问所有四个内部类的public方法
 * 
 * @author Administrator
 *
 */
public class SublingOther {

	public static void main(String[] args) {
		//create an outer object 
		Out out = new Out();
		
		//create a public inner object by 'new'
		Out.PublicIn publicIn = out.new PublicIn();
		publicIn.public_arg = 0;
		publicIn.public_method();
		
		//create a public inner object by out's method;
		Out.PublicIn publicIn2 = out.getPublicIn();
		publicIn2.public_arg = 0;
		publicIn.public_method();
		
		//use Interface reference
		InMethod method;
		method = out.getPrivateIn();
		method.public_method();
		method = out.getDefaultIn();
		method.public_method();
		method = out.getProtectedIn();
		method.public_method();
		method = out.getPublicIn();
		method.public_method();
		
	}
	
}
