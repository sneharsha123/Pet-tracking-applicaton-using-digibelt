package com.xvitcoder.dogtracer.service;
import org.springframework.stereotype.Service;

import com.xvitcoder.dogtracer.beans.Info;


import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Queue;

@Service("InfoService")
public class InfoServiceImpl implements InfoService {
	Queue<Info> val = new LinkedList(); 

	@Override
	public void addValue(Info Info) {

		val.add(Info);
	}
	@Override
	public Queue<Info> getAllValues() {
		return val;
	}


}
