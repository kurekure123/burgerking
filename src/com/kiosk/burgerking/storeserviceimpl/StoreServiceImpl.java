package com.kiosk.burgerking.storeserviceimpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.kiosk.burgerking.storebeam.StoreBean;
import com.kiosk.burgerking.storeservice.StoreService;

public class StoreServiceImpl implements StoreService{
	private Map<String, String> menuMap;
	private Map<String, String> orderMap;
	private StoreBean bean;
	
	public StoreServiceImpl(){
		menuMap = new HashMap<String, String>();
		orderMap = new HashMap<String, String>();
		bean = new StoreBean();
	}

	@Override
	public void readyMenu(String[] dummy) {
		for(String s : dummy) {
			String[] arr = s.split("/");
			menuMap.put(arr[0], arr[1]);
		}
		// : = in 이다
		// String s 는 dummy 의 한줄이다.
	}

	/* @Override
	public String order(String a) {
		String[] arr = a.split("/");
		String item = arr[0]; 
		String count = arr[1];
		Set<String> keys = menuMap.keySet();
		String price = "";
		for(String key : keys) {
			if(item.equals(key)) {
				price = menuMap.get(key);
				}
			// System.out.println("키값 : " + key);
			}
		int pay = Integer.parseInt(price) 
					* Integer.parseInt(count);
			
		return "결제금액" + pay;
	} **/

	@Override
	public void testOrder(String a) {
		String[] arr = a.split("/");
		System.out.println(arr[0] + arr[1]);
	}

/*public void orderMenu(String[] orders) {
		
	} **/

}
