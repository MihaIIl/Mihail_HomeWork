package immutableObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String streamNumber;
        String znoPoints;
        znoPoints = bufferedReader.readLine();
        streamNumber = bufferedReader.readLine();

        Stream stream1 = new Stream("071", 180);
        Student student1 = new Student("Mihail", 21, "Management", stream1 );

        System.out.println(student1.getStream().getPoints());
        stream1.incrementPoints();

        System.out.println(student1.getStream().getPoints());
        student1.getStream().incrementPoints();


        if(znoPoints.equals("071") || streamNumber.equals(180)){
            System.out.println(student1.getStream().getPoints());
        }
        else {
            System.out.println("Access is denied");
        }
    }
}

