
public class Depreciation{
    public static void main(String[] args) {
        double initialPrice = 50000.0;
        double depreciationRate = 0.08; // 8% per year
        double currentPrice = initialPrice;
        int years = 0;

        // Depreciate annually until the value is less than 1
        while (currentPrice >= 1) {
            currentPrice *= (1 - depreciationRate);
            years++;
        }

        // Estimate remaining days from fractional year
        double lastYearValue = currentPrice / (1 - depreciationRate);
        double fractionalYear = Math.log(lastYearValue / initialPrice) / Math.log(1 - depreciationRate);
        int days = (int) ((fractionalYear - years) * 365);

        System.out.println("It will take approximately " + years + " years and " + days + " days for the value to depreciate to near zero.");

           }
   

        }
    
