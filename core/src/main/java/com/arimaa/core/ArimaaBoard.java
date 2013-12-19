/*
 * Copyright 2013 Rajmahendra Hegde <rajmahendra@gmail.com>.
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
package com.arimaa.core;

import com.arimaa.api.SquareContent;
import com.arimaa.api.movement.Movement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class ArimaaBoard {

    private final Squares squares;

    public ArimaaBoard() {
        this(new Squares());
    }

    public ArimaaBoard(Squares squares) {
        this.squares = squares;
    }

    public ArimaaBoard performMovement(Piece piece, Location locationFrom, Location locationTo) {
        Squares copy = squares.copy();
        copy.setContent(SquareContent.EMPTY_SQUARE, locationFrom.getCoordinateX(), locationFrom.getCoordinateY());
        copy.setContent(piece, locationTo.getCoordinateX(), locationTo.getCoordinateY());
        return new ArimaaBoard(copy);
    }

    public ArimaaBoard performMovement(PieceOnLocation pieceInBoard, Location locationTo) {
        return performMovement(pieceInBoard.getPiece(), pieceInBoard.getLocation(), locationTo);
    }

    public ArimaaBoard performMovement(Movement movement) {
        return performMovement(movement.getMovingPiece(), movement.getFrom(), movement.getTo());
    }

    public SquareContent getSquareContent(Location location) {
        return squares.getContent(location.getCoordinateX(), location.getCoordinateY());
    }

    public ArimaaBoard addPiece(Piece piece, Location location) {
        Squares copy = squares.copy();
        copy.setContent(piece, location.getCoordinateX(), location.getCoordinateY());
        return new ArimaaBoard(copy);
    }

    public List<PieceOnLocation> getPieces(Color movingColor) {
        List<PieceOnLocation> pieces = new ArrayList<>();
        for (Location location : Location.values()) {
            SquareContent content = squares.getContent(location.getCoordinateX(), location.getCoordinateY());
            if (!content.isEmpty()) {
                Piece piece = (Piece) content;
                if (piece.getColor() == movingColor) {
                    pieces.add(piece.on(location));
                }
            }
        }
        return pieces;
    }

    public List<PieceOnLocation> find(Piece pieceToFind) {
        List<PieceOnLocation> pieces = new ArrayList<>();
        for (Location location : Location.values()) {
            SquareContent content = squares.getContent(location.getCoordinateX(), location.getCoordinateY());
            if (!content.isEmpty()) {
                Piece piece = (Piece) content;
                if (piece == pieceToFind) {
                    pieces.add(piece.on(location));
                }
            }
        }
        return pieces;
    }

    public PieceOnLocation getPieceOnLocation(Location location) {
        return new PieceOnLocation(getSquareContent(location).asPiece(), location);
    }

    public ArimaaBoard empty(Location location) {
        Squares copy = squares.copy();
        copy.setContent(SquareContent.EMPTY_SQUARE, location.getCoordinateX(), location.getCoordinateY());
        return new ArimaaBoard(copy);
    }
}
