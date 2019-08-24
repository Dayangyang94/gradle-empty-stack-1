import org.omg.CORBA.PRIVATE_MEMBER;

public class Person {
	private String name;
	private Mobile mobile;
	
	
	public Person(String name, Mobile mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}


	public void call(String str) {
		mobile.call(str);
	}


	public Mobile getMobile() {
		return mobile;
		
	}


	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	

}
