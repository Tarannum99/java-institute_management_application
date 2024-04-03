package com.aloofly.ima.service;

import java.util.ArrayList;

public interface IBaseService<T> {
	T create();
	ArrayList<T> createAll();

}
