package com.imooc.passbook.service;

import com.imooc.passbook.vo.CreateMerchantsRequest;
import com.imooc.passbook.vo.PassTemplate;
import com.imooc.passbook.vo.Response;

/* 对商户服务接口定义 */
public interface IMerchantsServ {

    /* 创建商户服务 */
    Response createMerchants(CreateMerchantsRequest request);

    /* 根据 id 构造商户信息 */
    Response buildMerchantsInfoById(Integer id);

    /* 投放优惠券 */
    Response dropPassTemplate(PassTemplate template);
}
