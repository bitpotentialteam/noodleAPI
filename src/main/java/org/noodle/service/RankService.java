package org.noodle.service;

import java.util.List;

import org.noodle.domain.RankVO;

public interface RankService {

	public void regist(RankVO vo)throws Exception;
	public RankVO read(String name)throws Exception;
	public void modify(RankVO vo)throws Exception;
	public void remove(String name)throws Exception;

	public List<RankVO> yearRank(int year)throws Exception;
	public List<RankVO> rankAll()throws Exception;
}
