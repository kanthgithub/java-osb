/*
 * Copyright 2018 Florian Müller
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package de.fmui.osb.broker.binding;

import de.fmui.osb.broker.json.JSONArray;
import de.fmui.osb.broker.json.JSONObject;
import de.fmui.osb.broker.objects.AbstractOpenServiceBrokerObject;
import de.fmui.osb.broker.objects.Credentials;
import de.fmui.osb.broker.objects.KeyMapping;
import de.fmui.osb.broker.objects.VolumeMount;

@KeyMapping(jsonKey = "credentials", osbClass = Credentials.class)
@KeyMapping(jsonKey = "volume_mounts", osbClass = VolumeMount.class)
public class BindResponseBody extends AbstractOpenServiceBrokerObject implements JSONObject {

	private static final long serialVersionUID = 1L;

	public static final String KEY_OPERATION = "operation";
	public static final String KEY_CREDENTIALS = "credentials";
	public static final String KEY_SYSLOG_DRAIN_URL = "syslog_drain_url";
	public static final String KEY_ROUTE_SERVICE_URL = "route_service_url";
	public static final String KEY_VOLUME_MOUNTS = "volume_mounts";

	public String getOperation() {
		return getString(KEY_OPERATION);
	}

	public void setOperation(String operation) {
		put(KEY_OPERATION, operation);
	}

	public Credentials getCredentials() {
		return get(KEY_CREDENTIALS, Credentials.class);
	}

	public void setCredentials(Credentials credentials) {
		put(KEY_CREDENTIALS, credentials);
	}

	public String getSyslogDrainURL() {
		return getString(KEY_SYSLOG_DRAIN_URL);
	}

	public void setSyslogDrainURL(String url) {
		put(KEY_SYSLOG_DRAIN_URL, url);
	}

	public String getRouteServiceURL() {
		return getString(KEY_ROUTE_SERVICE_URL);
	}

	public void setRouteServiceURL(String url) {
		put(KEY_ROUTE_SERVICE_URL, url);
	}

	public JSONArray<VolumeMount> getVolumeMounts() {
		return getArray(KEY_VOLUME_MOUNTS, VolumeMount.class);
	}

	public void setVolumeMounts(VolumeMount... tags) {
		createArray(KEY_VOLUME_MOUNTS, VolumeMount.class, tags);
	}

	public void addVolumeMount(VolumeMount... tag) {
		addToArray(KEY_VOLUME_MOUNTS, VolumeMount.class, tag);
	}
}
