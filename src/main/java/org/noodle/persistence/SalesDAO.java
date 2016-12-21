package org.noodle.persistence;

import java.util.List;

import org.noodle.domain.NoodleVO;
import org.noodle.domain.SearchCriteria;

public interface SalesDAO {

	public void create(NoodleVO vo)throws Exception;
	public NoodleVO read(String name)throws Exception;
	public void update(NoodleVO vo)throws Exception;
	public void delete(String name)throws Exception;
	public List<NoodleVO> listAll()throws Exception;
	public List<NoodleVO> listSearch(SearchCriteria cri)throws Exception;
}