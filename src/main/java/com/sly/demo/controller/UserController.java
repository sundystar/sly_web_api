package com.sly.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sly.demo.model.APIResult;
import com.sly.demo.model.BaseController;
import com.sly.facade.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController  extends BaseController{

	@Autowired
	UserService  userService;
	
	@RequestMapping(value="/t/{cityCode}",method=RequestMethod.GET)
	@ResponseBody
	public APIResult test(@PathVariable String cityCode){
		
		initParams();		
		this.apiRequest.put("cityCode", cityCode);
				
		return userService.getUserList(apiRequest);
		
	}
	
	@RequestMapping(value="/t/{cityCode}",method=RequestMethod.PUT)
	@ResponseBody
	public APIResult testput(@PathVariable String cityCode){
		
		initParams();		
		this.apiRequest.put("cityCode", cityCode);
		return userService.PUT(apiRequest);
		
	}
	@RequestMapping(value="/t/{cityCode}",method=RequestMethod.POST)
	@ResponseBody
	public APIResult POST(@PathVariable String cityCode){
		
		initParams();		
		this.apiRequest.put("cityCode", cityCode);
		return userService.POST(apiRequest);
		
	}
	
	@RequestMapping(value="/t/{cityCode}",method=RequestMethod.DELETE)
	@ResponseBody
	public APIResult del(@PathVariable String cityCode){
		
		initParams();		
		this.apiRequest.put("cityCode", cityCode);
		return userService.del(apiRequest);
		
	}
		
}
