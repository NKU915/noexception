package com.machinezoo.noexception.throwing;

@FunctionalInterface public interface ThrowingIntPredicate {
	boolean test(int value) throws Exception;
}