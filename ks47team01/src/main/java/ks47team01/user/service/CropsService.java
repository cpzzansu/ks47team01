package ks47team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks47team01.common.dto.CropsName;
import ks47team01.user.mapper.CropsNameMapper;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Transactional
@AllArgsConstructor
@Log4j2
public class CropsService {
	private final CropsNameMapper cropsNameMapper;
	
	/**
	 * 작물이름 리스트
	 * @return List<CropsName>
	 */
	public List<CropsName> getCropsNameList(){
		List<CropsName> cropsNameList = cropsNameMapper.getCropsNameList();
		log.info("cropsNameList : {}",cropsNameList);
		return cropsNameList;
	}
	
}
