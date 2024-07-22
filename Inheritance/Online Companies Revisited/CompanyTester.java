import java.util.*;

public class CompanyTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        ArrayList<Company> companies = new ArrayList<>();
        System.out.print("Please enter a company name, enter 'exit' to quit: ");
        String companyName = input.nextLine();
        if (companyName != "exit") {
            while (!companyName.equalsIgnoreCase("exit")) {
                System.out.print("Is this an online company, 'yes' or 'no': ");
                String isOnline = input.nextLine();
                if (isOnline.equalsIgnoreCase("yes")) {
                    System.out.print("Please enter the website address: ");
                    String webAddress = input.nextLine();
                    companies.add(new OnlineCompany(companyName, webAddress));
                } else {
                    System.out.print("Please enter the street adress: ");
                    String address = input.nextLine();
                    System.out.print("Please enter the city: ");
                    String city = input.nextLine();
                    System.out.print("Please enter the state: ");
                    String state = input.nextLine();
                    companies.add(new Company(companyName, address, city, state));
                }
                System.out.print("PLease enter a company name, enter 'exit' to quit: ");
                companyName = input.nextLine();
            }
            for (Company company : companies) {
                System.out.println(company.toString());
            }
        }
        
    }
}