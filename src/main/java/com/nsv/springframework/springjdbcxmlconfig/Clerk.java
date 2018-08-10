package com.nsv.springframework.springjdbcxmlconfig;

import java.util.Date;

public class Clerk {
    private String name;
    private String ssn;
    private Date joinedDate;
    private Date terminationDate;
    private boolean active;

    public Clerk() {
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Clerk(String name, String ssn, Date joinedDate, Date terminationDate, boolean active) {
        this.name = name;
        this.ssn = ssn;
        this.joinedDate = joinedDate;
        this.terminationDate = terminationDate;
        this.active=active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
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

    @Override
    public String toString() {
        return "Clerk{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", joinedDate=" + joinedDate +
                ", terminationDate=" + terminationDate +
                ", active=" + active +
                '}';
    }
}