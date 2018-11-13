/*
 * Copyright (c) 2011-2020, hubin (jobob@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.core;

import org.springframework.lang.Nullable;

/**
 * 获取Mybatis-Plus版本
 *
 * @author nieqiurong 2018/11/13.
 */
public class MybatisPlusVersion {

    private MybatisPlusVersion() {
    }

    @Nullable
    public static String getVersion() {
        Package pkg = MybatisPlusVersion.class.getPackage();
        return (pkg != null ? pkg.getImplementationVersion() : null);
    }

}
