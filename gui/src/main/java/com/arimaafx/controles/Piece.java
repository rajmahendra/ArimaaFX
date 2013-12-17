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
package com.arimaafx.controles;

import com.arimaafx.utils.PieceType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.image.ImageView;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public class Piece extends Label {

    private ImageView imageView;
    private Color color;
    private int row;
    private int column;
    private PieceType type;

    public Piece() {
    }

    public Piece(ImageView imageView, Color color, int row, int column, PieceType type) {
        this.imageView = imageView;
        this.color = color;
        this.row = row;
        this.column = column;
        this.type = type;
    }

    public Piece(Color color, int row, int column, PieceType type) {
        this.color = color;
        this.row = row;
        this.column = column;
        this.type = type;
    }

    private void setImage(String imageName) {
        Image image = new Image(getClass().getResourceAsStream(imageName));
        imageView = new ImageView(image);
        setGraphic(imageView);
    }

    private void setEmptyImage() {
        setImage(PieceType.empty.getFileName());
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public PieceType getType() {
        return type;
    }

    public void setType(PieceType type) {
        this.type = type;
    }

}
