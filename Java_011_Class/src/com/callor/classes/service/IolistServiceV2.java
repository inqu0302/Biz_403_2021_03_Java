package com.callor.classes.service;

import com.callor.classes.model.IolistVO;

public class IolistServiceV2 extends iolistServiceV1{

	/*
	 * V1의 input method를 재 정의한다
	 * 매입단가, 매출단가는 반드시 0이상이어야 한다.
	 * 유효성검사를 하도록 코드를 재 정의 한다.
	 */
	@Override
	public void input() {
		// TODO 매입매출 등록
		// 매입단가,매출단가 0 미만 입력시 오류메시지 출력
		// 유효성 검사 추가
				
		System.out.println("============================");
		System.out.println("매입 매출 등록");
		System.out.println("----------------------------");
		System.out.print("상품명 >> ");
		String pname = scan.next();
		
		System.out.print("거래일자(yyyy-mm-dd) >> ");
		String date = scan.next();
		
		System.out.print("거래처명 >> ");
		String dname = scan.next();
		
		System.out.print("매입매출 구분 >> ");
		String inout = scan.next();
		
		System.out.print("수량 >> ");
		Integer qty = scan.nextInt();
		
		// 매입단가와 매출단가는 0 이상만 입력한다.
		// 매입단가가 0 이상이면 다음 항목을 입력받도록
		// while()문을 중단하고 매입단가가 0 미만이면
		// 계속해서 반복문내에서 입력을 받도록
		
		Integer iprice = 0;
		while(true) {
			System.out.print("매입단가 >> ");
			iprice = scan.nextInt();
			
			if(iprice < 0) {
				System.out.println("금액을 확인후 다시입력해주세요");
				continue;
			}
			break;
			
		}
		
		Integer oprice = 0;
		while(true) {
			System.out.print("매출단가 >> ");
			oprice = scan.nextInt();
			
			if(oprice < 0) {
				System.out.println("금액을 확인후 다시입력해주세요");
				continue;
			}
			break;
			
		}
		
		IolistVO iolistVO = new IolistVO();
		iolistVO.setPname(pname);
		iolistVO.setDate(date);
		iolistVO.setDname(dname);
		iolistVO.setInout(inout);
		iolistVO.setIprice(iprice);
		iolistVO.setOprice(oprice);
		iolistVO.setQty(qty);
		
		iolist.add(iolistVO);
	}
	
	

}
