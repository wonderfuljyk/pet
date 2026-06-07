package com.rabbiter.pet.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rabbiter.pet.entity.Comment;
import com.rabbiter.pet.mapper.CommentMapper;
import com.rabbiter.pet.service.ICommentService;
import org.springframework.stereotype.Service;


@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
