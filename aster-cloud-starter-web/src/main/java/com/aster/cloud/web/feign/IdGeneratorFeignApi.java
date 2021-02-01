package com.aster.cloud.web.feign;

import com.aster.cloud.web.constant.ServiceNameConstants;
import com.aster.cloud.web.feign.fallback.IdGeneratorFeignApiFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ID生成服务远程API
 *
 * @author 王骞
 * @date 2021-01-31
 */
@Component
@FeignClient(contextId = "idGeneratorRemoteApi", value = ServiceNameConstants.ID_GENERATOR,
        fallback = IdGeneratorFeignApiFallbackImpl.class)
public interface IdGeneratorFeignApi {

    @GetMapping("/id/next")
    long next();

    @GetMapping("/id/parse")
    String parse(long id);

}
