package com.nsv.springframework.springjdbcxmlconfigduplicateforpractise;


import java.util.Date;

public class Clerk {
    private String ssn;
    private String name;
    private Date joinedDate;
    private Date terminationDate;
    private boolean active;

    public Clerk() {
    }

    public Clerk(String ssn, String name, Date joinedDate, Date terminationDate, boolean active) {
        this.ssn = ssn;
        this.name = name;
        this.joinedDate = joinedDate;
        this.terminationDate = terminationDate;
        this.active = active;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public Date getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(Date terminationDate) {
        this.terminationDate = terminationDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Clerk{" +
                "ssn='" + ssn + '\'' +
                ", name='" + name + '\'' +
                ", joinedDate=" + joinedDate +
                ", terminationDate=" + terminationDate +
                ", active=" + active +
                '}';
    }
}
