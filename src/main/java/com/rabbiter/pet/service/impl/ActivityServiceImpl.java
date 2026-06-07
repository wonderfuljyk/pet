package com.rabbiter.pet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rabbiter.pet.entity.Activity;
import com.rabbiter.pet.mapper.ActivityMapper;
import com.rabbiter.pet.service.IActivityService;
import org.springframework.stereotype.Service;


@Service
public class ActivityServiceImpl extends ServiceImpl<ActivityMapper, Activity> implements IActivityService {

}
