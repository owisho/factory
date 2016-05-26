package per.owisho.learn.model;

/**
 * 探究内部类的访问性
 * @author Administrator
 *
 */
public class Out {

	public PrivateIn getPrivateIn() {
		return new PrivateIn();
	}

	public DefaultIn getDefaultIn(){
		return new DefaultIn();
	}
	
	public ProtectedIn getProtectedIn(){
		return new ProtectedIn();
	}
	
	public PublicIn getPublicIn(){
		return new PublicIn();
	}
	
	private class PrivateIn implements InMethod {

		private int private_arg;

		int default_arg;

		protected int protected_arg;

		public int public_arg;

		private void private_method() {
		}

		void default_method() {
		}

		protected void protected_method() {
		}

		public void public_method() {
			
			System.out.println("PrivateIn.public_method()");
			
		}

	}

	class DefaultIn implements InMethod {

		private int private_arg;

		int default_arg;

		protected int protected_arg;

		public int public_arg;

		private void private_method() {
		}

		void default_method() {
		}

		protected void protected_method() {
		}

		public void public_method() {
		}

	}

	protected class ProtectedIn implements InMethod {
		
		private int private_arg;

		int default_arg;

		protected int protected_arg;

		public int public_arg;

		private void private_method() {
		}

		void default_method() {
		}

		protected void protected_method() {
		}

		public void public_method() {
		}
		
	}

	public class PublicIn implements InMethod {
		
		private int private_arg;

		int default_arg;

		protected int protected_arg;

		public int public_arg;

		private void private_method() {
		}

		void default_method() {
		}

		protected void protected_method() {
		}

		public void public_method() {
		}
		
	}
	
	public static void main(String[] args) {
		
		Out out = new Out();
		
		Out.PrivateIn privateIn1 = out.new PrivateIn();
		privateIn1.private_arg = 0;
		privateIn1.private_method();
		
		Out.PrivateIn privateIn2 = out.getPrivateIn();
		privateIn2.private_arg = 0;
		privateIn2.private_method();
		
	}
	
}
