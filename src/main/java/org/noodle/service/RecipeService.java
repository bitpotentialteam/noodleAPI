package org.noodle.service;

import java.util.List;

import org.noodle.domain.Criteria;
import org.noodle.domain.RecipeVO;

public interface RecipeService {

	public void regist(RecipeVO vo)throws Exception;
	public RecipeVO read(String name)throws Exception;
	public void modify(RecipeVO vo)throws Exception;
	public void remove(String name)throws Exception;
	public List<RecipeVO> listAll()throws Exception;
	public List<RecipeVO> listSearch(Criteria cri)throws Exception;
}
