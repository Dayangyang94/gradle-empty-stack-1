
public class Mobile {
	private String name;
	private String color; 
    private String brand;
    
    
   public Mobile() {
	   
	}
public Mobile(String name,String color,String brand) {
	   this.name=name;
	   this.color=color;
	   this.brand=brand;
   }
   public void call(String str) {
	   System.out.println("Message:"+str);
   }
   public String getLimit(String str,int limit) {
	   if(str.length()>limit) {
		   return "消息无法发送";
	   }
	   return null;
   }
   public void info() {
	   System.out.println("name: "+name+"  color: "+color+"  brand: "+brand);
   }
//   public static void main(String[] args) {
//	   Mobile mobile=new Mobile();
//	   mobile.call("where are you");
//   }
}
