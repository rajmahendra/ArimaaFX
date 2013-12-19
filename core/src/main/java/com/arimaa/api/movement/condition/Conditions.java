/*
 * Copyright 2013 Arimaa.
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
package com.arimaa.api.movement.condition;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public enum Conditions {

    WHEN_FREAZE(new IsOnFreazeCondition()),
    WHEN_REACH_GOAL_LINE(new IsOnGoalLineCondition()),
    WHEN_PULL_A_PIECE(new IsOnPullingCondition()),
    WHEN_PUSH_A_PIECE(new IsOnPushingCondition()),
    WHEN_FALL_IN_TRAP(new IsOnTrapCondition());

    private final Condition condition;

    private Conditions(Condition condition) {
        this.condition = condition;
    }

    public Condition getCondition() {
        return condition;
    }
}
