package com.fdmgroup.demologging.model;

public interface Crudable<T, U> {

	boolean create(T t); // T is type , t name

	T read(U u);

	boolean update(T t);

	boolean delete(U u); // implicitly public abstract
}
