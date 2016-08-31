package com.kang.pagination;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/29.
 */
public class Pagination  implements Serializable{

    /**
     * 每页大小
     */
    protected int pageSize;

    /**
     * 当前页,从1开始
     */
    protected int currentPage;
    /**
     * 排序组
     */
    protected String sortGroup;

    protected final List<SortBy> sorts=new ArrayList<SortBy>();

    public int getPageSize() {
        if(pageSize<=0){
            pageSize=10;
        }
        return pageSize;
    }

    public void setPageSize(int pageSize) {

        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        if(currentPage<=0){
            currentPage=1;
        }
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        /*if(currentPage<1){
            //throw IllegalArgumentException("当前页不能小于1");
        }*/
        this.currentPage = currentPage;
    }

    public String getSortGroup() {
        return sortGroup;
    }

    public void setSortGroup(String sortGroup) {
        this.sortGroup = sortGroup;
    }

    public void addSortBy(int priority,String colName,SortType sortType){
        if(colName==null||colName.trim().equals("")){
            return;
        }
        SortBy sortBy=new SortBy();
        sortBy.setColName(colName);
        sortBy.setPriority(priority);
        sortBy.setSortType(sortType);
        sorts.add(sortBy);
    }
    public void addSortBy(final List<SortBy> list){
        if(list==null||list.size()==0){
            return;
        }
        for(SortBy sortBy:list){
            addSortBy(sortBy.getPriority(),sortBy.getColName(),sortBy.getSortType());
        }
    }

    public void addSortBy(SortBy sortBy){
        addSortBy(sortBy.getPriority(),sortBy.getColName(),sortBy.getSortType());
    }

    List<SortBy> getSorts() {
        return sorts;
    }

}
