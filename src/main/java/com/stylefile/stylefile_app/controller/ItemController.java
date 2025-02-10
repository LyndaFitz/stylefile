package com.stylefile.stylefile_app.controller;

import com.stylefile.stylefile_app.entity.Item;
import com.stylefile.stylefile_app.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items")
@CrossOrigin(origins = "*") // Allow frontend access
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    // ✅ GET all items
    @GetMapping
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    // ✅ FIXED: Changed Long to String
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable String id) { 
        Optional<Item> item = itemRepository.findById(id);
        return item.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // ✅ POST - Create an item
    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    // ✅ FIXED: Changed Long to String
    @PutMapping("/{id}")
    public ResponseEntity<Item> updateItem(@PathVariable String id, @RequestBody Item updatedItem) { 
        Optional<Item> itemOptional = itemRepository.findById(id);

        if (itemOptional.isPresent()) {
            Item item = itemOptional.get();
            item.setName(updatedItem.getName());
            item.setDescription(updatedItem.getDescription());
            item.setCategory(updatedItem.getCategory());
            item.setSize(updatedItem.getSize());
            item.setQuality(updatedItem.getQuality());
            item.setWaist(updatedItem.getWaist());
            item.setHips(updatedItem.getHips());
            item.setBust(updatedItem.getBust());
            item.setLength(updatedItem.getLength());

            return ResponseEntity.ok(itemRepository.save(item));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // ✅ FIXED: Changed Long to String
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteItem(@PathVariable String id) { 
        if (itemRepository.existsById(id)) {
            itemRepository.deleteById(id);
            return ResponseEntity.ok("Item deleted successfully.");
        }
        return ResponseEntity.notFound().build();
    }
}

