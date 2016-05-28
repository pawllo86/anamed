package anamed.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import anamed.controller.BaseController;

@Controller
public class MainController extends BaseController {

	@RequestMapping("/*")
	public String home() {
		logCalledMethod();

		return "home";
	}

}
