package ks47team01.user.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks47team01.user.mapper.PlantpickMapper;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
@Transactional
public class PlantpickMemberService {

	private static final Logger log = LoggerFactory.getLogger(PlantpickMemberService.class);
	
	private final PlantpickMapper plantpickMapper ;
	

	
	
	//로그인 히스토리 
	public Map<String, Object> getLoginHistory(int currentPage){
		//보여질 행의 갯수
		int rowPerPage = 5;
		
		//페이지 계산(시작될 행의 인덱스
		int startIndex =(currentPage-1)* rowPerPage;
		
		//마지막 페이지 계산
		//1. 보여질 테이블의 전체 행의 갯수 
		double rowsCnt = plantpickMapper.getLoginCnt();
		
		//2.마지막페이지
		int lastPage =(int) Math.ceil(rowsCnt/rowPerPage);
		
		int startPageNum= 1;
		int endPageNum = (lastPage < 10) ? lastPage:10 ;
		
		//동적페이지 구성(7페이지 부터)
		if(lastPage >10 && currentPage>6) {
			startPageNum =currentPage-5;
			endPageNum= currentPage +4;
			if(endPageNum >= lastPage) {
				startPageNum = lastPage-9;
				endPageNum= lastPage;
			}
		}
		Map<String,Object> paramMap =new HashMap<String,Object>();
		paramMap.put("startIndex", startIndex);
		paramMap.put("rowPerPage", startIndex);
		
		
		
		return paramMap;
	}
}
