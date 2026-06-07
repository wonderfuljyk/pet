package com.rabbiter.pet.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rabbiter.pet.entity.Notice;

import java.util.List;


public interface INoticeService extends IService<Notice> {

    List<Notice> limit(int i);
}
