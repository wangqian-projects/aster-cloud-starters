package com.aster.cloud.web.util;

import com.aster.cloud.commons.core.SpringContextHolder;
import com.aster.cloud.web.feign.IdGeneratorRemoteApi;

/**
 * @author 王骞
 * @date 2021-01-31
 */
public class IDUtil {

    public static long next() {
        IdGeneratorRemoteApi bean = SpringContextHolder.getBean(IdGeneratorRemoteApi.class);
        return bean.next();
    }

    public static String parse(long id) {
        IdGeneratorRemoteApi bean = SpringContextHolder.getBean(IdGeneratorRemoteApi.class);
        return bean.parse(id);
    }

}
