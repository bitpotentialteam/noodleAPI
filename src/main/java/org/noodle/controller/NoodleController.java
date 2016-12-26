package org.noodle.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.noodle.domain.Criteria;
import org.noodle.domain.NoodleVO;
import org.noodle.service.NoodleServiceImpl;
import org.noodle.service.RankServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noodles/*")
public class NoodleController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Inject
	private NoodleServiceImpl noodle;
//	
//	@Autowired
//	private RankServiceImpl rank;
	
	@GetMapping("")
	public List<NoodleVO> NoodlesAll() throws Exception{
		
		List<NoodleVO> list = new ArrayList<NoodleVO>();
		Criteria cri = new Criteria();
		list = noodle.listSearch(cri);
		return list;
	}
	
	@GetMapping("/{name}")
	public List<NoodleVO> getNoodleInfo(@PathVariable("name") String name)throws Exception{
		
		List<NoodleVO> list = new ArrayList<NoodleVO>();
		//list = noodle.	
	
		return list;
	}
	
	@GetMapping("/brands/{brand}")
	public List<NoodleVO> getBrandInfo(@PathVariable("brand") String brand)throws Exception{
		
		List<NoodleVO> list = new ArrayList<NoodleVO>();
		//list = noodle.();	
	
		return list;
	}                                                  
	
	
	
	
//	@GetMapping("/{name}")
//	public @ResponseBody List<NoodleVO> list(@ModelAttribute(name) String name , Model model )throws Exception{
//		
//		
//		return list ;
//	}
	
	
	
	
}
