package Pkg.Coffes;

public class CanCoffee extends Coffee{
	
	public String coffeeBrand;
	
	
	public CanCoffee() {
		super();
	}
	
	public CanCoffee(String beansKind, String beansContry){
		super(beansKind, beansContry);
	}
	
	public CanCoffee(String beansKind, String beansContry, String coffeeBrand){
		super(beansKind, beansContry);
		this.coffeeBrand = coffeeBrand;
	}
	
	public void can() {
		System.out.println("ÄµÀ» µý´Ù.");
	}
}
