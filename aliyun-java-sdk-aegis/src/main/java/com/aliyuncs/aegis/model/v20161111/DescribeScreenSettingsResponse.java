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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeScreenSettingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScreenSettingsResponse extends AcsResponse {

	private String requestId;

	private String requestId1;

	private List<SasScreenSettingListItem> sasScreenSettingList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRequestId1() {
		return this.requestId1;
	}

	public void setRequestId1(String requestId1) {
		this.requestId1 = requestId1;
	}

	public List<SasScreenSettingListItem> getSasScreenSettingList() {
		return this.sasScreenSettingList;
	}

	public void setSasScreenSettingList(List<SasScreenSettingListItem> sasScreenSettingList) {
		this.sasScreenSettingList = sasScreenSettingList;
	}

	public static class SasScreenSettingListItem {

		private String screenSettingTitle;

		private String screenSettingIdMap;

		public String getScreenSettingTitle() {
			return this.screenSettingTitle;
		}

		public void setScreenSettingTitle(String screenSettingTitle) {
			this.screenSettingTitle = screenSettingTitle;
		}

		public String getScreenSettingIdMap() {
			return this.screenSettingIdMap;
		}

		public void setScreenSettingIdMap(String screenSettingIdMap) {
			this.screenSettingIdMap = screenSettingIdMap;
		}
	}

	@Override
	public DescribeScreenSettingsResponse getInstance(UnmarshallerContext context) {
		return	DescribeScreenSettingsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
