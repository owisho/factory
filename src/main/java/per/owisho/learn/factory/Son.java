package per.owisho.learn.factory;

import per.owisho.learn.model.Out;

public class Son extends Out{

	public static void main(String[] args) {
		
		//create an Son's object ,when extends Out 
		Out son = new Son();
		//create a protected inner Object by 'new'
		//Out.ProtectedIn protectedIn = son.new ProtectedIn();
		//->error: The constructor Out.ProtectedIn() is not visible
		
		//create a protected inner object by out's method
		Out.ProtectedIn protectedIn = son.getProtectedIn();
		//->error: The field Out.ProtectedIn.protected_arg is not visible
		//protectedIn.protected_arg = 0;
		protectedIn.public_arg = 0;
		protectedIn.public_method();
		
	}
	
}