package com.salesmanager.admin.controller.login;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.salesmanager.admin.model.user.LogonUser;

@Controller
public class LoginController {
	
	
	@Inject
	private AuthenticationManager authenticationManager;
	
	@RequestMapping("/login")
	public String display(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "login/login";
	}
	
	@RequestMapping(value="/login/process", method = RequestMethod.POST)
	public ResponseEntity<String> login(@Valid @RequestBody LogonUser user, BindingResult bindingResult, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//http://www.springboottutorial.com/spring-boot-validation-for-rest-services
		//http://blog.codeleak.pl/2013/09/request-body-validation-in-spring-mvc-3.2.html
		
		//return "login/login";
		//retrun RESTEntity
		
		//authenticationManager.authenticate(auth)
		
	       if (bindingResult.hasErrors()) {
	            System.out.println("Has error");
	        }
		
		return null;
	}

}