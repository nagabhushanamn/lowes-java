package com.lowes.mts.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lowes.mts.service.TxrService;

@RestController
@RequestMapping("/api/txr")
public class RestTxrController {

	@Autowired
	private TxrService txrService;

	@RequestMapping(method = RequestMethod.POST)
	public TxrResponse doTxr(@RequestBody TxrRequest request) {

		System.out.println(request);

		boolean b = txrService.txr(request.getAmount(), request.getFromAccNum(), request.getToAccNum());
		TxrResponse response = new TxrResponse();
		// if (b) {
		// response.setMessage("Txr success");
		// } else {
		// response.setMessage("Txr Failed");
		// }

		response.setMessage("Txr-Success");

		System.out.println(response);

		return response;
	}

}
