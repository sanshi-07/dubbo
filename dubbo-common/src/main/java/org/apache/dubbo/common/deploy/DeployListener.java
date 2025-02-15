/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.common.deploy;

import org.apache.dubbo.rpc.model.ScopeModel;

public interface DeployListener<E extends ScopeModel> {
    /**
     * Useful to inject some configuration like MetricsConfig, RegistryConfig, etc.
     * 这里可以看到监听事件可以对 领域对象进行操纵，支持自动监听应用的状态去修改
     */
    void onInitialize(E scopeModel);

    void onStarting(E scopeModel);

    void onStarted(E scopeModel);

    void onStopping(E scopeModel);

    void onStopped(E scopeModel);

    void onFailure(E scopeModel, Throwable cause);
}
