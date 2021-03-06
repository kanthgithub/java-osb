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
package de.fmui.osb.broker.objects;

import de.fmui.osb.broker.json.JSONObject;

@KeyMapping(jsonKey = "create", osbClass = Schema.class)
@KeyMapping(jsonKey = "update", osbClass = Schema.class)
public class ServiceInstanceSchema extends AbstractOpenServiceBrokerObject implements JSONObject {

	private static final long serialVersionUID = 1L;

	public final static String KEY_CREATE = "create";
	public final static String KEY_UPDATE = "update";

	public Schema getCreateSchema() {
		return get(KEY_CREATE, Schema.class);
	}

	public void setCreateSchema(Schema schema) {
		put(KEY_CREATE, schema);
	}

	public Schema getUpdateSchema() {
		return get(KEY_UPDATE, Schema.class);
	}

	public void setUpdateSchema(Schema schema) {
		put(KEY_UPDATE, schema);
	}
}
