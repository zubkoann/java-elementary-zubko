package com.zubko.homework.hw_15;

import java.util.ArrayList;

/**
 * For this exercise you will be strengthening your page-fu mastery. You will complete the PaginationHelper class,
 * which is a utility class helpful for querying paging information related to an array.
 * <p>
 * The class is designed to take in an array of values and an integer indicating how many items will be allowed per each
 * page. The types of values contained within the collection/array are not relevant.
 * <p>
 * The following are some examples of how this class is used:
 * <p>
 * PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
 * helper.pageCount(); //should == 2
 * helper.itemCount(); //should == 6
 * helper.pageItemCount(0); //should == 4
 * helper.pageItemCount(1); // last page - should == 2
 * helper.pageItemCount(2); // should == -1 since the page is invalid
 * <p>
 * // pageIndex takes an item index and returns the page that it belongs on
 * helper.pageIndex(5); //should == 1 (zero based index)
 * helper.pageIndex(2); //should == 0
 * helper.pageIndex(20); //should == -1
 * helper.pageIndex(-10); //should == -1
 */


public class TestApp {
    public static void main(String args[]) {
        ArrayList<Character> array = new ArrayList<>();
        array.add('a');
        array.add('b');
        array.add('c');
        array.add('d');
        array.add('e');
        array.add('f');
        array.add('g');
        array.add('h');
        PaginationHelper<Character> helper = new PaginationHelper(array, 3);
        System.out.println(helper.pageCount());
        System.out.println(helper.itemCount());
        System.out.println(helper.pageItemCount(0));
        System.out.println(helper.pageItemCount(1));
        System.out.println(helper.pageItemCount(2));

        System.out.println(helper.pageIndex(5));
        System.out.println(helper.pageIndex(2));
        System.out.println(helper.pageIndex(20));
        System.out.println(helper.pageIndex(-10));
    }
}
