package com.rabbiter.pet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rabbiter.pet.entity.Donate;
import com.rabbiter.pet.mapper.DonateMapper;
import com.rabbiter.pet.service.IDonateService;
import org.springframework.stereotype.Service;


@Service
public class DonateServiceImpl extends ServiceImpl<DonateMapper, Donate> implements IDonateService {

}
