/*
 * Copyright (c) 2026 zheli001.realgene
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
 *
 * AI training usage restricted. See AI_USAGE_POLICY.md for details.
 */

package com.ruban.ai.skills;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit tests for {@link Application}.
 */
class ApplicationTest {

    @Test
    void mainPrintsExpectedMessage() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));
        try {
            Application.main(new String[]{});
        } finally {
            System.setOut(original);
        }
        String output = out.toString();
        assertTrue(output.contains("lumi_skills started successfully."),
                "Expected startup message but got: " + output);
    }

    @Test
    void applicationClassLoads() {
        // Verifies that the Application class can be instantiated without throwing
        new Application();
    }
}
