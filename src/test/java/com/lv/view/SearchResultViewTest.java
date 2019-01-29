package com.lv.view;

import com.lv.datasource.exception.DatasourceException;
import com.lv.repository.SearchResultRepository;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SearchResultViewTest {

    @Test
    public void test_show_search_result_view_with_data() {
        SearchResultRepository repository = mock(SearchResultRepository.class);
        when(repository.list()).thenReturn(List.of("123"));

        String output = new SearchResultView(repository).load();
        assertThat(output).isEqualTo("SRS - show listings");
    }

    @Test
    public void test_show_search_result_view_without_data() {
        SearchResultRepository repository = mock(SearchResultRepository.class);
        when(repository.list()).thenReturn(new ArrayList());

        String output = new SearchResultView(repository).load();
        assertThat(output).isEqualTo("SRS - Listing not found");
    }

    @Test
    public void test_show_search_result_view_wit_something_went_wrong() {
        SearchResultRepository repository = mock(SearchResultRepository.class);
        when(repository.list()).thenThrow(new DatasourceException("Timeout"));

        String output = new SearchResultView(repository).load();
        assertThat(output).isEqualTo("SRS - Something went wrong");
    }
}