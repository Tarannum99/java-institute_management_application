package com.aloofly.ima.service;

import java.util.ArrayList;

import com.aloofly.ima.model.Batch;

public interface IBatchService extends IBaseService<Batch> {
	void displayBatch(Batch batch);
	void displayAllBatch(ArrayList<Batch> allBatch);

}
