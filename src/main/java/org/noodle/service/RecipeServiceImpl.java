package org.noodle.service;

import java.util.List;

import javax.inject.Inject;

import org.noodle.domain.Criteria;
import org.noodle.domain.RecipeVO;
import org.noodle.persistence.RecipeDAO;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {

	@Inject
	private RecipeDAO dao;
	
	
	@Override
	public void regist(RecipeVO vo) throws Exception {

		dao.create(vo);
		
	}

	@Override
	public RecipeVO read(String name) throws Exception {

		return dao.read(name);
	}

	@Override
	public void modify(RecipeVO vo) throws Exception {

		dao.update(vo);
	}

	@Override
	public void remove(String name) throws Exception {

		dao.delete(name);
	}

	@Override
	public List<RecipeVO> listAll() throws Exception {

		return dao.listAll();
	}

	@Override
	public List<RecipeVO> listSearch(Criteria cri) throws Exception {

		return dao.listSearch(cri);
	}

}
