package com.xvitcoder.dogtracer.service;
import java.util.List;
import java.util.Queue;

import com.xvitcoder.dogtracer.beans.Info;
public interface InfoService {
	public void addValue(Info Info);
	public Queue<Info> getAllValues();
	}



