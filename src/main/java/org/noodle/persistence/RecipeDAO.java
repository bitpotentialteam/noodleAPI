package org.noodle.persistence;

import java.util.List;

import org.noodle.domain.Criteria;
import org.noodle.domain.RecipeVO;

public interface RecipeDAO {
	
	public void create(RecipeVO vo)throws Exception;
	public RecipeVO read(String name)throws Exception;
	public void update(RecipeVO vo)throws Exception;
	public void delete(String name)throws Exception;
	public List<RecipeVO> listAll()throws Exception;
	public List<RecipeVO> listSearch(Criteria cri)throws Exception;

}
