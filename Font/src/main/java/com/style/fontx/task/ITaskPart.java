package com.style.fontx.task;

/**
 * Created by lizhichao on 2021/9/8
 */
public interface ITaskPart<T> {
    void apply(T view);
}