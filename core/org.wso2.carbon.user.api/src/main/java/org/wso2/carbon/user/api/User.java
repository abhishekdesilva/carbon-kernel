/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.user.api;

/**
 * Represents an User in user store.
 */
public interface User {

    /**
     * Get the username assigned to this user object.
     * @return Username of this user as a string.
     */
    String getUsername();

    /**
     * Get the user id assigned to this user.
     * @return user id of this user as a string.
     */
    String getUserId();

    /**
     * Set the username of this user.
     * @param username Username of the this user.
     */
    void setUsername(String username);

    /**
     * Set the userId of this user. This will be used as a pseudonym for the username.
     * @param userId User id of this user.
     */
    void setUserId(String userId);
}