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

import com.arimaa.core.Color;
import com.arimaa.core.Piece;
import com.arimaa.core.PieceNotFoundException;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public interface SquareContent {

    public static final EmptySquare EMPTY_SQUARE = EmptySquare.INSTANCE;
    public static final TrapSquare TRAP_SQUARE = TrapSquare.TRAP;

    enum EmptySquare implements SquareContent {

        INSTANCE;

        @Override
        public boolean isEmpty() {
            return true;
        }

        @Override
        public Color getContentColor() {
            return Color.UNDEFINED;
        }

        @Override
        public Piece asPiece() {
            throw new PieceNotFoundException();
        }
    }

    enum TrapSquare implements SquareContent {

        TRAP;

        @Override
        public boolean isEmpty() {
            return true;
        }

        @Override
        public Color getContentColor() {
            return Color.UNDEFINED;
        }

        @Override
        public Piece asPiece() {
            throw new PieceNotFoundException();
        }
    }

    public boolean isEmpty();

    public Color getContentColor();

    public Piece asPiece();
}
