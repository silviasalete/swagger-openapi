package com.swagger_openapi.controller;

import com.example.swagger_openapi.api.ItemsApi;
import com.example.swagger_openapi.dto.Item;
import com.example.swagger_openapi.dto.ItemForm;
import com.example.swagger_openapi.dto.ItemWeb;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController implements ItemsApi {
    @Override
    public ResponseEntity<ItemWeb> createItem(ItemForm itemForm) {
        return ItemsApi.super.createItem(itemForm);
    }

    @Override
    public ResponseEntity<String> deleteItemById(Long id) {
        return ItemsApi.super.deleteItemById(id);
    }

    @Override
    public ResponseEntity<ItemWeb> getItemById(Long id) {
        return ItemsApi.super.getItemById(id);
    }

    @Override
    public ResponseEntity<Item> updateItem(Item item) {
        return ItemsApi.super.updateItem(item);
    }
}
