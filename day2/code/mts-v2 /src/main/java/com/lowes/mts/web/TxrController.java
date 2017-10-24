package com.lowes.mts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lowes.mts.service.TxrService;

@Controller
@RequestMapping(value = "/txr")
public class TxrController {

	@Autowired
	private TxrService txrService;

	@RequestMapping(method = RequestMethod.GET)
	public String showTxrForm() {
		return "txr-form";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView doTxr(@RequestParam String fromAccNum, @RequestParam String toAccNum,
			@RequestParam double amount) {
		boolean b = txrService.txr(amount, fromAccNum, toAccNum);
		String status = b ? "Txr success" : "Txr Failure";
		ModelAndView mav = new ModelAndView();
		mav.addObject("status", status);
		mav.setViewName("txr-status");
		return mav;
	}
}
