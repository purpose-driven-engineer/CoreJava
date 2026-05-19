package com.progzilla;

import java.util.Scanner;

public class Processor {
    public void processTransaction(String status){
        // modern switch case expression
        String message = switch (status) {
            case "PENDING" -> "Transaction is awaiting verification";
            case "COMPLETED" -> "Funds have been transferred";
            case "FAILED", "CANCELLED" -> "Process terminated";
            default -> throw new IllegalArgumentException("Unknown status: " + status);
        };
        System.out.println(message);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter status (in CAPS): ");
        String statusInput = scanner.nextLine();

        Processor processor = new Processor();
        processor.processTransaction(statusInput);
    }
}
