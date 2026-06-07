package com.rabbiter.pet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rabbiter.pet.entity.Feed;
import com.rabbiter.pet.mapper.FeedMapper;
import com.rabbiter.pet.service.IFeedService;
import org.springframework.stereotype.Service;


@Service
public class FeedServiceImpl extends ServiceImpl<FeedMapper, Feed> implements IFeedService {

}
