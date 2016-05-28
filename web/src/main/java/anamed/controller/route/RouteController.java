package anamed.controller.route;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import anamed.controller.BaseController;

@Controller
@RequestMapping("/routes")
public class RouteController extends BaseController {

	@RequestMapping("/main")
	public String getMainRoute() {
		logCalledMethod();

		return "templates/main/index";
	}

	@RequestMapping("/product")
	public String getProductsRoute() {
		logCalledMethod();

		return "templates/product/index";
	}

	@RequestMapping("/user")
	public String getUserRoute() {
		logCalledMethod();

		return "templates/user/index";
	}

}
