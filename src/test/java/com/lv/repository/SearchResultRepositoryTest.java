package com.lv.repository;

import com.lv.model.SearchResult;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class SearchResultRepositoryTest {

    @Test
    public void test_list_returns_search_results() {
        SearchResultRepository repository = new SearchResultRepository();
        assertThat(repository.list()).isEqualTo(List.of(new SearchResult("SRS")));
    }

    @Test
    public void test_list_returns_empty() {

    }

    @Test
    public void test_list_throws_exception() {

    }
}