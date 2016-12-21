package org.noodle.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.noodle.domain.NoodleVO;
import org.springframework.stereotype.Repository;

@Repository
public class MaterialDAOImpl implements MaterialDAO {

	
	@Inject
	private SqlSession session;
	
	private static final String namespace = "org.noodle.mapper.MaterialMapper";
	
	
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

}
