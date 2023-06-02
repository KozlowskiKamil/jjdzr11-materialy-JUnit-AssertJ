package pl.isa;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
public class PalinTest {

    @Test
    public void getPalindroms_emptyString_emptyList() {
        assertThat(Palin.getPalindrome("")).hasSize(0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"anna", "level", "madam", "kajak"})
    public void getPalindroms_singlePalindrom_returnsListWithTheSameWorld(String text) {
        assertThat(Palin.getPalindrome(text)).hasSize(1)
                .contains(text);
    }
    @Test
    public void getPalindroms_emptyString_emptyList(String text) {
        assertThat(Palin.getPalindrome(text)).hasSize(0);
    }
}

