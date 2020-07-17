import java.util.ArrayList;
import java.util.Date;

public class StudyTool {
    public static void main(String[] args) {

        ArrayList<StudyTopic> topicList = new ArrayList<>();
        topicList.add(new StudyTopic(1,"Front-End", new Date()));
        System.out.println(topicList.get(0).toString());
        
    }
    
}