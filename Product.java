public class Product{
	String name;
	double price;
	int quantity;
	private static String id;
	static double maxPrice=0;
	static double minPrice=0;
	private static int count=1;
Product(String name,double price,int quantity){
	this.name=name;
	this.price=price;
	this.quantity=quantity;
	this.id=String.format("P%03d",count++);
	if(maxPrice < price){maxPrice =price;}
	if(minPrice > price){minPrice =price;}
	else if(minPrice == 0){minPrice =price;}

}
void displayInfo(){
	System.out.println("ID:"+id+count++);
	System.out.println("Name:"+name);
	System.out.println("Price:"+price);
	System.out.println("Quantity:"+quantity);
	System.out.println("Maximum Price:"+maxPrice);
	System.out.println("Minimum Price:"+minPrice);
}
}