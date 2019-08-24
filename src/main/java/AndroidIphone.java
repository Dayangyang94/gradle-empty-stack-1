
public class AndroidIphone extends Mobile{
	public AndroidIphone() {
		// TODO Auto-generated constructor stub
	}
	public void call(String str) {
		String item=getLimit(str,15);
		if(item!=null) {
			System.out.println("<Andriod>"+item);
		}else {
		System.out.println("<Andriod>");
		super.call(str);
		}
	}
//	public static void main(String[] args) {
//		AndroidIphone anIphone=new AndroidIphone();
//		anIphone.call("use Andriod");
//	}

}
