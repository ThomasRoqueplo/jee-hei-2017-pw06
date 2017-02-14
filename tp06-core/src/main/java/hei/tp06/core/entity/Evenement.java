package hei.tp06.core.entity;

import javax.persistence.Id;

/**
 * Created by Thomas on 14/02/2017.
 */


public class Evenement {

    @Id
    private long id;
    private long start;
    private long end;
    private String title;
    private String color;
    private String description;

    public Evenement() {
    }

    public Evenement(long id, long start, long end, String title, String color, String description) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.title = title;
        this.color = color;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Evenement{" +
                "id=" + id +
                ", start=" + start +
                ", end=" + end +
                ", title='" + title + '\'' +
                ", color='" + color + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
