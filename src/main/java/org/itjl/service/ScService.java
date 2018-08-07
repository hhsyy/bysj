package org.itjl.service;

import java.util.List;

import org.itjl.mapper.ScMapper;
import org.itjl.model.Sc;
import org.itjl.model.ScCriteria;
import org.itjl.model.ScCriteria.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScService {
	@Autowired
	private ScMapper scmapper;
	
	public int scisok(int id) {
		int count=0;
		String name=Integer.toString(id); 
		ScCriteria example = new ScCriteria();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andSc_lbEqualTo(2);
		createCriteria.andSc_nrEqualTo(name);
		List<Sc> selectByExample = scmapper.selectByExample(example );
		
		if(selectByExample==null) {
			count=0;
		}else {
			for (Sc sc : selectByExample) {
				count+=1;
			}
		}
		return count;
		
	}
}
