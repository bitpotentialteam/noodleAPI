package org.noodle.controller;

import java.awt.List;
import java.util.ArrayList;

import javax.inject.Inject;

import org.noodle.domain.NoodleVO;
import org.noodle.service.NoodleServiceImpl;
import org.noodle.service.RankServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noodles/*")
public class NoodleController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Inject
	private NoodleServiceImpl noodle;
	
	@Inject
	private RankServiceImpl rank;
	
	@GetMapping("/test")
	public List<NoodleVO> test(Model model, NoodleVO vo){
		List<NoodleVO> list = new ArrayList<NoodleVO>();
		for(int i = 0; i < 10; i ++){
			
			list.add(vo);
		}
		return list;
	}
	
	
//	@GetMapping("/{name}")
//	public @ResponseBody List<NoodleVO> list(@ModelAttribute(name) String name , Model model )throws Exception{
//		
//		
//		return list ;
//	}
	
	
	
	
}
