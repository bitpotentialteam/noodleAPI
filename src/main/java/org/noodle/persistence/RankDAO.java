package org.noodle.persistence;

import java.util.List;

import org.noodle.domain.NoodleVO;
import org.noodle.domain.Criteria;

public interface RankDAO {

	public void create(NoodleVO vo)throws Exception;
	public NoodleVO read(String name)throws Exception;
	public void update(NoodleVO vo)throws Exception;
	public void delete(String name)throws Exception;
	public List<NoodleVO> listAll()throws Exception;
	public List<NoodleVO> listSearch(Criteria cri)throws Exception;
}
