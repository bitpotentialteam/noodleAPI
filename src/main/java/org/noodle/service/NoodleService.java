package org.noodle.service;

import java.util.List;

import org.noodle.domain.NoodleVO;
import org.noodle.domain.Criteria;

public interface NoodleService {

	public void regist(NoodleVO vo)throws Exception;
	public NoodleVO read(String name)throws Exception;
	public void modify(NoodleVO vo)throws Exception;
	public void remove(String name)throws Exception;
	public List<NoodleVO> listAll()throws Exception;
	public List<NoodleVO> listSearch(Criteria cri)throws Exception;
	
	public List<NoodleVO> brandFilter(Criteria cri)throws Exception;
	public List<NoodleVO> kindFilter(Criteria cri)throws Exception;
	public List<NoodleVO> noodleTypeFilter(Criteria cri)throws Exception;
	public List<NoodleVO> orderType(Criteria cri)throws Exception;
	
}
