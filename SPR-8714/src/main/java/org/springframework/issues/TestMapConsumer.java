/*
 * Copyright 2002-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.issues;

/**
 * See
 * https://github.com/rgladwell/spring-map-converter-issue/blob/master/src/main/java/uk/co/bbc/spring/issue/TestMapConsumer.java
 */
public class TestMapConsumer {

	private TestMap<String, String> testMap;

	public TestMap<String, String> getTestMap() {
		return testMap;
	}

	public void setTestMap(TestMap<String, String> testMap) {
		this.testMap = testMap;
	}

}