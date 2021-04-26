package com.callor.fine;

import java.util.ArrayList;
import java.util.List;

import com.callor.fine.model.ScoreVO;

public class MainEx_06 {

	public static void main(String[] args) {
		// null 을 new ArrayList<ScoreVO>() 로 변경
		List<ScoreVO> scorelist = null;
		
		for(int i = 0 ; i < 10 ; i++) {
			// null 값을 new ScoreVO()로 변경
			ScoreVO scoreVO = null;
			scoreVO.setNum("0001");
			scoreVO.setKor(90);
		}
	}
}
