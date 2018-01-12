package com.myerp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myerp.form.LoginForm;
import com.myerp.service.LoginService;

@Controller
@RequestMapping("/")
public class LoginAction extends BaseAction {
	private static Log log = LogFactory.getLog(LoginAction.class);
	
	@Autowired
	LoginService loginService;
	
    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String showLoginPage(@ModelAttribute("LoginForm") LoginForm form, HttpServletRequest request, HttpServletResponse response) {
    	System.out.println("oh ya~~~");
    	
        return "index";
    }

    @RequestMapping(value = { "/login" }, method = RequestMethod.POST)
	public String doLogin(@ModelAttribute("LoginForm") LoginForm form, HttpServletRequest request, HttpServletResponse response) {
		try {
			System.out.println(request.getRemoteAddr());
			System.out.println(form.getAccount());
			System.out.println(form.getPassword());
			
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error(e.toString(), e);
			}
		}
		
		return "mainPage";
	}
}