package Week1.교점에별만들기;
import java.util.*;

class Intersection {
	long x;
	long y;
	Intersection(long x, long y) {
		this.x = x;
		this.y = y;
	}
}


class 교점에별만들기_김현지 {
    
    private static int[][] lines;
    private static List<Intersection> uniqueIntersections;
    private static long minX, minY, maxX, maxY;
    private static long a, b, c, d, e, f;
    
    public String[] solution(int[][] line) {
        lines = line;
        int numLines = lines.length;
    
        lineCombination(numLines);
        getMinMaxCoordinate();
        String[] answer = getMinSquare();
        return answer;
    }
    
    private static String[] getMinSquare() {
        int xLen = (int)(maxX - minX);
        int yLen = (int)(maxY - minY);

        char[][] charAnswer = new char[yLen+1][xLen+1];
        int numUniqueIntersections = uniqueIntersections.size();
        long x, y;

        
        for (int i = 0; i <= yLen; i++) {
            for (int j = 0; j <= xLen; j++) {
                charAnswer[i][j] = '.';
            }
        }

        
        for (int i = 0; i < numUniqueIntersections; i++) {
            x = uniqueIntersections.get(i).x;
            y = uniqueIntersections.get(i).y;
            charAnswer[(int)(maxY-y)][(int)(x-minX)] = '*';

        }
        
        String strVal;
        String[] answer = new String[yLen+1];
        for (int i = 0; i <= yLen; i++) {
            strVal = String.valueOf(charAnswer[i]);
            answer[i] = strVal;
        }
        return answer;
    }
    
    private static void getMinMaxCoordinate() {
        int numLines = uniqueIntersections.size();
        
        minX = uniqueIntersections.get(0).x;
        minY = uniqueIntersections.get(0).y;
        maxX = uniqueIntersections.get(0).x;
        maxY = uniqueIntersections.get(0).y;
        
        
        for (int i = 0; i < numLines; i++) {

            long nextX = uniqueIntersections.get(i).x;
            long nextY = uniqueIntersections.get(i).y;
            
            if (nextX < minX) {
                minX = nextX;
            } 
            if (nextY < minY) {
                minY = nextY;
            } 
            if (nextX > maxX) {
                maxX = nextX;
            } 
            if (nextY > maxY) {
                maxY = nextY;
            }
        }
    }
    
    private static void lineCombination(int numLines) {
        long[] intersection = new long[2];
        Intersection intIntersection;
        uniqueIntersections = new ArrayList<>();
        
        for (int i = 0; i < numLines; i++) {
            for (int j = i+1; j < numLines; j++) {
                intersection = calculateIntersection(lines[i], lines[j]);

                
                if (intersection != null) {
                    intIntersection = new Intersection(intersection[0], intersection[1]);
                    uniqueIntersections.add(intIntersection);
                }
            }
        }
    }
    
    private static long[] calculateIntersection(int[] l1, int[] l2) {
        a = l1[0];
        b = l1[1];
        c = l2[0];
        d = l2[1];
        e = l1[2];
        f = l2[2];
        
        long discriminant = a * d - b * c;
        long[] intersection = new long[2];
        
        if (discriminant == 0) {
            return null;
        }
        
        double x = (double)(b * f - e * d)/discriminant;
        double y = (double)(e * c - a * f)/discriminant;
        
        if (!isInteger(x) || !isInteger(y)) {
            return null;
        }
        
        intersection[0] = (long)x;
        intersection[1] = (long)y;
        
        
        return intersection;
    }
    
    private static boolean isInteger(double num) {
        
        return num == Math.floor(num) && num == Math.ceil(num);
    }
}