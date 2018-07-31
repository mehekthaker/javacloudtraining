package com.collection.CarApplication;

import java.util.LinkedList;
import java.util.List;


public class ParkedCarOwnerList {
	
	List<ParkedCarOwnerDetails> detailList = new LinkedList<>();
	
	 public void addCar(ParkedCarOwnerList carList)
	  {
		 if(carList.getOwnerName() != null)
			 detailList.addCar(carList);
	  }

}
