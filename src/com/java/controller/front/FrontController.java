package com.java.controller.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.entity.User;
import com.java.service.impl.Userserviceimpl;

@Controller
public class FrontController {
	@Autowired
	public Userserviceimpl us;

	@RequestMapping("getuser")
	@ResponseBody
	public User getuser(Integer id) {
		User user = us.selectByPrimaryKey(id);
		return user;
	}

	@RequestMapping("geterr")
	@ResponseBody
	public String geterr(Integer id) {
		int i = 10 / 0;
		return "adad";
	}

}
