/*
 * Copyright ©2018 vbill.cn.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package cn.vbill.middleware.porter.manager.service;

import java.util.List;

import cn.vbill.middleware.porter.common.dic.TaskStatusType;
import cn.vbill.middleware.porter.manager.core.entity.JobTasks;
import cn.vbill.middleware.porter.common.config.TaskConfig;
import cn.vbill.middleware.porter.manager.web.page.Page;

/**
 * 同步任务表 服务接口类
 *
 * @author: FairyHood
 * @date: 2018-03-07 13:40:30
 * @version: V1.0-auto
 * @review: FairyHood/2018-03-07 13:40:30
 */
public interface JobTasksService {

    /**
     * 新增
     *
     * @date 2018/8/10 上午11:43
     * @param: [jobTasks]
     * @return: java.lang.Integer
     */
    Integer insert(JobTasks jobTasks);

    /**
     * 新增Capture
     *
     * @date 2018/8/10 上午11:43
     * @param: [jobTasks]
     * @return: java.lang.Integer
     */
    Integer insertCapture(JobTasks jobTasks);

    /**
     * 更新
     *
     * @date 2018/8/10 上午11:43
     * @param: [jobTasks]
     * @return: java.lang.Integer
     */
    Integer update(JobTasks jobTasks);

    /**
     * 删除
     *
     * @date 2018/8/10 上午11:44
     * @param: [id]
     * @return: java.lang.Integer
     */
    Integer delete(Long id);

    /**
     * 根据id查询
     *
     * @date 2018/8/10 上午11:44
     * @param: [id]
     * @return: cn.vbill.middleware.porter.manager.core.entity.JobTasks
     */
    JobTasks selectById(Long id);

    /**
     * 根据id查询实体
     *
     * @date 2018/8/10 上午11:44
     * @param: [id]
     * @return: cn.vbill.middleware.porter.manager.core.entity.JobTasks
     */
    JobTasks selectEntityById(Long id);

    /**
     * 分页
     *
     * @date 2018/8/10 上午11:44
     * @param: [page, jobName, beginTime, endTime, jobState, jobType]
     * @return: cn.vbill.middleware.porter.manager.web.page.Page<cn.vbill.middleware.porter.manager.core.entity.JobTasks>
     */
    Page<JobTasks> page(Page<JobTasks> page, String jobName, String beginTime, String endTime, TaskStatusType jobState,
            Integer jobType);

    /**
     * tableNames
     *
     * @date 2018/8/10 上午11:44
     * @param: [tablesId]
     * @return: java.lang.Object
     */
    Object tableNames(Long tablesId);

    /**
     * fields
     *
     * @date 2018/8/10 上午11:44
     * @param: [sourceId, tablesId, tableAllName]
     * @return: java.util.List<java.lang.String>
     */
    List<String> fields(Long sourceId, Long tablesId, String tableAllName);

    /**
     * updateState
     *
     * @date 2018/8/10 上午11:45
     * @param: [id, taskStatusType]
     * @return: java.lang.Integer
     */
    Integer updateState(Long id, TaskStatusType taskStatusType);

    /**
     * fitJobTask
     *
     * @date 2018/8/10 上午11:45
     * @param: [id, status]
     * @return: cn.vbill.middleware.porter.common.config.TaskConfig
     */
    TaskConfig fitJobTask(Long id, TaskStatusType status);

    /**
     * selectList
     *
     * @date 2018/8/10 上午11:45
     * @param: []
     * @return: java.util.List<cn.vbill.middleware.porter.manager.core.entity.JobTasks>
     */
    List<JobTasks> selectList();

    /**
     * selectJobNameList
     *
     * @date 2018/8/10 上午11:45
     * @param: []
     * @return: java.util.List<cn.vbill.middleware.porter.manager.core.entity.JobTasks>
     */
    List<JobTasks> selectJobNameList();
}
