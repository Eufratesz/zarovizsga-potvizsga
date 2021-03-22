//package hu.nive.ujratervezes.zarovizsga.people;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//
//public class People {
//
//
//    public int getNumberOfMales(String path) {
//
//        try (BufferedReader reader = Files.newBufferedReader(Path.of("people.csv"))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] parts = line.split(";");
//                int id = Integer.parseInt(parts[0]);
//                String firstName = parts[1];
//                String lastName = parts[2];
//                String email = parts[3];
//                String gender = parts[4];
//                String ipAddress = parts[5];
//
//                int count = 0;
//                for (String gender : parts) {
//                    if (gender.equals("Male")) {
//                        count++;
//                    }
//                    return count;
//                }
//            }
//
//        } catch (IOException ioe) {
//            throw new IllegalStateException("Can not read file", ioe);
//        }
//        return 0;
//    }
//
//    }
