package net.atos.project;

import java.util.Date;

public class Ticket
{
    String regNum;

    Date arrivalTime;

    boolean prepaid;

    Date latestLeavingTime;

    double lengthOfTime;

    public Ticket(String regNum, Date arrivalTime, boolean prepaid, Date latestLeavingTime)
    {
        this.regNum = regNum;
        this.arrivalTime = arrivalTime;
        this.prepaid = prepaid;
        this.latestLeavingTime = latestLeavingTime;
    }

    public Ticket(String regNum, Date arrivalTime, boolean prepaid)
    {
        this.regNum = regNum;
        this.arrivalTime = arrivalTime;
        this.prepaid = prepaid;
        this.latestLeavingTime = arrivalTime;
    }

    public String getRegNum()
    {
        return regNum;
    }

    public long differentHours(Date timeNow)
    {
        long diffHours = (timeNow.getTime() - latestLeavingTime.getTime()) / (60 * 60 * 1000);
        return diffHours;
    }
}
