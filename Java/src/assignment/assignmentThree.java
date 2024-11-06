package assignment;

import java.util.ArrayList;
import java.util.Scanner;

// WeatherAnalysis
public class assignmentThree {
    public static void main(String[] args) {
        ArrayList<DailyWeatherReport> weatherReports = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of days:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details for day " + (i + 1) + ":");
            System.out.println("Enter the day name:");
            String dayName = scanner.nextLine();
            System.out.println("Enter the least temperature:");
            double leastTemp = scanner.nextDouble();
            System.out.println("Enter the highest temperature:");
            double highestTemp = scanner.nextDouble();
            System.out.println("Enter the rainfall:");
            double rainfall = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Enter the sunrise time (HH:MM):");
            String sunriseTime = scanner.nextLine();
            System.out.println("Enter the sunset time (HH:MM):");
            String sunsetTime = scanner.nextLine();

            weatherReports.add(new DailyWeatherReport(dayName, leastTemp, highestTemp, rainfall, sunriseTime, sunsetTime));
        }

        DailyWeatherReport hottestDay = weatherReports.getFirst(); //get(0);
        DailyWeatherReport coldestDay = weatherReports.getFirst();
        DailyWeatherReport highestRainfallDay = weatherReports.getFirst();
        DailyWeatherReport longestDaytimeDay = weatherReports.getFirst();
        DailyWeatherReport earliestSunriseDay = weatherReports.getFirst();
        DailyWeatherReport lateSunriseDay = weatherReports.getFirst();
        DailyWeatherReport earliestSunsetDay = weatherReports.getFirst();
        DailyWeatherReport lateSunsetDay = weatherReports.getFirst();
        for (DailyWeatherReport report : weatherReports) {
            if (report.highestTemp > hottestDay.highestTemp) {
                hottestDay = report;
            }
            if (report.leastTemp < coldestDay.leastTemp) {
                coldestDay = report;
            }
            if (report.rainfall > highestRainfallDay.rainfall) {
                highestRainfallDay = report;
            }
            if (report.getDaytimeDuration() > longestDaytimeDay.getDaytimeDuration()) {
                longestDaytimeDay = report;
            }

        }

        System.out.println("Hottest day: " + hottestDay.dayName );
        System.out.println("Coldest day: " + coldestDay.dayName);
        System.out.println("Highest rainfall day: " + highestRainfallDay.dayName);
        System.out.println("Longest daytime day: " + longestDaytimeDay.dayName);

        scanner.close();
    }
}

class DailyWeatherReport {
    String dayName;
    double leastTemp;
    double highestTemp;
    double rainfall;
    String sunriseTime;
    String sunsetTime;


    public DailyWeatherReport(String dayName, double leastTemp, double highestTemp, double rainfall, String sunriseTime, String sunsetTime) {
        this.dayName = dayName;
        this.leastTemp = leastTemp;
        this.highestTemp = highestTemp;
        this.rainfall = rainfall;
        this.sunriseTime = sunriseTime;
        this.sunsetTime = sunsetTime;
    }

    public int getDaytimeDuration() {
        String[] sunrise = sunriseTime.split(":");
        String[] sunset = sunsetTime.split(":");
        int sunriseHour = Integer.parseInt(sunrise[0]);
        int sunriseMinute = Integer.parseInt(sunrise[1]);
        int sunsetHour = Integer.parseInt(sunset[0]);
        int sunsetMinute = Integer.parseInt(sunset[1]);
        return (sunsetHour * 60 + sunsetMinute) - (sunriseHour * 60 + sunriseMinute);
    }
}
