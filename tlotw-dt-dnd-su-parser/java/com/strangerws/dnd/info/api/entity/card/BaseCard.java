package com.strangerws.dnd.info.api.entity.card;

import com.sun.istack.internal.NotNull;
import org.jetbrains.annotations.Contract;

public class BaseCard {

    private Integer id;
    private String name;

    @Contract(pure = true)
    public BaseCard(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @NotNull
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BaseCard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
