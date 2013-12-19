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

import com.arimaa.api.movement.MovementLines;
import com.arimaa.core.ArimaaBoard;
import com.arimaa.core.Color;
import com.arimaa.core.Location;
import com.arimaa.core.PieceOnLocation;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public interface ArimaaReader {

    MovementLines findAllMovementLines(Location location);

    boolean containsPieceWithColor(Location location, Color color, ArimaaBoard board);

    MovementLines findMovementLines(PieceOnLocation pieceOnLocation);
}
