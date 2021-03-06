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
package de.fmui.osb.broker;

import de.fmui.osb.broker.handler.ErrorLogHandler;

/**
 * Default implementation of the {@link ErrorLogHandler} interface.
 */
public class DefaultErrorLogHandler implements ErrorLogHandler {

	/**
	 * Writes error messages to stderr.
	 */
	@Override
	public void logError(String message, Object... args) {
		System.err.printf(message, args);
		if (args != null) {
			for (Object arg : args) {
				if (arg instanceof Throwable) {
					System.err.println();
					((Throwable) arg).printStackTrace(System.err);
				}
			}
		}
	}
}
