package com.rabbiter.pet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rabbiter.pet.entity.Article;
import com.rabbiter.pet.mapper.ArticleMapper;
import com.rabbiter.pet.service.IArticleService;
import org.springframework.stereotype.Service;


@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
