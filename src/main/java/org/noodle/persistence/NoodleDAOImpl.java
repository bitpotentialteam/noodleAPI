package org.noodle.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.noodle.domain.NoodleVO;
import org.noodle.domain.Criteria;
import org.springframework.stereotype.Repository;

@Repository
public class NoodleDAOImpl implements NoodleDAO {

	@Inject
	private SqlSession session;
	
	private static final String namespace =  "org.noodle.mapper.NoodleMapper";
	
	@Override
	public void create(NoodleVO vo) throws Exception {
		
		session.insert(namespace+".create",vo);
		
	}

	@Override
	public NoodleVO read(String name) throws Exception {

		return session.selectOne(namespace+".read",name);
	}

	@Override
	public void update(NoodleVO vo) throws Exception {

		session.update(namespace+".update",vo);
	}

	@Override
	public void delete(String name) throws Exception {

		session.delete(namespace+".delete",name);
	}

	@Override
	public List<NoodleVO> listAll() throws Exception {

		return session.selectList(namespace+".listAll");
	}

	@Override
	public List<NoodleVO> listSearch(Criteria cri) throws Exception {

		return session.selectList(namespace+".listSearch",cri);
	}

	@Override
	public List<NoodleVO> brandFilter(Criteria cri) throws Exception {

		return session.selectList(namespace+".brandFilter",cri);
	}

	@Override
	public List<NoodleVO> kindFilter(Criteria cri) throws Exception {

		return session.selectList(namespace+".kindFilter",cri);
	}

	@Override
	public List<NoodleVO> noodleTypeFilter(Criteria cri) throws Exception {

		return session.selectList(namespace+".noodleTypeFilter",cri);
	}

	@Override
	public List<NoodleVO> orderType(Criteria cri) throws Exception {

		return session.selectList(namespace+".orderType",cri);
	}

}