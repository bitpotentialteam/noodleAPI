package org.noodle.persistence;

import java.util.List;

import org.noodle.domain.NoodleVO;
import org.noodle.domain.Criteria;

public interface NoodleDAO {

	
	public void create(NoodleVO vo)throws Exception;
	public NoodleVO read(String name)throws Exception;
	public void update(NoodleVO vo)throws Exception;
	public void delete(String name)throws Exception;
	public List<NoodleVO> listAll()throws Exception;
	public List<NoodleVO> search(Criteria cri)throws Exception;
	public List<NoodleVO> readBrand(String brand) throws Exception;
	public List<NoodleVO> rankList()throws Exception;
	public List<NoodleVO> readRank(int year) throws Exception;

	
	
}