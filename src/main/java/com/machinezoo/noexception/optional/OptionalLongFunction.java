package com.machinezoo.noexception.optional;

import java.util.*;
import java.util.function.*;

@FunctionalInterface public interface OptionalLongFunction<R> extends LongFunction<Optional<R>> {
	@Override Optional<R> apply(long value);
	default LongFunction<R> orElse(R result) {
		return new DefaultLongFunction<>(this, result);
	}
	default LongFunction<R> orElseGet(Supplier<R> source) {
		return new FallbackLongFunction<>(this, source);
	}
}
