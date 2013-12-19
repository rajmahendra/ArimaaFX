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
package com.arimaa.api.movement;

import com.arimaa.api.SquareContent;
import com.arimaa.api.movement.type.MovementType;
import com.arimaa.core.ArimaaBoard;
import com.arimaa.core.Color;
import java.util.Arrays;
import com.arimaa.core.Location;
import com.arimaa.core.PieceOnLocation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class MovementLine {

    private final Location startingLocation;
    private final List<Location> locations;
    private final MovementType movementType;

    public MovementLine(Location startingLocation, List<Location> locations, MovementType movementType) {
        this.startingLocation = startingLocation;
        if (locations == null) {
            this.locations = new ArrayList<Location>();
        } else {
            this.locations = locations;
        }
        this.movementType = movementType;
    }

    public MovementLine(Location startingLocation, Location location, MovementType movementType) {
        this(startingLocation, (location == null ? null : Arrays.asList(location)), movementType);
    }

    public List<Location> getLocations() {
        return locations;
    }

    public Direction getDirection() {
        return movementType.getDirection();
    }

    public List<Location> filterPotentiallyReachablePositions(Color color, ArimaaBoard board) {
        List<Location> toReturn = new ArrayList<Location>();
        boolean isReachable = false;
        boolean isLastLocation = false;

        for (Location location : getLocations()) {
            SquareContent squareContent = board.getSquareContent(location);
            if (!squareContent.isEmpty()) {
                isLastLocation = true;
                isReachable = false;
                Color toColor = squareContent.asPiece().getColor();
                if (toColor == color.opposite()) {
                    isReachable = true;
                }
            } else {
                isReachable = true;
                isLastLocation = false;
            }

            if (isReachable) {
                toReturn.add(location);
            }
            if (isLastLocation) {
                break;
            }
        }
        return toReturn;
    }

    public MovementType getType() {
        return movementType;
    }

    public boolean isApplicable(ArimaaBoard board, Movement previousMovement) {
        if (locations.size() == 0) {
            return false;
        }
        Location locationTo = locations.get(0);
        PieceOnLocation pieceFrom = board.getPieceOnLocation(startingLocation);
        return movementType.isApplicable(pieceFrom, locationTo, board, previousMovement);
    }
}
