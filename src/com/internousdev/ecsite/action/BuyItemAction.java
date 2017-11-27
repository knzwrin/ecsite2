package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware{

	private int count;
	private String pay;
	public Map<String,Object> session;
//	private ItemDetailSearchDTO itemDetailSearchDTO = new ItemDetailSearchDTO();
//	private BuyItemDTO buyItemDTO = new BuyItemDTO();
//	private CartInDAO cartInDAO = new CartInDAO();

	public String execute() throws SQLException{
		String result = ERROR;
		session.put("count", count);
		int intCount = Integer.parseInt(session.get("count").toString());
		int intPrice = Integer.parseInt(session.get("itemPrice").toString());
//		String totalPrice =String.valueOf(count*intPrice);
		session.put("totalPrice", intCount*intPrice);

		String payment;
		if(pay.equals("1")) {
			payment = "代金引換";
			session.put("pay", payment);
		} else if(pay.equals("2")){
			payment = "クレジットカード";
			session.put("pay", payment);
		}else if(pay.equals("3")){
			payment = "コンビニ・郵便局受け取り";
			session.put("pay", payment);
		}
		if(session.containsKey("userId")){
			result = SUCCESS;
			return result;
		}
//		/*カートデータベースに情報を入れる*/
//		if(session.containsValue("userName")){//////////////////////// 要検討 ///////////////////////////////////
//				result = SUCCESS;
//				cartInDAO.cartInInfo(
//						session.get("userName").toString(),
//						itemDetailSearchDTO.getItemName(),
//						session.get("total_price").toString(),
//						session.get("count").toString(),
//						session.get("pay").toString()
//						);
//				//cartListDTOのarrayListを持ってくる
//				return result;
//		}else{
//			cartInDAO.cartInInfo(
//					session.get("preId").toString(),
//					itemDetailSearchDTO.getItemName(),
//					session.get("total_price").toString(),
//					session.get("count").toString(),
//					session.get("pay").toString()
//					);
//		}
		return result;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
