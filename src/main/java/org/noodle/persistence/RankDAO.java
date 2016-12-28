package org.noodle.persistence;

import java.util.List;

import org.noodle.domain.RankVO;

public interface RankDAO {

	public void create(RankVO vo)throws Exception;
	public RankVO read(String name)throws Exception;
	public void update(RankVO vo)throws Exception;
	public void delete(String name)throws Exception;
	public List<RankVO> yearRank(int year)throws Exception;
	public List<RankVO> rankAll()throws Exception;
}
