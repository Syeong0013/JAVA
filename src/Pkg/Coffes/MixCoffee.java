package Pkg.Coffes;

public class MixCoffee extends Coffee{
	
	public String coffeeBrand;
	
	
	public MixCoffee() {
		super();
	}
	
	public MixCoffee(String beansKind, String beansContry){
		super(beansKind, beansContry);
	}
	
	public MixCoffee(String beansKind, String beansContry, String coffeeBrand){
		super(beansKind, beansContry);
		this.coffeeBrand = coffeeBrand;
	}
	
	public void mixing() {
		System.out.println("Ä¿ÇÇ¸¦ Åº´Ù.");
	}
}
