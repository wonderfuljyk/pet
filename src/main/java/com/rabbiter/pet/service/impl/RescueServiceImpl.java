package com.rabbiter.pet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rabbiter.pet.entity.Rescue;
import com.rabbiter.pet.mapper.RescueMapper;
import com.rabbiter.pet.service.IRescueService;
import org.springframework.stereotype.Service;


@Service
public class RescueServiceImpl extends ServiceImpl<RescueMapper, Rescue> implements IRescueService {

}
