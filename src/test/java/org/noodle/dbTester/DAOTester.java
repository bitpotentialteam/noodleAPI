package org.noodle.dbTester;

import java.util.ArrayList;
import java.util.Date;
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
		
		vo.setReleaseDate(new Date());
		vo.setWeight(123);
		vo.setSoupColor("test");
		vo.setNoodleType("test");
		vo.setKinds("test");
		vo.setCalories(111);
		vo.setCarbohydrate(111);
		vo.setProtein(111);
		vo.setFat(111);
		vo.setSaturatedFat(111);
		vo.setTransFat(111);
		vo.setCholesterol(111);
		vo.setNatrium(111);
		vo.setMaterial_noodle("test");
		vo.setMaterial_powder("test");
		vo.setThumbnail("test");
	
		
		dao.create(vo);
		System.out.println(vo.getReleaseDate());
		
	} 
	@Test
	public void readTest()throws Exception{
		dao.read("test");
		System.out.println(dao.read("test"));
	}
	@Test
	public void deleteTest()throws Exception{
		dao.delete("test");
	}
	@Test
	public void listTest()throws Exception{ 
		List<NoodleVO> listAll = dao.listAll();
		
		for (NoodleVO noodleVO : listAll) {
			System.out.println(noodleVO.getName()+":"+noodleVO.getBrand());
		}
	}
	

	
	
	@Test
	public void searchListTest()throws Exception{
		
		Criteria cri = new Criteria();
		cri.setOrderType("n");
		
		List<NoodleVO> list = dao.search(cri);
		System.out.println(list);
	} 
	
	
	@Test
	public void orderTest() throws Exception{

		Criteria cri = new Criteria();
		cri.setOrderType("rk");
		
		List<NoodleVO> list = tdao.orderTest(cri);
		System.out.println(list);
		
	}
	
	@Test
	public void brandTest()throws Exception{
		
		Criteria cri = new Criteria();
		
		String[] list1 = {"생면","건면"};
		
	
		cri.setNoodleTypeFilter(list1);
		cri.setOrderType("최신순");
		System.out.println(cri.toString());
		
		List<NoodleVO> result = dao.search(cri);
		System.out.println(result);
	}
	
	
}
