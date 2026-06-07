package com.rabbiter.pet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rabbiter.pet.entity.Salvation;
import com.rabbiter.pet.mapper.SalvationMapper;
import com.rabbiter.pet.service.ISalvationService;
import org.springframework.stereotype.Service;

@Service
public class SalvationServiceImpl extends ServiceImpl<SalvationMapper, Salvation> implements ISalvationService {

}
