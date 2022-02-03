package ru.netology.domain;

import java.util.Objects;

public class TShirt extends Product{
    private String color;
    private String size;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TShirt tShirt = (TShirt) o;
        return color.equals(tShirt.color) && size.equals(tShirt.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, size);
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
