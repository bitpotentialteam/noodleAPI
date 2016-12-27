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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/noodles/*")
public class NoodleController {
	
	private static final Logger logger = LoggerFactory.getLogger(NoodleController.class);
	
	@Inject
	private NoodleServiceImpl noodle;
	
	@GetMapping("")
	public List<NoodleVO> NoodlesAll() throws Exception{
		
		logger.info("noodle all called...");
		
		List<NoodleVO> list = new ArrayList<NoodleVO>();
		Criteria cri = new Criteria();
		list = noodle.search(cri);
		return list;
	}
	
	@GetMapping("/{name}")
	public NoodleVO getNoodleInfo(@PathVariable("name") String name)throws Exception{
		
		logger.info("noodle info called..." + name);
		
		NoodleVO vo = new NoodleVO();
		vo = noodle.read(name);	
	
		return vo;
	}
	
	@GetMapping("/brands/{brand}")
	public List<NoodleVO> getBrandInfo(@PathVariable("brand") String brand)throws Exception{
		
		logger.info("brand called..." + brand);
		
		List<NoodleVO> list = new ArrayList<NoodleVO>();
		list = noodle.readBrand(brand);	
	
		return list;
	}       
	 
	
	@GetMapping("/search")
	public List<NoodleVO> search(@ModelAttribute("cri") Criteria cri)throws Exception{
	
		logger.info("search called..." + cri.toString());
		
		List<NoodleVO> list = new ArrayList<NoodleVO>();
		
		list = noodle.search(cri);
		
		return list; 
	}
	
	
	
	
}
