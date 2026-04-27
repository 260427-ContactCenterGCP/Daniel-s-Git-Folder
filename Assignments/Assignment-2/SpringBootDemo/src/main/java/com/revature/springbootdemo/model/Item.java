package com.revature.springbootdemo.model;

import java.util.Objects;

public class Item
{
    int id;
    String name;
    String description;

    public Item()
    {
    }

    public Item(int id, String name, String description)
    {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && Objects.equals(name, item.name) && Objects.equals(description, item.description);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, name, description);
    }

    @Override
    public String toString()
    {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
