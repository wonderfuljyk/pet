package com.rabbiter.pet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rabbiter.pet.entity.Sterilization;
import com.rabbiter.pet.mapper.SterilizationMapper;
import com.rabbiter.pet.service.ISterilizationService;
import org.springframework.stereotype.Service;


@Service
public class SterilizationServiceImpl extends ServiceImpl<SterilizationMapper, Sterilization> implements ISterilizationService {

}
