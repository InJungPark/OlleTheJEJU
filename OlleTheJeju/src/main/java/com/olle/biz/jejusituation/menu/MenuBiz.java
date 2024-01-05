package com.olle.biz.jejusituation.menu;

import java.util.List;

import com.olle.dto.jejusituation.MenuDto;

public interface MenuBiz {
	int maxMenuPerStore(int storeId);
	//int saveMenu(HashMap<String,Object> map);
	//store id 별로 메뉴 가져오기
	List<MenuDto> getMenuByStoreId(int storeId);
	//int saveMenu(List<MenuDto> list);
	//페이지에 할당될 수 있는 모든 메뉴 리스트 가져오기
	List<MenuDto> getPageMenuList(int startIdx,int page);
	//각 가게의 메뉴 가져오기
	List<MenuDto> getMenuListForOurStore(int situ_num);
}
