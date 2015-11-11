package net.atos.project;

import java.util.Date;

public class PrePaidParkingTransaction
{
    CreditCardPayment creditCard = new CreditCardPayment();

    public double prepaidParking(Ticket tickets, Date timeNow)
    {

        double cost = 0;
        long diffHours = tickets.differentHours(timeNow);

        if (diffHours <= 0)
        {
            System.out.println("  Length of time stayed: " + diffHours);
            System.out.println("  TICKET PAID");
        }
        else
        {
            if (diffHours <= 1)
            {
                cost = 4.70;
                System.out.println("  Cost: �" + (cost - (cost / 10)));
            }
            else if (diffHours > 1 && diffHours <= 2)
            {
                cost = 7.40;
                System.out.println("  Cost: �" + (cost - (cost / 10)));
            }
            else if (diffHours >= 3 && diffHours <= 4)
            {
                cost = 10.30;
                System.out.println("  Cost: �" + (cost - (cost / 10)));
            }
            else if (diffHours >= 5 && diffHours <= 6)
            {
                cost = 14.80;
                System.out.println("  Cost: �" + (cost - (cost / 10)));
            }
            else if (diffHours >= 7 && diffHours <= 9)
            {
                cost = 17.80;
                System.out.println("  Cost: �" + (cost - (cost / 10)));
            }
            else if (diffHours >= 10 && diffHours <= 12)
            {
                cost = 20.20;
                System.out.println("  Cost: �" + (cost - (cost / 10)));
            }
            else if (diffHours >= 13 && diffHours <= 24)
            {
                cost = 23.70;
                System.out.println("  Cost: �" + (cost - (cost / 10)));
            }
            System.out.println("  Length of time stayed: " + diffHours);
            creditCard.creditCardDetails();
        }
        return cost;
    }

}
