package org.example;

public enum Size {
    Small("The size is Small"),
    Medium("The size is Medium"),
    Large("The size is Large"),
    X_Large("The size is X-Large"),
    XX_Large("The size is XX-Large"),
    XXX_Large("The size is XXX-Large");

    private String displaySize;
    Size(String displaySize)
    {
        this.displaySize = displaySize;
    }

    public String getDisplaySize() {
        return displaySize;
    }

}
