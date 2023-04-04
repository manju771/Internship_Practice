//class called "Product" that represents a product. The class should have properties such as name, price, and quantity, and methods such as getName, getPrice and getQuantity. Create another class called "PointOfSale" that represents a point of sale system. The class should have a list of products, and methods such as addProduct, removeProduct, and getTotalCost.
class Product{
  private String name;
  private Double price;
  private int quantity;
  public Product(String name,Double price,int quantity){
  this.name=name;
this.price=price;
this.quantity=quantity;
}
String getName(){
  return name;
}
  double getPrice(){
    return price;
  }
  int getQuantity(){
    return quantity;
  } 
}
 class pointOfSale{
  private List<Product>Products;
   public pointOfSale(){
  Products = new ArrayList<>();
  }
  public void addProduct(){
    Products.add(Product);
  }
    public void removeProduct(){
      Products.remove(Product);
    }
   double getTotalCost(){
     double total=0;
     for(Product Product:Products){
       total=total+Product.getPrice()*Product.getQuantity();
     }
     return total;
   } 
}
public class ProductObject{
  public static void main(String args[]){
   System.out.println("total cost"+getTotalCost());
    Product p=new Product("Saheed",400.0,6);
    PointOfSale.addProduct(newProduct);
    System.out.println(getTotalCost());
    PointOfSale.removeProduct(newProduct);
    System.out.println(getTotalCost());
    System.out.println(getTotalCost());
  }
}

