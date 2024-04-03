
package com.aloofly.ima.serviceImpl;

import java.util.ArrayList;
import java.util.Scanner;
import com.aloofly.ima.model.Batch;
import com.aloofly.ima.service.IBatchService;

public class BatchServiceImpl implements IBatchService {

	@Override
	public Batch create() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Batch currentBatch = new Batch();
		System.out.println("Enter Batch Id");
		currentBatch.setId(scanner.nextInt());
		System.out.println("Enter Batch Name");
		currentBatch.setName(scanner.next());
		System.out.println("Enter Batch Number");
		currentBatch.setNumber(scanner.nextInt());
		return currentBatch;
	}

	@Override
	public void displayBatch(Batch batch) {
		// TODO Auto-generated method stub
		System.out.println("\t Batch Id     -: " + batch.getId());
		System.out.println("\t Batch Name   -: " + batch.getName());
		System.out.println("\t Batch Number -: " + batch.getNumber());
		System.out.println("\n");

	}

	@Override
	public ArrayList<Batch> createAll() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Batch> allBatch = new ArrayList<Batch>();
		System.out.println("⏺ How Many Batches Do You Want To Enter ❔");

		int numberOfBatch = scanner.nextInt();
		for (int j = 0; j < numberOfBatch; j++) {
			Batch currentBatch = new Batch();
			System.out.println("Enter Batch Id");
			currentBatch.setId(scanner.nextInt());
			System.out.println("Enter Batch Name");
			currentBatch.setName(scanner.next());
			System.out.println("Enter Batch Number");
			currentBatch.setNumber(scanner.nextInt());

			allBatch.add(currentBatch);

		}

		return allBatch;
	}

	@Override
	public void displayAllBatch(ArrayList<Batch> allBatch) {
		// TODO Auto-generated method stub
		for (int j = 0; j < allBatch.size(); j++) {
			Batch batch = allBatch.get(j);
			System.out.println("\t Batch Id     -: " + batch.getId());
			System.out.println("\t Batch Name   -: " + batch.getName());
			System.out.println("\t Batch Number -: " + batch.getNumber());
			System.out.println("\n");
		}

	}

}
