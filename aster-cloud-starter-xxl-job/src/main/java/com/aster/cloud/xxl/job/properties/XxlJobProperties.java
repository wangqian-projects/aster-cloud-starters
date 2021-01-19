package com.aster.cloud.xxl.job.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import static com.aster.cloud.xxl.job.Constants.XXL_JOB_PREFIX;

/**
 * @author 王骞
 * @date 2021-01-19
 */
@ConfigurationProperties(prefix = XXL_JOB_PREFIX)
public class XxlJobProperties {

    /**
     * 默认启用, false 关闭
     */
    private boolean enabled = true;

    private AdminProperties admin;

    private String accessToken;

    private ExecutorProperties executor;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public AdminProperties getAdmin() {
        return admin;
    }

    public void setAdmin(AdminProperties admin) {
        this.admin = admin;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public ExecutorProperties getExecutor() {
        return executor;
    }

    public void setExecutor(ExecutorProperties executor) {
        this.executor = executor;
    }
}
