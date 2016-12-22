package org.noodle.service;

import java.util.List;

import javax.inject.Inject;

import org.noodle.domain.NoodleVO;
import org.noodle.domain.Criteria;
import org.noodle.persistence.NoodleDAO;
import org.springframework.stereotype.Service;

@Service
public class RankSerivceImpl implements RankService {

	@Inject
	private NoodleDAO dao;
	
	
	@Override
	public void regist(NoodleVO vo) throws Exception {

		dao.create(vo);
	}

	@Override
	public NoodleVO read(String name) throws Exception {

		return dao.read(name);
	}

	@Override
	public void modify(NoodleVO vo) throws Exception {

		dao.update(vo);
	}

	@Override
	public void remove(String name) throws Exception {

		dao.delete(name);
	}

	@Override
	public List<NoodleVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public List<NoodleVO> listSearch(Criteria cri) throws Exception {

		return dao.listSearch(cri);
	}

}
