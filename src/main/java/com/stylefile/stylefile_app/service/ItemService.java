package com.stylefile.stylefile_app.service;

import com.stylefile.stylefile_app.entity.Item;
import com.stylefile.stylefile_app.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    
    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public Optional<Item> getItemById(String id) {
        return itemRepository.findById(id);
    }

    public Item createItem(Item item) {
        return itemRepository.save(item);
    }

    public Item updateItem(String id, Item updatedItem) {
        if (itemRepository.existsById(id)) {
            updatedItem.setItemId(id);
            return itemRepository.save(updatedItem);
        }
        return null;
    }

    public void deleteItem(String id) {
        itemRepository.deleteById(id);
    }
}
