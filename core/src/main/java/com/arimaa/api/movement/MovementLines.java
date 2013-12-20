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

import com.arimaa.api.PieceType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class MovementLines implements Iterable<MovementLine> {

    private final List<MovementLine> variants;

    public MovementLines(List<MovementLine> flankVariants) {
        this.variants = flankVariants;
    }

    public List<MovementLine> getVariants() {
        return variants;
    }

    public List<MovementLine> asList() {
        return variants;
    }

    public List<MovementLine> getElephantFlank() {
        return getPieceFlank(PieceType.ELEPHANT);
    }
    
    public List<MovementLine> getRabbitFlank() {
        return getPieceFlank(PieceType.RABBIT);
    }

    private List<MovementLine> getPieceFlank(PieceType pieceType) {
        List<MovementLine> elephantFlank = new ArrayList<>();
        for (MovementLine movementLine : variants) {
            if (pieceType.getMovementTypes().contains(movementLine.getType())) {
                elephantFlank.add(movementLine);
            }
        }
        return elephantFlank;
    }

    @Override
    public Iterator<MovementLine> iterator() {
        return variants.iterator();
    }

}
