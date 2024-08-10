package com.andrew2chan.javatodolist.mappers;

public interface TodoMapper<A, B> {
    B mapTo(A a);
    A mapFrom(B b);
}
