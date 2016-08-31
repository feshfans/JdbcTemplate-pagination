package com.kang;

import com.kang.pagination.SortBy;
import com.kang.pagination.SortType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        List<SortBy> list=new ArrayList<SortBy>();


        SortBy sortBy1=new SortBy();
        sortBy1.setPriority(2);

        SortBy sortBy2=new SortBy();
        sortBy2.setPriority(1);

        SortBy sortBy3=new SortBy();
        sortBy3.setPriority(3);

        list.add(sortBy2);
        list.add(sortBy3);
        list.add(sortBy1);

        System.out.println("======================");
        for(SortBy sortBy:list){
            System.out.println(sortBy.getPriority());
        }
        System.out.println("========================");

        Collections.sort(list);

        for(SortBy sortBy:list){
            System.out.println(sortBy.getPriority());
        }

        System.out.println(SortType.ASC.toString());

    }
}
