package com.ss;
import java.util.*;
import java.util.stream.Collectors;  
class Product{  
    int id;  
    String name;  
    Integer price;  
    public Product(int id, String name, Integer price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}  
    
    
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000));  
        productsList.add(new Product(2,"Dell Laptop",30000));  
        productsList.add(new Product(3,"Lenevo Laptop",28000));  
        productsList.add(new Product(4,"Sony Laptop",28000));  
        productsList.add(new Product(5,"Apple Laptop",90000));  
        // This is more compact approach for filtering data  
        Integer totalPrice = productsList.stream()  
                    .map(product->product.price)  
                    .reduce(0,(sum, price)->sum+price);   // accumulating price  
        System.out.println(totalPrice);   
        // More precise code   
        Integer totalPrice2 = productsList.stream()  
                .map(product->product.price)  
                .reduce(0,Integer::sum);   // accumulating price, by referring method of Float class  
        System.out.println(totalPrice2);  
        
        Optional<String> map = productsList.stream().max(Comparator.comparing(Product::getPrice)).map(Product::getName);
        Optional<String> minn = productsList.stream().min(Comparator.comparing(Product::getPrice)).map(Product::getName);
        List<Product> productsListSort = productsList.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).collect(Collectors.toList());
        Integer sum = productsList.stream().map(Product::getPrice).reduce(0, Integer::sum);
         Integer max = productsList.stream().map(Product::getPrice).reduce(0, Integer::max);
        Long count = productsList.stream().map(Product::getPrice).collect(Collectors.counting());
        Integer doubleValue = productsList.stream().map(p -> p.getPrice() *2).reduce(0, Integer::sum);
        System.out.println("Min:: "+minn);
        System.out.println("Max:: "+max);
        System.out.println("com:: "+map.get());
        System.out.println("Sum:: "+sum);
        Map<Integer, List<String>> collect = productsList.stream().collect(Collectors.groupingBy(Product::getPrice,Collectors.mapping(Product::getName, Collectors.toList())));
        Map<Integer, Set<Product>> collects = productsList.stream().collect(Collectors.groupingBy(Product::getPrice,Collectors.toSet()));
         Map<Integer, List<Product>> collect2 = productsList.stream().collect(Collectors.groupingBy(Product::getPrice));
        System.out.println("test::"+collect);
        System.out.println(collect2);
          
    }  
}  