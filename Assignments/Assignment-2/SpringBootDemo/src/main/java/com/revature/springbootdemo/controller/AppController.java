package com.revature.springbootdemo.controller;

import com.revature.springbootdemo.model.Item;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/item")
public class AppController
{
    //database in memory
    Map<Integer, Item> items = new HashMap<>();

    //gets every single items
    @GetMapping
    public Map<Integer, Item> getAllItems()
    {
        return items;
    }

    @PostMapping
    public void createItem(@RequestBody Item item)
    {
        if(item != null)
        {
            items.put(item.getId(), item);
            System.out.println("Added an item to the memory!\n");
        }

        else
        {
            System.out.println("body is empty");
        }
    }

    @PutMapping("/{id}")
    public void modifyItem(@PathVariable int id, @RequestBody Item item)
    {
        items.put(id, item);
        System.out.println("Modified " + id + " item!\n");
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable int id)
    {
        if(items.containsKey(id))
        {
            items.remove(id);
            System.out.println("Deleted " + id + " database");
        }

        else
        {
            System.out.println("No such id");
        }

    }
}
