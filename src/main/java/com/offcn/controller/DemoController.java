package com.offcn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.offcn.service.DemoService;

/**
  *@date 2018��7��11�� ����7:49:01
  *
 */
@Controller
public class DemoController {
	@Autowired
	private DemoService  demoService;
	@RequestMapping("demo.action")
	public void demo(){
		demoService.demo();
	}
}
