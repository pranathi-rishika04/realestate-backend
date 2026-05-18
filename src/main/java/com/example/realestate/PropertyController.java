package com.example.realestate;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PropertyController {

    @Autowired
    private PropertyRepository propertyRepository;

    // GET ALL PROPERTIES
    @GetMapping("/api/properties")
    public List<Property> getAllProperties() {
        return propertyRepository.findAll();
    }

    // ADD NEW PROPERTY
    @PostMapping("/api/properties")
    public Property createProperty(@RequestBody Property property) {

        return propertyRepository.save(property);
    }

    // DELETE PROPERTY
    @DeleteMapping("/api/properties/{id}")
    public void deleteProperty(@PathVariable Long id) {

        propertyRepository.deleteById(id);
    }

    // UPDATE PROPERTY
    @PutMapping("/api/properties/{id}")
    public ResponseEntity<Property> updateProperty(
            @PathVariable Long id,
            @RequestBody Property updatedPropertyData) {

        Property existingProperty =
                propertyRepository.findById(id)
                        .orElseThrow(() ->
                                new RuntimeException(
                                        "Property not found"));

        existingProperty.setTitle(updatedPropertyData.getTitle());
        existingProperty.setDescription(updatedPropertyData.getDescription());
        existingProperty.setPrice(updatedPropertyData.getPrice());
        existingProperty.setCity(updatedPropertyData.getCity());
        existingProperty.setBhk(updatedPropertyData.getBhk());
        existingProperty.setImageUrl(updatedPropertyData.getImageUrl());

        Property savedProperty =
                propertyRepository.save(existingProperty);

        return ResponseEntity.ok(savedProperty);
    }
}