package controllers;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.products.list;
import java.util.List;
import java.util.ArrayList;
import views.html.products.details;
import models.Product;


public class Products extends Controller {
	private static final Form<Product> productForm = Form.form(Product.class);
	
	public static Result list() {
	List<Product> products = Product.findAll();
	return ok(list.render(products));
}
public static Result details(String ean) {
	final Product product = Product.findByEan(ean);
	if (product == null) {
	return notFound(String.format("Produto %s não existe.", ean));
	}
	Form<Product> filledForm = productForm.fill(product);
	return ok(details.render(filledForm));
	}
public static Result save() {
	Form<Product> boundForm = productForm.bindFromRequest();
	if(boundForm.hasErrors()) {
	flash("erro", "Por favor certifique-se de que o formulário foi preenchido corretamente.");
	return badRequest(details.render(boundForm));
	}
	Product product = boundForm.get();
	product.save();
	flash("success",
	String.format("Produto salvo : %s", product));
	return redirect(routes.Products.list());
		}
public static Result delete(String ean) {
	final Product product = Product.findByEan(ean);
	if(product == null) {
	return notFound(String.format("Produto não existe"));
	}
	Product.remove(product);
	return redirect(routes.Products.list());
	}

public static Result newProduct(){
	return ok(details.render(productForm));
	}

}