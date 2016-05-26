package per.owisho.learn.factory;

public class ClassFactory {

	private String factoryname; 
	
	public static Car getCar(){
		return new ClassFactory().new Car();
	}
	
	class Car{
		
		private String name;
		
		public void drive(){
			factoryname = "aa";
		}
		
	}
	
}