package com.kang.pagination;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Created by Administrator on 2016/8/29.
 */
public class AnnotationUtils<T> {

    private Class<? extends T> cls;
    private String name;
    public AnnotationUtils(Class<? extends T> cls,String annotationName){

        if(cls==null){

        }
        if(annotationName==null||annotationName.trim().equals("")){

        }
        this.cls=cls;
        this.name=annotationName;
    }

    public List<SortBy> parse() throws ClassNotFoundException {

        Field[] fields= cls.getDeclaredFields();
        for(Field field:fields){

            PageSort pageSort=field.getAnnotation(PageSort.class);

        }



        return null;
    }
}
