package com.clouway.crm.core;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class PageBean<T> {

    private List<T> list;

    private int pageSize;
    private int pageNum = 0;
    private int currentPage = 0;

    /**
     * Constructs a PageBean instance with a given list
     *
     * @param constructList list to clone in the instance
     * @param pageSize the size of every page
     */
    public PageBean(ArrayList<T> constructList, int pageSize){
        this.pageSize = pageSize;
        list = (List<T>)constructList.clone();
        pageNum = list.size() / pageSize;
        if(list.size() % pageSize != 0){
            pageNum++;
        }
    }

    /**
     * Returns a page based on the given index
     *
     * @param pageIndex the given index for the page
     * @return the page
     */
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


    /**
     * Calls and returns the next page
     *
     * @return the next page
     */
    public List<T> next(){

        return getPage(currentPage + 1);

    }

    /**
     * Calls and returns the previous page
     *
     * @return the previous page
     */
    public List<T> previous(){

        return getPage(currentPage - 1);

    }

    /**
     * Returns the index of the current page
     *
     * @return the index of the current page
     */
    public int getCurrentPage(){

        if(currentPage == 0) currentPage++; // make sure we always are on the first page
        return currentPage;

    }

    /**
     * Calls and returns the first page
     *
     * @return the first page
     */
    public List<T> firstPage(){

        return getPage(1);

    }

    /**
     * Calls and returns the last page
     *
     * @return the last page
     */
    public List<T> lastPage(){

        return getPage(pageNum);

    }


    /**
     * Check whether or not a next page exists
     *
     * @return
     */
    public boolean hasNext(){

        if(currentPage < pageNum) return true;
        return false;

    }

    /**
     * Checks whether or not a previous page exists
     *
     * @return
     */
    public boolean hasPrevious(){

        if(currentPage > 1) return true;
        return false;

    }


}
