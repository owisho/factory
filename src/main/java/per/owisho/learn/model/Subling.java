package per.owisho.learn.model;

/**
 * Out类的同包类
 * @author Administrator
 *
 */
public class Subling {

	public static void main(String[] args) {
		Out out = new Out();
		
		//create a private inner object by 'new'
		//Out.PrivateIn privateIn = out.new PrivateIn();
		//->error: The type Out.PrivateIn is not visible
		
		//create a default inner object by 'new'
		Out.DefaultIn defaultIn = out.new DefaultIn();
		//defaultIn.private_arg=0;->error:not visible
		defaultIn.default_arg=0;
		//defaultIn.private_method();error:The method private_method() from the type Out.DefaultIn is not visible
		defaultIn.default_method();

		//create a private inner object by out's method;
		//Out.PrivateIn privateIn = out.getPrivateIn();
		//->error:The type Out.PrivateIn is not visible
		
		//Out.PrivateIn is not visible through out.getPrivateIn() is visible
		//create a private inner object by out's method;
		//but use Interface reference to handle it
		InMethod privateIn = out.getPrivateIn();
		privateIn.public_method();
		/**
		 * 说明：Out.PrivateIn类对非父类的类来说是不可访问的，但是Out.PrivateIn类继承了InMethod接口，
		 * 如果Out类提供了可以在外部类访问的创建PrivateIn类的工厂方法，那么外部类可以通过InMethod接口调用
		 * Out.PrivateIn类中的方法
		 */
	}
	
}
