package com.olle.dao.etc;

import java.util.List;

import com.olle.dto.etc.ImgDto;

public interface ImgDao {
	String NAMESPACE = "img.";
	
	//이미지 최대 PK값 가져오기
	int selectMaxPK();
	//group num 최댓값 가져오기
	int selectMaxGroupId(int boardNum);
	
	int saveStoreImg(ImgDto dto);
	
	List<ImgDto> getStoreImg(int startIdx, int endIdx);
	//구분에 따른 이미지 리스트 가져오기
	List<ImgDto> getStoreImgByGubun(String gubun,int startIdx,int endIdx);
	//검색조건에 따른 이미지 리스트 가져오기
	List<ImgDto> getStoreImgByKeyword(String keyword,int startIdx,int endIdx);
	//제주상황 상세보기 이미지
	ImgDto getDetailImage(int situ_num);
	
	//나만의 일정 이미지 저장
	public int cusInsert(ImgDto dto);
	public List<ImgDto> selectList(int board_num);
	
	//나만의 일정 상세보기 이미지 가져오기
	public List<ImgDto> selectDetailList(int plan_num);
	public int delete(int plan_num);
}
