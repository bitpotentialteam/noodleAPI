package org.noodle.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.noodle.domain.Criteria;
import org.noodle.domain.RecipeVO;
import org.springframework.stereotype.Repository;

@Repository
public class RecipeDAOImpl implements RecipeDAO {

	
	@Inject
	private SqlSession session;
	
	private static final String namespace = "org.noodle.mapper.RecipeMapper";
	
	@Override
	public void create(RecipeVO vo) throws Exception {

		session.insert(namespace+".create",vo);
	}

	@Override
	public RecipeVO read(String name) throws Exception {

		return session.selectOne(namespace+".read",name);
	}

	@Override
	public void update(RecipeVO vo) throws Exception {

		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(String name) throws Exception {

		session.delete(namespace+".delete",name);
	}

	@Override
	public List<RecipeVO> listAll() throws Exception {

		return session.selectList(namespace+".listAll");
	}

	@Override
	public List<RecipeVO> listSearch(Criteria cri) throws Exception {

		return session.selectList(namespace+".listSearch",cri);
	}

}
