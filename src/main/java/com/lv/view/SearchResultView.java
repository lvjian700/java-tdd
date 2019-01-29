package com.lv.view;

import com.lv.repository.SearchResultRepository;

import java.util.List;

public class SearchResultView {
    private final SearchResultRepository repository;

    public SearchResultView(SearchResultRepository repository) {
        this.repository = repository;
    }

    public String load() {
        List searchResults = repository.list();
        if (searchResults.isEmpty()) {
            return "SRS - Listing not found";
        }
        return "SRS - show listings";
    }
}
