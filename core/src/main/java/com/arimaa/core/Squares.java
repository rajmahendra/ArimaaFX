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
package com.arimaa.core;

import com.arimaa.api.SquareContent;
import static com.arimaa.api.SquareContent.EMPTY_SQUARE;
import static com.arimaa.api.SquareContent.TRAP_SQUARE;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class Squares {

    private final SquareContent[][] values;

    public Squares() {
        this(buildEmptySquareContentArray());
    }

    private static SquareContent[][] buildEmptySquareContentArray() {
        SquareContent[][] squareContents = new SquareContent[8][8];
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                squareContents[i - 1][j - 1] = EMPTY_SQUARE;
            }
        }
        squareContents[2][2] = TRAP_SQUARE;
        squareContents[2][5] = TRAP_SQUARE;
        squareContents[5][2] = TRAP_SQUARE;
        squareContents[5][5] = TRAP_SQUARE;

        return squareContents;
    }

    public Squares(SquareContent[][] values) {
        this.values = values;
    }

    public Squares copy() {
        SquareContent[][] copy = buildEmptySquareContentArray();

        int currentRow = 0;
        for (SquareContent[] rowValues : values) {
            int currentColumn = 0;
            for (SquareContent squareValue : rowValues) {
                copy[currentRow][currentColumn++] = squareValue;
            }
            currentRow++;
        }

        return new Squares(copy);
    }

    public void setContent(SquareContent piece, int coordinateX, int coordinateY) {
        values[coordinateX - 1][coordinateY - 1] = piece;
    }

    public void setContent(SquareContent piece, Location location) {
        values[location.getCoordinateX() - 1][location.getCoordinateY() - 1] = piece;
    }

    public SquareContent getContent(int coordinateX, int coordinateY) {
        return values[coordinateX - 1][coordinateY - 1];
    }

    public SquareContent getContent(Location location) {
        return values[location.getCoordinateX() - 1][location.getCoordinateY() - 1];
    }

}
