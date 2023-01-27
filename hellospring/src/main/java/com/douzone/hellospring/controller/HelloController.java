package com.douzone.hellospring.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/hello2")
	public String hello2(String name) {
		System.out.println("name:"+ name);
		return "/WEB-INF/views/hello.jsp";
	}
	
	@RequestMapping("/hello03")
	public ModelAndView hello03(String name) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name",name);
		mav.setViewName("/WEB-INF/views/hello03.jsp");
		
		return mav;
	}
	
	@RequestMapping("/hello04")
	public String hello04(String name, Model model) {
		model.addAttribute("name",name);
		return "/WEB-INF/views/hello03.jsp";
	}
	
	@ResponseBody
	@RequestMapping("/hello05")
	public String hello05() {
		return "<h1>Hello Spring<h1>";
	}
	
	@RequestMapping("/hello06")
	public String hello06() {
		return "redirect:/hello";
	}
	
	@RequestMapping("/hello07")
	public void hello07(
			HttpServletRequest request,
			HttpServletResponse response,
			Writer out) throws IOException {
		
			String name = request.getParameter("name");
			out.write("hello "+ name);
	}
}
