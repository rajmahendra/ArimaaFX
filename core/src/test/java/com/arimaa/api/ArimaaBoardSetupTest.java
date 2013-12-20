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
import static com.arimaa.core.Color.GOLD;
import static com.arimaa.core.Location.*;
import static com.arimaa.core.Piece.*;
import com.arimaa.core.PieceOnLocation;
import java.util.List;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class ArimaaBoardSetupTest {

    private ArimaaBoard arimaaBoard;

    public ArimaaBoardSetupTest() {
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
    public void elephantShouldBePresentAtA5() {
        //When
        arimaaBoard = arimaaBoard.addPiece(GOLD_ELEPHANT, A5);

        //Then
        assertEquals(arimaaBoard.getSquareContent(A5), GOLD_ELEPHANT);
    }

    @Test
    public void findTheGoldElephantAtA5() {
        //Given
        arimaaBoard = arimaaBoard.addPiece(GOLD_ELEPHANT, A5);

        //When
        List<PieceOnLocation> pieceLocation = arimaaBoard.find(GOLD_ELEPHANT);

        //Then
        assertEquals(pieceLocation.size(), 1);
        assertEquals(pieceLocation.get(0).getPiece(), GOLD_ELEPHANT);
        assertEquals(pieceLocation.get(0).getLocation(), A5);
    }

    @Test
    public void findTheSilverHorseAtD2() {

        //Given
        arimaaBoard = arimaaBoard.addPiece(SILVER_HORSE, D2);

        //When
        List<PieceOnLocation> pieceLocation = arimaaBoard.find(SILVER_HORSE);

        //Then
        assertEquals(pieceLocation.size(), 1);
        assertEquals(pieceLocation.get(0).getPiece(), SILVER_HORSE);
        assertEquals(pieceLocation.get(0).getLocation(), D2);
    }

    @Test
    public void getAll5GoldPieces() {
        //Given
        arimaaBoard = arimaaBoard.addPiece(GOLD_CAMEL, D2)
                .addPiece(GOLD_ELEPHANT, A3)
                .addPiece(GOLD_DOG, F2)
                .addPiece(GOLD_RABBIT, B4)
                .addPiece(GOLD_RABBIT, H6)
                .addPiece(SILVER_ELEPHANT, E4)
                .addPiece(SILVER_RABBIT, G5);

        //When
        List<PieceOnLocation> allGoldPieces = arimaaBoard.getPieces(GOLD);

        //Then
        assertEquals(allGoldPieces.size(), 5);

        PieceOnLocation pieceOnLocation = allGoldPieces.get(0);
        assertEquals(pieceOnLocation.getPiece(), GOLD_ELEPHANT);
        assertEquals(pieceOnLocation.getColor(), GOLD);
        assertEquals(pieceOnLocation.getLocation(), A3);

    }

}
