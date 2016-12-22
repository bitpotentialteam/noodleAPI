package org.noodle.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.noodle.domain.Criteria;
import org.noodle.domain.NoodleVO;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAO {

	@Inject
	SqlSession session;
	
	public List<NoodleVO> orderTest(Criteria cri) throws Exception {

		return session.selectList("org.noodle.mapper.TestMapper"+".test",cri);
	}
}
