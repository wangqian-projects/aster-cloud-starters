/*
 * Copyright (c) 2017 Baidu, Inc. All Rights Reserve.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.fsg.uid.worker.entity;

import com.baidu.fsg.uid.worker.WorkerNodeType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * Entity for M_WORKER_NODE
 *
 * @author yutianbao
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("WORKER_NODE")
public class WorkerNodeEntity extends Model {

    /**
     * Entity unique id (table unique)
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private long id;

    /**
     * Type of CONTAINER: HostName, ACTUAL : IP.
     */
    @TableField("HOST_NAME")
    private String hostName;

    /**
     * Type of CONTAINER: Port, ACTUAL : Timestamp + Random(0-10000)
     */
    @TableField("PORT")
    private String port;

    /**
     * type of {@link WorkerNodeType}
     */
    @TableField("TYPE")
    private int type;

    /**
     * Worker launch date, default now
     */
    @TableField("LAUNCH_DATE")
    private Date launchDate = new Date();

    /**
     * Created time
     */
    @TableField("MODIFIED")
    private Date created;

    /**
     * Last modified
     */
    @TableField("CREATED")
    private Date modified;
}
