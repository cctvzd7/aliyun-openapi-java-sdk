/*
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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetHelmChartUploadUrlRequest extends RpcAcsRequest<GetHelmChartUploadUrlResponse> {
	   

	private String workspace;

	private String chartFileName;
	public GetHelmChartUploadUrlRequest() {
		super("SOFA", "2019-08-15", "GetHelmChartUploadUrl", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWorkspace() {
		return this.workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
		if(workspace != null){
			putBodyParameter("Workspace", workspace);
		}
	}

	public String getChartFileName() {
		return this.chartFileName;
	}

	public void setChartFileName(String chartFileName) {
		this.chartFileName = chartFileName;
		if(chartFileName != null){
			putBodyParameter("ChartFileName", chartFileName);
		}
	}

	@Override
	public Class<GetHelmChartUploadUrlResponse> getResponseClass() {
		return GetHelmChartUploadUrlResponse.class;
	}

}
