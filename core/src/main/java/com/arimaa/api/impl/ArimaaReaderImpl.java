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
package com.arimaa.api.impl;

import com.arimaa.api.ArimaaReader;
import com.arimaa.api.movement.MovementLine;
import com.arimaa.api.movement.MovementLines;
import com.arimaa.api.movement.type.DevelopmentType;
import com.arimaa.api.movement.type.MovementType;
import com.arimaa.core.ArimaaBoard;
import com.arimaa.core.Color;
import static com.arimaa.core.Piece.*;
import com.arimaa.core.Location;
import com.arimaa.core.PieceOnLocation;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class ArimaaReaderImpl implements ArimaaReader {

    public boolean isThreathening(ArimaaBoard board, PieceOnLocation piece, Location toThreadLocation) {
        return false;
    }

    @Override
    public MovementLines findAllMovementLines(Location location) {
        List<MovementLine> lines = new ArrayList<>();
        lines.addAll(findMovementLines(GOLD_ELEPHANT.on(location)).asList());

        return new MovementLines(lines);
    }

    @Override
    public MovementLines findMovementLines(PieceOnLocation pieceOnLocation) {
        List<MovementLine> movementLines = new ArrayList<>();
        for (MovementType movementType : pieceOnLocation.getType().getMovementTypes()) {
            movementLines.add(findMovementLine(pieceOnLocation.getLocation(), pieceOnLocation.getColor(), movementType));
        };

        return new MovementLines(movementLines);
    }

    private MovementLine findMovementLine(Location location, Color color, MovementType movementType) {
        //  List<Location> locations = new ArrayList<>();
        int deltaX = movementType.getDeltaX();
        int deltaY = movementType.getDeltaY(color);

        Location nextLocation = location.add(deltaX, deltaY);
        //locations.add(nextLocation);

        return new MovementLine(location, nextLocation, movementType);
        /*if ((movementType.getDevelopmentType() == DevelopmentType.ONE_STEP) || (nextLocation == null)) {
         return new MovementLine(location, nextLocation, movementType);
         } else {
         // nextLocation = nextLocation.add(deltaX, deltaY);
            
         return new MovementLine(location, locations, movementType);
         }*/
    }

    @Override
    public boolean containsPieceWithColor(Location location, Color color, ArimaaBoard board) {
        return board.getSquareContent(location).getContentColor() == color;
    }
}
