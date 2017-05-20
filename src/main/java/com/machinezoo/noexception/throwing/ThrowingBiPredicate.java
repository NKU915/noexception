package com.machinezoo.noexception.throwing;

@FunctionalInterface public interface ThrowingBiPredicate<T, U> {
	boolean test(T t, U u) throws Exception;
}
