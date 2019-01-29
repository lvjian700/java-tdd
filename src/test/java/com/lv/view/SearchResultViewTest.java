package com.lv.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultViewTest {

    @Test
    public void test_show_search_result_view_with_data() {
        String output = new SearchResultView().load();
        assertThat(output).isEqualTo("SRS - show listings");
    }
}