package org.noodle.persistence;

import org.noodle.domain.NoodleVO;

public interface NutritionDAO {

	
	public void create(NoodleVO vo)throws Exception;
	public NoodleVO read(String name)throws Exception;
	public void update(NoodleVO vo)throws Exception;
	public void delete(String name)throws Exception;
}
