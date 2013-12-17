/*
 * Copyright 2013 Rajmahendra Hegde <rajmahendra@gmail.com>.
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
package com.arimaafx.utils;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public enum PieceType {

    empty("", "", "icons/Empty.png"),
    goldElephant("E", "Gold Elephant", "icons/GoldElephant.png"),
    silverElephant("e", "Silver Elephant", "icons/SilverElephant.png"),
    goldCamel("M", "Gold Camel", "icons/GoldCamel.png"),
    silverCamel("m", "Silver Camel", "icons/SilverCamel.png"),
    goldHorse("H", "Gold Horse", "icons/GoldHorse.png"),
    silverHorse("h", "Silver Horse", "icons/SilverHorse.png"),
    goldDog("D", "Gold Dog", "icons/GoldDog.png"),
    silverDog("d", "Silver Dog", "icons/SilverDog.png"),
    goldCat("c", "Gold Cat", "icons/GoldCat.png"),
    silverCat("c", "Silver Cat", "icons/SilverCat.png"),
    goldRabbit("r", "Gold Rabbit", "icons/GoldRabbit.png"),
    silverRabbit("r", "Silver Rabbit", "icons/SilverRabbit.png");

    String symbol;
    String name;
    String fileName;

    private PieceType() {
    }

    private PieceType(String symbol, String name, String fileName) {
        this.symbol = symbol;
        this.name = name;
        this.fileName = fileName;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public String getFileName() {
        return fileName;
    }

}
