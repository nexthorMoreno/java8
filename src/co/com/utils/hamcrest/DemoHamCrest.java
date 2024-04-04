package co.com.utils.hamcrest;

import org.hamcrest.Matcher;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.startsWith;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasToString;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.isOneOf;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.stringContainsInOrder;
import static org.hamcrest.Matchers.typeCompatibleWith;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.either;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

public class DemoHamCrest {
	boolean a;
	boolean b;

	@Test
	public void test_any() throws Exception {
		compareStringNotExactValidations();
		compareEqualsAssertions();
		compareNotEquals();
		compareNotEquals();
		compareByType();
		compareArray();
		compareEmpty();
		
	}

	private void compareNotEquals() {
		MatcherAssert.assertThat("c",is(not(equalTo("d"))));
		MatcherAssert.assertThat(b, not(equalTo("f")));
	}

	private void compareEqualsAssertions() throws Exception {
		MatcherAssert.assertThat(a, equalTo(b));
		MatcherAssert.assertThat(a, is(equalTo(b)));
		MatcherAssert.assertThat(a, is(b));
		MatcherAssert.assertThat("abc", equalToIgnoringCase("ABc"));
		MatcherAssert.assertThat(" abc ", is(equalToIgnoringWhiteSpace("abc")));
		MatcherAssert.assertThat(" abc", is(equalToIgnoringWhiteSpace("abc")));
		MatcherAssert.assertThat("abc ", is(equalToIgnoringWhiteSpace("abc")));
		
	}
	
	private void compareByType() {
		MatcherAssert.assertThat("Tons", is(any(String.class)));
		MatcherAssert.assertThat("Tons", is(instanceOf(String.class)));
		MatcherAssert.assertThat(String.class, typeCompatibleWith(String.class));
	}
	
	private void compareArray() {
		// Given
		String[] strings = {"why", "hello", "there"};
		// Then
		MatcherAssert.assertThat(strings, is(arrayContaining("why", "hello", "there")));
  }

	private void compareStringNotExactValidations() {
		// Given
		List<Matcher<? super String>> matchers = Arrays.asList(containsString("company"), containsString("Earth"));
		String test = "Rule number one: two's company, but three's a crowd!";
		// Then
		MatcherAssert.assertThat(test, anyOf(matchers));
		MatcherAssert.assertThat(test, both(startsWith("Rule")).and(endsWith("crowd!")));
		MatcherAssert.assertThat(test, either(startsWith("Hello")).or(endsWith("crowd!")));
		MatcherAssert.assertThat(test, stringContainsInOrder(Arrays.asList("one", "two", "three")));
		MatcherAssert.assertThat("abc ", is(startsWith("a")));
		MatcherAssert.assertThat("abc", is(endsWith("c")));
		MatcherAssert.assertThat("abc tons que", containsString("tons"));
		MatcherAssert.assertThat("abc tons que", hasToString("abc tons que"));
		MatcherAssert.assertThat(2, isOneOf(1, 2, 3));
		MatcherAssert.assertThat("abc tons que", hasToString(containsString("que")));
		MatcherAssert.assertThat("abc tons que", anyOf(containsString("que"), containsString("abc")));
	}
	
	private void compareEmpty() {
		String emptyString = "";
		String nullString = null;
		MatcherAssert.assertThat(emptyString, isEmptyOrNullString());
		MatcherAssert.assertThat(nullString, isEmptyOrNullString());
		MatcherAssert.assertThat(emptyString, isEmptyString());
		MatcherAssert.assertThat(nullString, nullValue());
		
	}

	
	
	
	
}
