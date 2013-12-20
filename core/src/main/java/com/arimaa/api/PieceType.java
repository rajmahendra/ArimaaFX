/*
 * Copyright 2013 Arimaa
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
package com.arimaa.api;

import com.arimaa.api.movement.type.BasicMovementType;
import com.arimaa.api.movement.type.MovementType;
import com.arimaa.core.Color;
import com.arimaa.core.Piece;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public enum PieceType {

    ELEPHANT(5,
            BasicMovementType.LINEAL_LEFT_ONE_STEP,
            BasicMovementType.LINEAL_RIGHT_ONE_STEP,
            BasicMovementType.LINEAL_FORWARD_ONE_STEP,
            BasicMovementType.LINEAL_BACKWARD_ONE_STEP
    ),
    CAMEL(4,
            BasicMovementType.LINEAL_LEFT_ONE_STEP,
            BasicMovementType.LINEAL_RIGHT_ONE_STEP,
            BasicMovementType.LINEAL_FORWARD_ONE_STEP,
            BasicMovementType.LINEAL_BACKWARD_ONE_STEP
    ),
    HORSE(3,
            BasicMovementType.LINEAL_LEFT_ONE_STEP,
            BasicMovementType.LINEAL_RIGHT_ONE_STEP,
            BasicMovementType.LINEAL_FORWARD_ONE_STEP,
            BasicMovementType.LINEAL_BACKWARD_ONE_STEP
    ),
    DOG(2,
            BasicMovementType.LINEAL_LEFT_ONE_STEP,
            BasicMovementType.LINEAL_RIGHT_ONE_STEP,
            BasicMovementType.LINEAL_FORWARD_ONE_STEP,
            BasicMovementType.LINEAL_BACKWARD_ONE_STEP
    ),
    CAT(1,
            BasicMovementType.LINEAL_LEFT_ONE_STEP,
            BasicMovementType.LINEAL_RIGHT_ONE_STEP,
            BasicMovementType.LINEAL_FORWARD_ONE_STEP,
            BasicMovementType.LINEAL_BACKWARD_ONE_STEP
    ),
    RABBIT(0,
            BasicMovementType.LINEAL_LEFT_ONE_STEP,
            BasicMovementType.LINEAL_RIGHT_ONE_STEP,
            BasicMovementType.LINEAL_FORWARD_ONE_STEP
    );

    private final List<MovementType> availableMovementTypes;
    private final int relativeValue;

    private PieceType(int value, MovementType... movementTypes) {
        this.availableMovementTypes = Arrays.asList(movementTypes);
        this.relativeValue = value;
    }

    public Piece withColor(Color color) {
        return Piece.with(this, color);
    }

    public List<MovementType> getMovementTypes() {
        return availableMovementTypes;
    }
}
