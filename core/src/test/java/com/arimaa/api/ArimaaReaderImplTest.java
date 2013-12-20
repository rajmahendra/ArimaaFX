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

import com.arimaa.api.impl.ArimaaReaderImpl;
import com.arimaa.api.movement.MovementLines;
import com.arimaa.api.movement.MovementLine;
import com.arimaa.core.Location;
import com.arimaa.core.Piece;
import com.arimaa.core.PieceOnLocation;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class ArimaaReaderImplTest {

    private ArimaaReaderImpl arimaaReaderImpl;

    public ArimaaReaderImplTest() {
    }

    @Before
    public void setUp() {

        arimaaReaderImpl = new ArimaaReaderImpl();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void findAllElephantFlank() {
        MovementLines flanks = arimaaReaderImpl.findMovementLines(new PieceOnLocation(Piece.GOLD_DOG, Location.B2));
        
        List<MovementLine> elephantVariants = flanks.getRabbitFlank();
        
        System.out.println(elephantVariants.size());
        
        for (MovementLine elephantLine : elephantVariants){
        System.out.println (elephantLine.getLocations() + " " + elephantLine.getDirection() + " " + elephantLine.getType());
        }
    }
}
