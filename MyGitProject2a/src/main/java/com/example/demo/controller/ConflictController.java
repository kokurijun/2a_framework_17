package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ConflictController {

	//4
	//5
	//6
	//7
	//8
	//9
	@RequestMapping(path = "/gititemlist2", method = RequestMethod.GET)
	public String eidht(Model model) {

		return "gititemlist2";
	}

}
