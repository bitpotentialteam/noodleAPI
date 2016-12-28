package org.noodle.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.noodle.domain.RankVO;
import org.noodle.service.RankServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/noodles/*")
public class RankController {

	private static final Logger logger = LoggerFactory.getLogger(RankController.class);
	
	@Inject
	private RankServiceImpl rank;
	
	@GetMapping("/rank")
	public List<RankVO> getRank()throws Exception{
		
		logger.info("rank called...");
		
		List<RankVO> list = new ArrayList<RankVO>();
	
		list = rank.rankAll();
		
		return list;
	} 
	
	@GetMapping("/rank/{year}")
	public List<RankVO> getReadRank(@PathVariable("year") int year)throws Exception{
		
		logger.info("rank/year called..." + year);
		
		List<RankVO> list = new ArrayList<RankVO>();
	
		list = rank.yearRank(year);
		
		return list;
	}
	
}
