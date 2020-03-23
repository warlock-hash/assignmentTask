package com.binarymagic.task.lecturers;

public class Lecturer {
    private String name;
    private Boolean inSession;
    private Boolean isLectureStarted;
    private Boolean isLecturerEntered;
    private Boolean isLecturerLeaved;

    public Lecturer() {
    }

    public Lecturer(String name, Boolean inSession,
                    Boolean isLectureStarted, Boolean isLecturerEntered,
                    Boolean isLecturerLeaved) {
        this.name = name;
        this.inSession = inSession;
        this.isLectureStarted = isLectureStarted;
        this.isLecturerEntered = isLecturerEntered;
        this.isLecturerLeaved = isLecturerLeaved;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getInSession() {
        return inSession;
    }

    public void setInSession(Boolean inSession) {
        this.inSession = inSession;
    }

    public Boolean getLectureStarted() {
        return isLectureStarted;
    }

    public void setLectureStarted(Boolean lectureStarted) {
        isLectureStarted = lectureStarted;
    }

    public Boolean getLecturerEntered() {
        return isLecturerEntered;
    }

    public void setLecturerEntered(Boolean lecturerEntered) {
        isLecturerEntered = lecturerEntered;
    }

    public Boolean getLecturerLeaved() {
        return isLecturerLeaved;
    }

    public void setLecturerLeaved(Boolean lecturerLeaved) {
        isLecturerLeaved = lecturerLeaved;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", inSession=" + inSession +
                ", isLectureStarted=" + isLectureStarted +
                ", isLecturerEntered=" + isLecturerEntered +
                ", isLecturerLeaved=" + isLecturerLeaved +
                '}';
    }
}
