package kr.co.hta.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class BookController {

	
	@RequestMapping("/product/list.do")
	public String list() {
		
		return "product/list";
	}
}
