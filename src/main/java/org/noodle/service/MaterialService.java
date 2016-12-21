package org.noodle.service;

import org.noodle.domain.NoodleVO;

public interface MaterialService {

	public void regist(NoodleVO vo)throws Exception;
	public NoodleVO read(String name)throws Exception;
	public void modify(NoodleVO vo)throws Exception;
	public void remove(String name)throws Exception;
}
