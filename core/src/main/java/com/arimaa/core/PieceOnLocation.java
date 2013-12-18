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

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class PieceOnLocation {

    private final Piece piece;
    private final Location location;

    public PieceOnLocation(Piece piece, Location location) {
        this.piece = piece;
        this.location = location;
    }

    public Piece getPiece() {
        return piece;
    }

    public Location getLocation() {
        return location;
    }

    public Color getColor() {
        return piece.getColor();
    }

    public PieceType getType() {
        return piece.getType();
    }

    @Override
    public String toString() {
        return "PieceInBoard [location=" + location + ", piece=" + piece + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((location == null) ? 0 : location.hashCode());
        result = prime * result + ((piece == null) ? 0 : piece.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        PieceOnLocation other = (PieceOnLocation) obj;
        if (location == null) {
            if (other.location != null) {
                return false;
            }
        } else if (!location.equals(other.location)) {
            return false;
        }
        if (piece == null) {
            if (other.piece != null) {
                return false;
            }
        } else if (!piece.equals(other.piece)) {
            return false;
        }
        return true;
    }

    public boolean isOnInitialRow() {
        return getColor().getInitialRowFor(getType()) == getLocation().getCoordinateY();
    }

}
