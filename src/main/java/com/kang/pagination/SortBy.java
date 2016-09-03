package com.kang.pagination;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by Administrator on 2016/8/31.
 */
public class SortBy implements Comparable<SortBy> ,Serializable{

    private SortType sortType;
    /**
     * 排序优先级，正整形，从1开始，1最大
     */
    private int priority;
    /**
     * 排序的列名
     */
    private String colName;

    public SortBy(String colName) throws IllegalArgumentException {
        this(colName,1);
    }

    public SortBy(String colName,int priority) throws IllegalArgumentException {
        this(colName,priority,SortType.ASC);
    }

    public SortBy(String colName,int priority,SortType sortType) throws IllegalArgumentException {
        if(colName==null||colName.trim().equals("")){
            throw new IllegalArgumentException("colName must have real value");
        }
        if(priority<1){
            throw new IllegalArgumentException("priority must greater than 1");
        }
        if(sortType==null){
            throw new IllegalArgumentException("sortType can not be null");
        }

        this.colName=colName;
        this.priority=priority;
        this.sortType=SortType.ASC;
    }

    public SortType getSortType() {
        return sortType;
    }

    public void setSortType(SortType sortType) throws IllegalArgumentException {
        if(sortType==null){
            throw new IllegalArgumentException("sortType can not be null");
        }
        this.sortType = sortType;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) throws IllegalArgumentException {
        if(priority<1){
            throw new IllegalArgumentException("priority must greater than 1");
        }
        this.priority = priority;
    }

    public String getColName() {
        return colName;
    }

    public int compareTo(SortBy o) {
        return this.priority-o.getPriority();
    }
}
