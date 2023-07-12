package ks47team01.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks47team01.common.dto.UrbanKit;
import ks47team01.user.mapper.UrbanKitMapper;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class UrbanKitService {
	private final UrbanKitMapper urbanKitMapper;
	
	/**
	 * 키트 리스트
	 * @return List<UrbanKit>
	 */
	public List<UrbanKit> getUrbanKitList(){
		List<UrbanKit> urbanKitList = urbanKitMapper.getUrbanKitList();
		return urbanKitList;
	}
}
