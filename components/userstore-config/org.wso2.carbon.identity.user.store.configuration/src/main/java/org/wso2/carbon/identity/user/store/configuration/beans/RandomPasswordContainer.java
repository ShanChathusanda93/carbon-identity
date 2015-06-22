/*
*  Copyright (c) 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.wso2.carbon.identity.user.store.configuration.beans;

import java.io.Serializable;

/**
 * Class mainatains an array where all the RandomPasswords are kept in an array.
 * This class is stored in distributed cache.
 */
public class RandomPasswordContainer implements Serializable {

    private RandomPassword[] randomPasswords;
    private String uniqueID;

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public RandomPassword[] getRandomPasswords() {
        return randomPasswords;
    }

    public void setRandomPasswords(RandomPassword[] randomPasswords) {
        this.randomPasswords = randomPasswords;
    }


}
