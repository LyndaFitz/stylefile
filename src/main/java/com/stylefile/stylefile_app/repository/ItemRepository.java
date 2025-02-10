package com.stylefile.stylefile_app.repository;

import com.stylefile.stylefile_app.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> { // ✅ FIXED: Changed Long to String
}
