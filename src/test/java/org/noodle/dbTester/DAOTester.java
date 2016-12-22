package org.noodle.dbTester;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.noodle.domain.Criteria;
import org.noodle.domain.NoodleVO;
import org.noodle.persistence.NoodleDAO;

import org.noodle.persistence.TestDAO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class DAOTester {

	@Inject
	private NoodleDAO dao;

	@Inject
	private TestDAO tdao;
	
	@Test
	public void testCreate() throws Exception{
		
		
		NoodleVO vo = new NoodleVO();
		
		vo.setName("test");
		vo.setBrand("test");
		vo.setThumbnail("test");
		vo.setWeight(123);
		vo.setSoupColor("test");
		vo.setNoodleType("test");
		vo.setType("test");
		
		dao.create(vo);
		
	}
	

	
	
	@Test
	public void searchListTest()throws Exception{
		
		Criteria cri = new Criteria();
		cri.setOrderType("n");
		
		List<NoodleVO> list = dao.listSearch(cri);
		System.out.println(list);
	} 
	
	
	@Test
	public void orderTest() throws Exception{

		Criteria cri = new Criteria();
		cri.setOrderType("rk");
		
		List<NoodleVO> list = tdao.orderTest(cri);
		System.out.println(list);
		
	}
	
}
