package per.owisho.learn.model;

/**
 * ->error: No enclosing instance of type Out is available due to some intermediate constructor invocation
 * 没有封闭的实例类型可用由于一些中间构造函数调用
 * @author Administrator
 *
 */
/*public class Son extends Out.ProtectedIn{
	
}
*/

/**
 * ->error: No enclosing instance of type Out is available due to some intermediate constructor invocation
 * 没有封闭的实例类型可用由于一些中间构造函数调用
 * @author Administrator
 *
 */
/*public class Son extends Out.PublicIn{
	
}*/

public class Son extends Out{
	
	public static void main(String[] args) {
		Out.ProtectedIn protectedIn = new Out().getProtectedIn();
		protectedIn.default_arg = 0;
		protectedIn.protected_arg = 0;
		protectedIn.public_arg = 0;
		protectedIn.default_method();
		protectedIn.protected_method();
		protectedIn.public_method();
	}
	
}