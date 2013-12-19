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
package com.arimaa.core;

import com.arimaa.api.PieceType;
import static com.arimaa.api.PieceType.CAMEL;
import static com.arimaa.api.PieceType.CAT;
import static com.arimaa.api.PieceType.DOG;
import static com.arimaa.api.PieceType.ELEPHANT;
import static com.arimaa.api.PieceType.HORSE;
import static com.arimaa.api.PieceType.RABBIT;
import static com.arimaa.core.Color.GOLD;
import static com.arimaa.core.Color.SILVER;
import com.arimaa.api.SquareContent;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public enum Piece implements SquareContent {

    GOLD_ELEPHANT(ELEPHANT, GOLD),
    GOLD_CAMEL(CAMEL, GOLD),
    GOLD_HORSE(HORSE, GOLD),
    GOLD_DOG(DOG, GOLD),
    GOLD_CAT(CAT, GOLD),
    GOLD_RABBIT(RABBIT, GOLD),
    SILVER_ELEPHANT(ELEPHANT, SILVER),
    SILVER_CAMEL(CAMEL, SILVER),
    SILVER_HORSE(HORSE, SILVER),
    SILVER_DOG(DOG, SILVER),
    SILVER_CAT(CAT, SILVER),
    SILVER_RABBIT(RABBIT, SILVER);

    private final PieceType type;
    private final Color color;

    private Piece(PieceType type, Color color) {
        this.type = type;
        this.color = color;
    }

    public PieceType getType() {
        return type;
    }

    public Color getColor() {
        return color;
    }

    public PieceOnLocation on(Location location) {
        return new PieceOnLocation(this, location);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public static Piece with(PieceType pieceType, Color color) {
        switch (color) {
            case SILVER:
                switch (pieceType) {
                    case ELEPHANT:
                        return SILVER_ELEPHANT;
                    case CAMEL:
                        return SILVER_CAMEL;
                    case HORSE:
                        return SILVER_HORSE;
                    case DOG:
                        return SILVER_DOG;
                    case CAT:
                        return SILVER_CAT;
                    case RABBIT:
                        return SILVER_RABBIT;
                }
            case GOLD:
                switch (pieceType) {
                    case ELEPHANT:
                        return GOLD_ELEPHANT;
                    case CAMEL:
                        return GOLD_CAMEL;
                    case HORSE:
                        return GOLD_HORSE;
                    case DOG:
                        return GOLD_DOG;
                    case CAT:
                        return GOLD_CAT;
                    case RABBIT:
                        return GOLD_RABBIT;
                }
        }
        return null;
    }

    @Override
    public Color getContentColor() {
        return getColor();
    }

    @Override
    public Piece asPiece() {
        return this;
    }

    public boolean colorIs(Color color) {
        return getColor() == color;
    }

}
