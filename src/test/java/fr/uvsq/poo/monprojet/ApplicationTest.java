package fr.uvsq.poo.monprojet;

import org.junit.jupiter.api.Test;

import fr.uvsq.poo.monprojet.Application;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsEqual.equalTo;

class ApplicationTest {
    @Test
    void testGreetings() {
        assertThat(Application.greeting, is(equalTo("Hello!")));
    }
}
