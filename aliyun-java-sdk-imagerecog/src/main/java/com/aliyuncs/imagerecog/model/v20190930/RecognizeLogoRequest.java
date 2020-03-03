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

package com.aliyuncs.imagerecog.model.v20190930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imagerecog.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RecognizeLogoRequest extends RpcAcsRequest<RecognizeLogoResponse> {
	   

	private List<Tasks> taskss;
	public RecognizeLogoRequest() {
		super("imagerecog", "2019-09-30", "RecognizeLogo", "imagerecog");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Tasks> getTaskss() {
		return this.taskss;
	}

	public void setTaskss(List<Tasks> taskss) {
		this.taskss = taskss;	
		if (taskss != null) {
			for (int depth1 = 0; depth1 < taskss.size(); depth1++) {
				putBodyParameter("Tasks." + (depth1 + 1) + ".ImageURL" , taskss.get(depth1).getImageURL());
			}
		}	
	}

	public static class Tasks {

		private String imageURL;

		public String getImageURL() {
			return this.imageURL;
		}

		public void setImageURL(String imageURL) {
			this.imageURL = imageURL;
		}
	}

	@Override
	public Class<RecognizeLogoResponse> getResponseClass() {
		return RecognizeLogoResponse.class;
	}

}