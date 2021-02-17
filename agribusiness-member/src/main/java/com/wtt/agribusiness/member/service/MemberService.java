package com.wtt.agribusiness.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wtt.common.utils.PageUtils;
import com.wtt.agribusiness.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author Wang TianTian
 * @email 442301197@qq.com
 * @date 2021-02-17 13:28:55
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

