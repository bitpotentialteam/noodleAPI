package org.noodle.dbTester;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.noodle.domain.NoodleVO;
import org.noodle.persistence.NoodleDAO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class DAOTester {

	@Inject
	private NoodleDAO dao;
	
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
	public void testRead()throws Exception{
		
		dao.read("½Å¶ó¸é");
		
	}
	
	
}
