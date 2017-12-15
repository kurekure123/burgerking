package com.kiosk.burgerking.storecontroller;

import javax.swing.JOptionPane;

import com.kiosk.burgerking.constants_pool.Value;
import com.kiosk.burgerking.storeservice.StoreService;
import com.kiosk.burgerking.storeserviceimpl.StoreServiceImpl;

public class StoreController {
	public static void main(String[] args) {
		StoreService service = new StoreServiceImpl();
		while(true) {
			switch(Integer.parseInt(JOptionPane.showInputDialog(Value.MENU))) {
			case 0 : 
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case 1 :
				String[] dummy = {
						"햄버거/5500",
						"콜라/1000",
						"감자튀김/1000",
						"커피/900"
				}; // 키값 = 메뉴 , 밸뤼는 금액
				service.readyMenu(dummy);
				JOptionPane.showMessageDialog(null, dummy);
				break;
			case 2 :
				boolean res = true;
				String a = "";
				while(res) {
					switch(JOptionPane.showInputDialog("0. 주문 완료, 1. 주문 (계속)")) {
					case "0" : 
						JOptionPane.showMessageDialog(null, "주문이 완료 되었습니다." + "금액");
						res = false;
						break;
					case "1" :
						a += JOptionPane.showInputDialog("주문제품/수량");
						break;
					}
				} 
				service.testOrder(a);
				
				/* String a = JOptionPane.showInputDialog("주문제품/수량");
				String b = service.order(a);
				System.out.println(b); * */
				// JoptionPane.showMessageDialog(null, b);
				/* String[] order = {
					JOptionPane.showInputDialog("메뉴/수량")
				};
				service.orderMenu(order); **/
				break;
			case 3 :
				break;
			default :
				break;
			}
		}
	}
}
