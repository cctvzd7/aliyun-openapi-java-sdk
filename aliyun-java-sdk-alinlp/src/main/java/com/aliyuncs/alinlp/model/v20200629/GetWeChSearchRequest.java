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

package com.aliyuncs.alinlp.model.v20200629;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alinlp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetWeChSearchRequest extends RpcAcsRequest<GetWeChSearchResponse> {
	   

	private String type;

	private String serviceCode;

	private String size;

	private String tokenizerId;

	private String text;

	private String operation;
	public GetWeChSearchRequest() {
		super("alinlp", "2020-06-29", "GetWeChSearch", "alinlp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
		if(serviceCode != null){
			putBodyParameter("ServiceCode", serviceCode);
		}
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
		if(size != null){
			putBodyParameter("Size", size);
		}
	}

	public String getTokenizerId() {
		return this.tokenizerId;
	}

	public void setTokenizerId(String tokenizerId) {
		this.tokenizerId = tokenizerId;
		if(tokenizerId != null){
			putBodyParameter("TokenizerId", tokenizerId);
		}
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
		if(text != null){
			putBodyParameter("Text", text);
		}
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
		if(operation != null){
			putBodyParameter("Operation", operation);
		}
	}

	@Override
	public Class<GetWeChSearchResponse> getResponseClass() {
		return GetWeChSearchResponse.class;
	}

}
