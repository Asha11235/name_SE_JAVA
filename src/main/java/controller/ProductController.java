package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.Products;
import repository.ProductRepository;
import service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	@Autowired
	ProductService productService;
	
	 @RequestMapping(value = "/createproduct", method = RequestMethod.GET)
	 public String createProduct(Model model) {
		 
		 Products product = new Products();
		 model.addAttribute("product", product);
		 return "/createproduct";
	 }
	 
	 @RequestMapping(value = "/processProductForm", method=RequestMethod.POST)
	 public String processForm(@ModelAttribute(value="product") Products product) {
		 
		 System.out.println(product.toString());
		 productService.save(product);
		 return "welcome";
	 }

}
