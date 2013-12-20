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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import com.arimaa.core.ArimaaBoard;
import static com.arimaa.core.Location.*;
import static com.arimaa.api.SquareContent.EMPTY_SQUARE;
import static com.arimaa.api.SquareContent.TRAP_SQUARE;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class DefaultArimaaBoardTest {

    private ArimaaBoard arimaaBoard;

    public DefaultArimaaBoardTest() {

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
    public void defaultBoardShouldNotBeNull() {
        assertNotNull(arimaaBoard);
    }

    @Test
    public void defaultBoardPositionA1ShouldBeEmpty() {
        assertEquals(arimaaBoard.getSquareContent(A1), EMPTY_SQUARE);
    }

    @Test
    public void defaultBoardPositionA8ShouldBeEmpty() {
        assertEquals(arimaaBoard.getSquareContent(A8), EMPTY_SQUARE);
    }

    @Test
    public void defaultBoardPositionH1ShouldBeEmpty() {
        assertEquals(arimaaBoard.getSquareContent(H1), EMPTY_SQUARE);
    }

    @Test
    public void defaultBoardPositionH8ShouldBeEmpty() {
        assertEquals(arimaaBoard.getSquareContent(H8), EMPTY_SQUARE);
    }

    @Test
    public void boardSquareAtC3ShouldABeTrapSquare() {
        assertEquals(arimaaBoard.getSquareContent(C3), TRAP_SQUARE);
    }

    @Test
    public void boardSquareAtC6ShouldABeTrapSquare() {
        assertEquals(arimaaBoard.getSquareContent(C6), TRAP_SQUARE);
    }

    @Test
    public void boardSquareAtF3ShouldABeTrapSquare() {
        assertEquals(arimaaBoard.getSquareContent(F3), TRAP_SQUARE);
    }

    @Test
    public void boardSquareAtF6ShouldABeTrapSquare() {
        assertEquals(arimaaBoard.getSquareContent(F6), TRAP_SQUARE);
    }

}
