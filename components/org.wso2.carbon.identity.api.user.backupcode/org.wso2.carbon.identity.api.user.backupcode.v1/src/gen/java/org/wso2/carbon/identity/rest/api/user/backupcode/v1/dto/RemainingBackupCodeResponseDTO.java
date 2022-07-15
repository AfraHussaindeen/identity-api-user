/*
 * Copyright (c) 2022, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.identity.rest.api.user.backupcode.v1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

/**
 * Remaining backup code response.
 * **/
@ApiModel(description = "Remaining backup code response.")
public class RemainingBackupCodeResponseDTO {

    @Valid 
    private Integer remainingBackupCodesCount = null;

    /**
    * Remaining backup codes of the authenticated user.
    **/
    @ApiModelProperty(value = "Remaining backup codes of the authenticated user.")
    @JsonProperty("remainingBackupCodesCount")
    public Integer getRemainingBackupCodesCount() {
        return remainingBackupCodesCount;
    }
    public void setRemainingBackupCodesCount(Integer remainingBackupCodesCount) {
        this.remainingBackupCodesCount = remainingBackupCodesCount;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class RemainingBackupCodeResponseDTO {\n");
        
        sb.append("    remainingBackupCodesCount: ").append(remainingBackupCodesCount).append("\n");
        
        sb.append("}\n");
        return sb.toString();
    }
}
