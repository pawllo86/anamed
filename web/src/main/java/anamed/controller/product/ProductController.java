package anamed.controller.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import anamed.controller.BaseController;
import anamed.entity.Product;
import anamed.service.IProductService;

@Controller
@RequestMapping("/product")
public class ProductController extends BaseController {

	@Autowired
	private IProductService productService;

	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestParam String name) {
		logCalledMethod();

		Product product = new Product();
		product.setName(name);

		productService.save(product);
	}

	@ResponseBody
	@RequestMapping(value = "/all", produces = "application/json; charset=UTF-8")
	public List<Product> findAllProducts() {
		logCalledMethod();

		return productService.findAll();
	}

}
