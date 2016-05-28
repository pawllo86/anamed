package anamed.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import anamed.controller.BaseController;
import anamed.entity.Client;
import anamed.service.IClientService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

	@Autowired
	private IClientService clientService;

	@RequestMapping(method = RequestMethod.POST)
	public void save(@RequestParam String name, @RequestParam String surname) {
		logCalledMethod();

		Client client = new Client();
		client.setName(name);
		client.setSurname(surname);

		clientService.save(client);
	}

}
