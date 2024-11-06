package io.zipcoder;

import java.util.Scanner;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        int count =0;

        int i =0;
        while(selection!= playList[i]) {
            if (startIndex < playList.length - 1 && startIndex > 0 ) {
                startIndex++;
                count++;
            }
            i++;
        }

            if (startIndex == 0 && selection == playList[playList.length - i]) {
                System.out.println("Value at end of array: " + playList[playList.length - 1]);
                System.out.println("start index : " + startIndex);
                count++;
                startIndex = i;
            }

            if(startIndex > playList.length){
                System.out.println("End of the song list");
            }


            return count;
    }
}







