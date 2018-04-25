package com.clouway.crm.core;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class PageBean<T> {

    private List<T> list;

    private int pageSize;
    private int pageNum = 0;
    private int currentPage = 0;

    public PageBean(ArrayList<T> constructList, int pageSize){
        this.pageSize = pageSize;
        list = (List<T>)constructList.clone();
        pageNum = list.size() / pageSize;
        if(list.size() % pageSize != 0){
            pageNum++;
        }
    }

    private List<T> getPage(int pageIndex){

        if(pageIndex == 0){
           throw new ArrayIndexOutOfBoundsException("There is no previous page!");
        }

        if(pageIndex > pageNum) pageIndex--; //try to get the next of the last

        List<T> page = list.stream()
                .skip((pageIndex - 1) * pageSize)
                .limit(pageSize)
                .collect(Collectors.toList());

        currentPage = pageIndex;

        return page;
    }

    public List<T> next(){

        return getPage(currentPage + 1);

    }

    public List<T> previous(){

        return getPage(currentPage - 1);

    }

    public int getCurrentPage(){

        if(currentPage == 0) currentPage++; // make sure we always are on the first page
        return currentPage;

    }

    public List<T> firstPage(){

        return getPage(1);

    }

    public List<T> lastPage(){

        return getPage(pageNum);

    }

    public boolean hasNext(){

        if(currentPage < pageNum) return true;
        return false;

    }

    public boolean hasPrevious(){

        if(currentPage > 1) return true;
        return false;

    }


}
