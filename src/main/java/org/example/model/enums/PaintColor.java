package org.example.model.enums;

public enum PaintColor {
    RED("#FF0000"),
    GREEN("#00FF00"),
    WHITE("#FFFFFF");

    private String hexCode;

    // Constructor for the enum to hold the hex code for each color
    PaintColor(String hexCode) {
        this.hexCode = hexCode;
    }

    // Getter method to get the hex code
    public String getHexCode() {
        return hexCode;
    }
}
