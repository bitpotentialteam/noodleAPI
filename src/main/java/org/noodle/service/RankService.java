package org.noodle.service;

import java.util.List;

import org.noodle.domain.RankVO;
import org.noodle.domain.Criteria;

public interface RankService {

	public void regist(RankVO vo)throws Exception;
	public RankVO read(String name)throws Exception;
	public void modify(RankVO vo)throws Exception;
	public void remove(String name)throws Exception;
	public List<RankVO> listAll()throws Exception;
	public List<RankVO> listSearch(Criteria cri)throws Exception;
}
