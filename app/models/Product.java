package models;
import java.util.ArrayList;
import java.util.List;
import play.data.validation.Constraints;
public class Product {
	
	private static List<Product> products;
	static {
	products = new ArrayList<Product>();
	products.add(new Product("001", "Cadernos",
	"Cadernos 300 folhas"));
	products.add(new Product("002", "Canetas",
	"Canetas azuis"));
	products.add(new Product("003", "Lápis",
	"Láís 2B preto"));
	products.add(new Product("004", "Caixa de lápis de cor",
	"Caixa de lápis de cor 65 cores"));
	products.add(new Product("005", "Folhas A4",
	"Resma de folhas A4 -500 folhas"));
	}	
	
	@Constraints.Required
	public String ean;
	@Constraints.Required
	public String name;
	public String description;
public Product() {}
public Product(String ean, String name, String description) {
this.ean = ean;
this.name = name;
this.description = description;
}
public String toString() {
return String.format("%s - %s", ean, name);
}
public static List<Product> findAll() {
	return new ArrayList<Product>(products);
	}
	public static Product findByEan(String ean) {
	for (Product candidate : products) {
	if (candidate.ean.equals(ean)) {
	return candidate;
	}
	}
	return null;
	}
	public static List<Product> findByName(String term) {
	final List<Product> results = new ArrayList<Product>();
	for (Product candidate : products) {
	if (candidate.name.toLowerCase().contains(term.toLowerCase())) {
	results.add(candidate);
	}
	}
	return results;
	}
	public static boolean remove(Product product) {
	return products.remove(product);
	}
	public void save() {
	products.remove(findByEan(this.ean));
	products.add(this);
	}
	}
