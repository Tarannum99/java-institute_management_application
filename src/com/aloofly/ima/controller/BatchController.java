package com.aloofly.ima.controller;

import com.aloofly.ima.service.IBatchService;
import com.aloofly.ima.serviceImpl.BatchServiceImpl;

import java.util.ArrayList;

import com.aloofly.ima.model.Batch;

public class BatchController {

	IBatchService batchService = new BatchServiceImpl();

	public Batch createBatch() {
		System.out.println("\n ◀◀ Welcome To Create Batch ▶▶ \n");
		return batchService.create();
	}

	public void displayBatch(Batch currentBatch) {
		System.out.println("\n ◀◀ Welcome To Display Batch ▶▶ \n ");
		batchService.displayBatch(currentBatch);
	}

	public ArrayList<Batch> createAllBatch() {
		System.out.println("\n ◀◀ Welcome To Display Batch ▶▶ \n ");
		return batchService.createAll();
	}

	public void displayAllBatch(ArrayList<Batch> allBatch) {
		System.out.println("\n ◀◀ Welcome To Display Batch ▶▶ \n");
		batchService.displayAllBatch(allBatch);

	}
}
