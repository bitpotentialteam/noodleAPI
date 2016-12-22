package org.noodle.persistence;

import java.util.List;

import org.noodle.domain.RankVO;
import org.noodle.domain.Criteria;

public interface RankDAO {

	public void create(RankVO vo)throws Exception;
	public RankVO read(String name)throws Exception;
	public void update(RankVO vo)throws Exception;
	public void delete(String name)throws Exception;
	public List<RankVO> listAll()throws Exception;
	public List<RankVO> listSearch(Criteria cri)throws Exception;
}
