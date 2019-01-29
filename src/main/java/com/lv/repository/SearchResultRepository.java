package com.lv.repository;

import com.lv.model.SearchResult;

import java.util.List;

public class SearchResultRepository {
    public List<SearchResult> list() {
        return List.of(new SearchResult("SRS"));
    }
}
