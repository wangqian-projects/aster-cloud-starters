package com.aster.cloud.web.feign.fallback;

import cn.hutool.core.lang.Singleton;
import cn.hutool.core.lang.Snowflake;
import com.aster.cloud.commons.core.SpringContextHolder;
import com.aster.cloud.commons.core.api.ApiException;
import com.aster.cloud.web.constant.ServiceNameConstants;
import com.aster.cloud.web.feign.IdGeneratorFeignApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author 王骞
 * @date 2021-02-01
 */
@Slf4j
@Component
public class IdGeneratorFeignApiFallbackImpl implements IdGeneratorFeignApi {

    @Override
    public long next() {
        // 开发环境可以不启用 ID_GENERATOR 服务
        if ("dev".equals(SpringContextHolder.getActiveProfile())) {
            return Singleton.get(Snowflake.class, 0L, 1L).nextId();
        }
        log.error("ID 生成异常, 请检查【"+ServiceNameConstants.ID_GENERATOR + "】服务是否正常运行。");
       return 0;
    }

    @Override
    public String parse(long id) {
        log.error("ID 解析异常, 请检查【"+ServiceNameConstants.ID_GENERATOR + "】服务是否正常运行。");
        return null;
    }
}
