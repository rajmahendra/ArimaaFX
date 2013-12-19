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
package com.arimaa.api.movement.type;

import com.arimaa.api.movement.Direction;
import com.arimaa.api.movement.Movement;
import com.arimaa.core.ArimaaBoard;
import com.arimaa.core.Color;
import com.arimaa.core.Location;
import com.arimaa.core.PieceOnLocation;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public enum BasicMovementType implements MovementType {

    LINEAL_FORWARD_ONE_STEP(Direction.VERTICAL_FORWARD, DevelopmentType.ONE_STEP),
    LINEAL_BACKWARD_ONE_STEP(Direction.VERTICAL_BACKWARD, DevelopmentType.ONE_STEP),
    LINEAL_LEFT_ONE_STEP(Direction.HORIZONTAL_LEFT, DevelopmentType.ONE_STEP),
    LINEAL_RIGHT_ONE_STEP(Direction.HORIZONTAL_RIGHT, DevelopmentType.ONE_STEP);

    private final Direction flankLineType;
    private final DevelopmentType developmentType;

    private BasicMovementType(Direction flankLineType, DevelopmentType developmentType) {
        this.flankLineType = flankLineType;
        this.developmentType = developmentType;
    }

    @Override
    public Direction getDirection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DevelopmentType getDevelopmentType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDeltaX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDeltaY(Color forColor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isApplicable(PieceOnLocation pieceOnLocation, Location locationTo, ArimaaBoard board, Movement previousMovement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
