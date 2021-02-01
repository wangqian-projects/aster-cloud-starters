package com.aster.cloud.web.util;

import com.aster.cloud.commons.core.SpringContextHolder;
import com.aster.cloud.web.feign.IdGeneratorFeignApi;

/**
 * @author 王骞
 * @date 2021-01-31
 */
public class IdUtil {

    /**
     * 获取下一个id
     * @return id
     */
    public static long next() {
        IdGeneratorFeignApi bean = SpringContextHolder.getBean(IdGeneratorFeignApi.class);
        return bean.next();
    }

    /**
     * 解析Id
     * @param id 主键
     * @return 结果
     */
    public static String parse(long id) {
        IdGeneratorFeignApi bean = SpringContextHolder.getBean(IdGeneratorFeignApi.class);
        return bean.parse(id);
    }

}
