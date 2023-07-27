package ks47team01.admin.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ks47team01.admin.mapper.AdminVmMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Transactional
@AllArgsConstructor
@Slf4j
public class AdminVendingMachineService {

	private final AdminVmMapper adminVmMapper;
}
