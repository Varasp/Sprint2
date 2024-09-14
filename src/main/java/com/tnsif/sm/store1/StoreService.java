package com.tnsif.sm.store1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StoreService {
	 @Autowired
	    private StoreRepository storeRepository;

	    public List<Store> getAllStores() {
	        return storeRepository.findAll();
	    }

	    public Store createStore(Store store) {
	        return storeRepository.save(store);
	    }

	    public Store updateStore(Long id, Store store) {
	        Optional<Store> existingStore = storeRepository.findById(id);
	        if (existingStore.isPresent()) {
	            Store updatedStore = existingStore.get();
	            updatedStore.setName(store.getName());
	            updatedStore.setDescription(store.getDescription());
	            updatedStore.setLocation(store.getLocation());
	            updatedStore.setContactInfo(store.getContactInfo());
	            updatedStore.setOperatingHours(store.getOperatingHours());
	            return storeRepository.save(updatedStore);
	        }
	        return null;
	    }

	    public boolean deleteStore(Long id) {
	        if (storeRepository.existsById(id)) {
	            storeRepository.deleteById(id);
	            return true;
	        }
	        return false;
	    }
	}