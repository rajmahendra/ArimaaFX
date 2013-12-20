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
package com.arimaa.api;

import com.arimaa.core.ArimaaBoard;
import static com.arimaa.core.Location.*;
import static com.arimaa.core.Piece.*;
import com.arimaa.core.PieceOnLocation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class ArimaaBoardMovementTest {

    private ArimaaBoard arimaaBoard;

    public ArimaaBoardMovementTest() {
    }

    @Before
    public void setUp() {
        arimaaBoard = new ArimaaBoard();
    }

    @After
    public void tearDown() {
        arimaaBoard = null;
    }

    @Test
    public void moveRabbitOneStepForward() {
        PieceOnLocation goldRabbitAtA1 = new PieceOnLocation(GOLD_RABBIT, A1);

        //Given
        arimaaBoard = arimaaBoard.addPiece(goldRabbitAtA1);

        //When
        ArimaaBoard newArimaaBoard = arimaaBoard.performMovement(goldRabbitAtA1, A2);

        //Then
        //In Main Board
        assertEquals(arimaaBoard.getSquareContent(A2), EMPTY_SQUARE);
        assertEquals(arimaaBoard.getSquareContent(A1), GOLD_RABBIT);

        //In New Board
        assertEquals(newArimaaBoard.getSquareContent(A2), GOLD_RABBIT);
        assertEquals(newArimaaBoard.getSquareContent(A1), EMPTY_SQUARE);
    }

}
