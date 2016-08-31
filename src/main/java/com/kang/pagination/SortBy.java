package com.kang.pagination;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/31.
 */
public class SortBy implements Comparable<SortBy> ,Serializable{

    private SortType sortType;
    private int priority;
    private String colName;

    public SortType getSortType() {
        return sortType;
    }

    public void setSortType(SortType sortType) {
        this.sortType = sortType;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public int compareTo(SortBy o) {
        return this.priority-o.getPriority();
    }
}
