package com.olle.dao.admin;

import java.util.List;

import com.olle.dto.admin.ReportDto;

public interface ReportDao {
	String NAMESPACE = "report.";
	
	public List<ReportDto> selectList();
	
	public int delete(int rep_num);
	
	public int reportInsert(ReportDto dto);
	
	public int repChk(ReportDto dto);
	
	public int maxNum();
}
