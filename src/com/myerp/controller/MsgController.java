package com.myerp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myerp.form.LoginForm;
import com.myerp.service.MsgService;

@Controller
public class MsgController {
	private static Log log = LogFactory.getLog(MsgController.class);
	
	private MsgService msgService;
	
	@RequestMapping(value = { "/retrieve" }, method = RequestMethod.GET)
    public String retrieveAPI(@ModelAttribute("MsgForm") LoginForm form, HttpServletRequest request, HttpServletResponse response) {
    	System.out.println("oh ya~~~");
    	try {
    		msgService.findMakaIds();
    		
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	
        return "retrieve/retrieve_main";
    }
	
	@RequestMapping(value = { "/retrieve/manage" }, method = RequestMethod.GET)
    public String retrieveManage(@ModelAttribute("MsgForm") LoginForm form, HttpServletRequest request, HttpServletResponse response) {
    	System.out.println("oh ya~~~");
    	
        return "retrieve/retrieve_manage";
    }

	@Autowired
	public void setMsgService(MsgService msgService) {
		this.msgService = msgService;
	}
}
