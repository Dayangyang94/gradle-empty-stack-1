
public class Iphone extends Mobile{
	public Iphone() {
		// TODO Auto-generated constructor stub
	}
	public Iphone(String name, String color, String brand) {
		super(name, color, brand);
		// TODO Auto-generated constructor stub
	}
	public void call(String str) {
		String item=getLimit(str,10);
		if(item!=null) {
			System.out.println("<Iphone>"+item);
		}else {
		System.out.println("<Iphone>");
		super.call(str);
		}
	}
//	public static void main(String[] args) {
//		Iphone iphone=new Iphone();
//		iphone.call("use iphone");
//	}

}
