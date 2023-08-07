import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int minX = 50,minY = 50;
        int maxX = 0,maxY = 0;
        
        
        for(int i=0; i<wallpaper.length; i++){
            char[] ch = wallpaper[i].toCharArray();
            for(int j=0; j<ch.length; j++){              
                if(ch[j] == '#'){
                    minX = Math.min(minX, i);
                    minY = Math.min(minY,j);
                    maxX = Math.max(maxX, i+1);
                    maxY = Math.max(maxY, j+1);
                }
            }            
        }
        answer[0] = minX;
        answer[1] = minY;
        answer[2] = maxX;
        answer[3] = maxY;

        return answer;
    }
}