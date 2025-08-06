package in.sb.mapandflatmap;

import java.util.List;

public class Module {
    private String title;
    private List<Topic> topics;

    public Module(String title, List<Topic> topics) {
        this.title = title;
        this.topics = topics;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    @Override
    public String toString() {
        return "Module{" +
                "title='" + title + '\'' +
                ", topics=" + topics +
                '}';
    }
}
