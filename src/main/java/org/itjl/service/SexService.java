package org.itjl.service;

import org.itjl.mapper.SexMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SexService {
	@Autowired
	SexMapper sexMapper;
	
	public void selectid(int id) {
		org.itjl.model.Sex sex = sexMapper.selectByPrimaryKey(id);
		System.out.println(sex.getSex_name());
	}
}
