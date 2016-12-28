package org.noodle.service;

import java.util.List;

import javax.inject.Inject;

import org.noodle.domain.RankVO;
import org.noodle.persistence.RankDAO;
import org.springframework.stereotype.Service;

@Service
public class RankServiceImpl implements RankService {

	@Inject
	private RankDAO dao;
	
	@Override
	public void regist(RankVO vo) throws Exception {

		dao.create(vo);
	}

	@Override
	public RankVO read(String name) throws Exception {

		return dao.read(name);
	}

	@Override
	public void modify(RankVO vo) throws Exception {

		dao.update(vo);
	}

	@Override
	public void remove(String name) throws Exception {

		dao.delete(name);
	}


	@Override
	public List<RankVO> yearRank(int year) throws Exception {
		
		return dao.yearRank(year);
	}

	@Override
	public List<RankVO> rankAll() throws Exception {
	
		return dao.rankAll();
	}

}
