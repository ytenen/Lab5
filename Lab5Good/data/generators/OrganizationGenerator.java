package data.generators;


import data.Address;
import data.Coordinates;
import data.Organization;
import data.OrganizationType;
import exeptions.WrongArgumentException;
import managers.Validator;


import java.util.Scanner;

public class OrganizationGenerator {

    public static Organization createOrganization(Long id) {
        System.out.println("Welcome to Organisation Builder.");

        String input, a, b;
        Coordinates coordinates;
        Address address;

        Scanner scanner = new Scanner(System.in);

        Organization organization;
        if (id == 0) {
            organization = new Organization();
        } else {
            organization = new Organization(id);
        }

        while (true) {
            try {
                System.out.print("Input name (String): ");
                input = scanner.nextLine();
                Validator.inputIsNotEmpty(input, "NAME");
                organization.setName(input);
                break;

            } catch (WrongArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Input x (Double) <265: ");
                input = scanner.nextLine();
                Validator.coordinateXIsOk(input);
                a = input;
                break;
            } catch (WrongArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Input y (Integer) > 0: ");
                input = scanner.nextLine();
                Validator.coordinateYIsOk(input);
                b = input;
                break;
            } catch (WrongArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        coordinates = new Coordinates(Integer.parseInt(a), Integer.parseInt(b));
        organization.setCoordinates(coordinates);

        while (true) {
            try {
                System.out.print("Input annualTurnover (Integer) > 0: ");
                input = scanner.nextLine();
                Validator.annualTurnoverIsOk(input);
                organization.setAnnualTurnover(Integer.parseInt(input));
                break;
            } catch (WrongArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Input fullName (String): ");
                input = scanner.nextLine();
                Validator.inputIsNotEmpty(input, "fullName");
                organization.setFullName(input);
                break;
            } catch (WrongArgumentException e) {
                System.out.println(e.getMessage());
            }
        }


        while (true) {
            try {
                System.out.print("Input OrganizationType (COMMERCIAL,PUBLIC,PRIVATE_LIMITED_COMPANY,OPEN_JOINT_STOCK_COMPANY): ");
                input = scanner.nextLine();
                Validator.typeIsOk(input);
                organization.setType(OrganizationType.valueOf(input));
                break;
            } catch (WrongArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Input zipCode (String): ");
                b = scanner.nextLine();
                Validator.inputIsNotEmpty(b, "zipCode");
                break;
            } catch (WrongArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        address= new Address(b);
        organization.setOfficialAddress(address);
        System.out.println("Generating ...");
        return organization;
    }
}