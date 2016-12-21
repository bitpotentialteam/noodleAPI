package org.noodle.service;

import java.util.List;

import org.noodle.domain.NoodleVO;

public interface ComponentService {

	public void regist(NoodleVO vo)throws Exception;
	public NoodleVO read(String name)throws Exception;
	public void modify(NoodleVO vo)throws Exception;
	public void remove(String name)throws Exception;
	public List<NoodleVO> listAll()throws Exception;
}
