package com.tnsif.sm.store1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stores")
@CrossOrigin(origins = "http://localhost:3000") 

public class StoreController {
	
	  @Autowired
	    private StoreService storeService;

	    @GetMapping
	    public List<Store> getAllStores() {
	        return storeService.getAllStores();
	    }

	    @PostMapping
	    public ResponseEntity<Store> createStore(@RequestBody Store store) {
	        Store createdStore = storeService.createStore(store);
	        return new ResponseEntity<>(createdStore, HttpStatus.CREATED);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Store> updateStore(@PathVariable Long id, @RequestBody Store store) {
	        Store updatedStore = storeService.updateStore(id, store);
	        if (updatedStore != null) {
	            return new ResponseEntity<>(updatedStore, HttpStatus.OK);
	        }
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteStore(@PathVariable Long id) {
	        boolean isRemoved = storeService.deleteStore(id);
	        if (isRemoved) {
	            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	        }
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}