package com.rabbiter.pet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rabbiter.pet.entity.ArticleKp;
import com.rabbiter.pet.mapper.ArticleKpMapper;
import com.rabbiter.pet.service.IArticleKpService;
import org.springframework.stereotype.Service;


@Service
public class ArticleKpServiceImpl extends ServiceImpl<ArticleKpMapper, ArticleKp> implements IArticleKpService {

}
