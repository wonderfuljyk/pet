package com.rabbiter.pet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rabbiter.pet.entity.Applcation;
import com.rabbiter.pet.mapper.ApplcationMapper;
import com.rabbiter.pet.service.IApplcationService;
import org.springframework.stereotype.Service;


@Service
public class ApplcationServiceImpl extends ServiceImpl<ApplcationMapper, Applcation> implements IApplcationService {

}
