/*
 * Copyright 2013 Arinaa
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
package com.arimaa.api.movement;

import com.arimaa.core.Color;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public enum Direction {

    HORIZONTAL_LEFT(-1, 0),
    HORIZONTAL_RIGHT(1, 0),
    VERTICAL_FORWARD(0, 1),
    VERTICAL_BACKWARD(0, -1);

    int deltaX;
    int deltaY;

    private Direction(int deltaX, int deltaY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    public int getDeltaX() {
        return deltaX;
    }

    public int getDeltaY(Color forColor) {
        /*  if (forColor == Color.UNDEFINED) {
         return 0;
         }
         return forColor == Color.GOLD ? deltaY : -deltaY;*/
        return deltaY;
    }

}
