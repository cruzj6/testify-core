/*
 * Copyright 2015 Codice Foundation
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.codice.testify;

import org.codice.testify.objects.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.LinkedHashMap;

@RunWith(JUnit4.class)
public class ResultTest {

    @Test
    public void testGetTestResult() {
        Result result = new Result(true, null);
        assert ( result.getTestResult() );
    }

    @Test
    public void testGetAssertionResults() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        Result result = new Result(false, map);
        assert ( result.getAssertionResults().equals(map) );
    }

}