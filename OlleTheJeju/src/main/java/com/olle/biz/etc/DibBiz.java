package com.olle.biz.etc;

import com.olle.dto.etc.DibDto;

public interface DibBiz {
	//특정 게시물의 찜 개수
	public int countDib(int table_num);
	//찜 목록에 추가
	public int insert(DibDto dto);
	public int maxNum();
	public int dibChk(DibDto dto);
}
