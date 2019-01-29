package com.lv.view;

import com.lv.repository.SearchResultRepository;

public class SearchResultView {
    public SearchResultView(SearchResultRepository repository) {
    }

    public String load() {
        return "SRS - show listings";
    }
}
