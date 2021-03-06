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
import static com.arimaa.api.PieceType.RABBIT;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public enum Color {

    GOLD, SILVER, UNDEFINED;

    public Color opposite() {
        if (this == UNDEFINED) {
            return UNDEFINED;
        }
        return this == GOLD ? SILVER : GOLD;
    }
    
    /*
        public int getInitialRowFor(PieceType type) {
		if (this== GOLD && type == RABBIT) return 2;
		if (this==GOLD && type != RABBIT) return 1;
		if (this==SILVER && type == RABBIT) return 7;
		if (this==SILVER && type != RABBIT) return 8;
		return -1;
	}
*/
}
