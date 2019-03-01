package com.quality.project.datalayer;

import java.util.List;

public interface CRUDTemplate<T> {
	public void add(T Obj);
	public void update(T Obj);
	public void remove(T Obj);
	public List<T> Select();
}
