package com.aster.cloud.web.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author 王骞
 * @date 2021-01-31
 */
@Data
@ApiModel(value = "超实体类")
public class BasicEntity {

    @ApiModelProperty(value = "主键")
    @TableId(type = IdType.INPUT)
    private Long id;

    @ApiModelProperty(value = "租户ID")
    @TableField("tenant_id")
    private Integer tenantId;

    @ApiModelProperty(value = "建立人员")
    @TableField
    private String createBy;

    @ApiModelProperty(value = "更新人员")
    @TableField
    private String updateBy;

    @ApiModelProperty(value = "建立时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField("update_time")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除标志", example = "false")
    @TableField
    private Boolean delFlag;

}
