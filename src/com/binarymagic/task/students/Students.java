package com.binarymagic.task.students;

public class Students {

    private Boolean isStudentEntered;
    private Boolean isStudentSitDowned;

    public Students() {
    }

    public Students(Boolean isStudentEntered,
                    Boolean isStudentSitDowned) {
        this.isStudentEntered = isStudentEntered;
        this.isStudentSitDowned = isStudentSitDowned;
    }

    public Boolean getStudentEntered() {
        return isStudentEntered;
    }

    public void setStudentEntered(Boolean studentEntered) {
        isStudentEntered = studentEntered;
    }

    public void setStudentEntered(){
        this.isStudentEntered = true;
    }

    public Boolean getStudentSitDowned() {
        return isStudentSitDowned;
    }

    public void setStudentSitDowned(Boolean studentSitDowned) {
        isStudentSitDowned = studentSitDowned;
    }

    public void setStudentSitDowned() {
        isStudentSitDowned = true;
    }

    public void setStudentsLeave(){
        this.isStudentSitDowned = false;
        this.isStudentEntered = false;
    }

    @Override
    public String toString() {
        return "Students{" +
                "isStudentEntered=" + isStudentEntered +
                ", isStudentSitDowned=" + isStudentSitDowned +
                '}';
    }
}
