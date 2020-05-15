package com.zubko.homework.hw_15;

import java.util.List;

public class PaginationHelper<I> {
    private int totalCount = 0;
    private int itemsPerPage = 0;

    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.totalCount = collection.size();
        this.itemsPerPage = itemsPerPage;
    }

    public int itemCount() {
        return totalCount;
    }

    public int pageCount() {
        return (totalCount - 1) / itemsPerPage + 1;
    }

    public int pageItemCount(int pageIndex) {
        int c = pageCount();
        if (pageIndex < 0 || pageIndex >= c) return -1;
        if (pageIndex == c - 1)
            return totalCount % itemsPerPage;
        else
            return itemsPerPage;
    }


    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= totalCount) return -1;
        return (itemIndex - 1) / itemsPerPage;
    }
}