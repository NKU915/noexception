// Part of NoException: https://noexception.machinezoo.com
// Generated code. Edit generate.sh instead.
package com.machinezoo.noexception.optional;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.*;
import org.junit.*;

public class DefaultBinaryOperatorTest {
	@Test public void full() {
		@SuppressWarnings("unchecked") OptionalBinaryOperator<String> full = mock(OptionalBinaryOperator.class);
		when(full.apply("input1", "input2")).thenReturn(Optional.of("value"));
		assertEquals("value", new DefaultBinaryOperator<String>(full, "default").apply("input1", "input2"));
		verify(full, only()).apply("input1", "input2");
	}
	@Test public void empty() {
		@SuppressWarnings("unchecked") OptionalBinaryOperator<String> empty = mock(OptionalBinaryOperator.class);
		when(empty.apply("input1", "input2")).thenReturn(Optional.empty());
		assertEquals("default", new DefaultBinaryOperator<String>(empty, "default").apply("input1", "input2"));
		verify(empty, only()).apply("input1", "input2");
	}
}
