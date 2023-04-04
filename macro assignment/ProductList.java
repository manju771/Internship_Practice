import java.util.*;
class Product{
String productName;
String id;
Double price;
Product(String ProductName,String Id,double price){
  this.productName=productName;
  this.id=id;
  this.price=price;
}
  String productName(){
    return productName;
  }
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
} 
}
class Productlist{
  ArrayList<Product>products=new ArrayList<Product>();
  
  void addProduct(Product product)
  {
    products.add(product);
  }
  void removeProduct(Product product){
  if(products.contains(product)){
  products.remove(product);
  System.out.println("Product found and removed");
  }
else
{
  System.out.println("product not found");
   }
  }
  void display(){
    for(Product product:products){
    System.out.println(product.getProductName()+product.getPrice());
    }
  }
}
class Productmain{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Productlist p=new Productlist();
    for(int i=0;i<5;i++){
      System.out.println("Enter product"+(i+1)+"details");
    p.addProduct(new Product(sc.next(),sc.next(),sc.nextDouble()));
  }
    p.display();
}
}