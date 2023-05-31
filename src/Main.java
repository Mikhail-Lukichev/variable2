public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 50000;
        long longVar = 1000000;
        float floatVar = 1.5f;
        double doubleVar = 1.00000000005;
        System.out.println(byteVar + " " + shortVar + " " + intVar  + " " +longVar + " " +floatVar  + " " +doubleVar);

        float var1 = 27.12f;
        long var2 = 987678965549L;
        float var3 = 2.786f;
        short var4 = 569;
        short var5 = -159;
        int var6 = 27897;
        byte var7 = 67;
        System.out.println(var1 + " " + var2 + " " + var3  + " " + var4 + " " + var5  + " " + var6 + " " + var7);

        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short totalPaper = 480;
        int students = class1 + class2 + class3;
        float paperPerStudent = totalPaper / students;
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        byte bottlesPerMinute = 16 / 2;
        int minutes = 20;
        int hours = 0;
        int days = 0;
        int months = 0;
        int timePeriodMinutes = months*31*24*60 + days*24*60 + hours*60 + minutes;
        int bottlesPerPeriod = bottlesPerMinute * timePeriodMinutes;
        System.out.println("За " + months +" месяцев " + days + " дней " + hours + " часов " + minutes + " минут машина произвела " + bottlesPerPeriod + " штук бутылок");

        minutes = 0;
        hours = 0;
        days = 1;
        months = 0;
        timePeriodMinutes = months*31*24*60 + days*24*60 + hours*60 + minutes;
        bottlesPerPeriod = bottlesPerMinute * timePeriodMinutes;
        System.out.println("За " + months +" месяцев " + days + " дней " + hours + " часов " + minutes + " минут машина произвела " + bottlesPerPeriod + " штук бутылок");

        minutes = 0;
        hours = 0;
        days = 3;
        months = 0;
        timePeriodMinutes = months*31*24*60 + days*24*60 + hours*60 + minutes;
        bottlesPerPeriod = bottlesPerMinute * timePeriodMinutes;
        System.out.println("За " + months +" месяцев " + days + " дней " + hours + " часов " + minutes + " минут машина произвела " + bottlesPerPeriod + " штук бутылок");

        minutes = 0;
        hours = 0;
        days = 0;
        months = 1;
        timePeriodMinutes = months*31*24*60 + days*24*60 + hours*60 + minutes;
        bottlesPerPeriod = bottlesPerMinute * timePeriodMinutes;
        System.out.println("За " + months +" месяцев " + days + " дней " + hours + " часов " + minutes + " минут машина произвела " + bottlesPerPeriod + " штук бутылок");

        byte totalPaintCans = 120;
        byte whitePaintPerRoom = 2;
        byte brownPaintPerRoom = 4;
        int totalPaintPerRoom = whitePaintPerRoom + brownPaintPerRoom;
        int roomsNumber = totalPaintPerRoom / totalPaintPerRoom;
        int totalWhiteCans = roomsNumber * whitePaintPerRoom;
        int totalBrownCans = roomsNumber * brownPaintPerRoom;
        System.out.println("В школе, где " + roomsNumber + " классов, нужно "+ totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        byte bananaCount = 5;
        byte bananaWeight = 80;
        short milkVolume = 200;
        float milkWeightPerMl = (float) 105/100;
        byte iceCreamCount = 2;
        byte iceCreamWeight = 100;
        byte eggCount = 4;
        byte eggWeight = 70;
        float totalWeightGm = (float) (bananaCount * bananaWeight + milkVolume * milkWeightPerMl + iceCreamCount * iceCreamWeight + eggCount * eggWeight);
        float totalWeightKg = totalWeightGm / 1000;
        System.out.println("Total weight is " + totalWeightGm + "gm or " + totalWeightKg +"kg");

        short weightLossTarget = 7000;
        short weightLossSpeed1 = 250;
        short weightLossSpeed2 = 500;
        float weightLossDuration1 = (float) weightLossTarget / weightLossSpeed1;
        float weightLossDuration2 = (float) weightLossTarget / weightLossSpeed2;
        float weightLossDurationAverage = (weightLossDuration1 + weightLossDuration2) / 2;
        System.out.println("Период похудения по " + weightLossSpeed1 + "г в день составляет " + weightLossDuration1 +" дней. Период похудения по " + weightLossSpeed2 +"г в день составляет " + weightLossDuration2 + " дней. В среднем, похудение займет " + weightLossDurationAverage + " дней.");

        int empSalary1 = 67760;
        int empSalary2 = 83690;
        int empSalary3 = 76230;

        int empNewSalary1 = (int)(empSalary1 * 1.1);
        int empNewSalary2 = (int) (empSalary2 * 1.1);
        int empNewSalary3 = (int)(empSalary3 * 1.1);

        int yearlySalaryDifference1 = (int)(empNewSalary1*12 - empSalary1*12);
        int yearlySalaryDifference2 = (int)(empNewSalary2*12 - empSalary2*12);
        int yearlySalaryDifference3 = (int)(empNewSalary3*12 - empSalary3*12);

        System.out.println("Маша теперь получает " + empNewSalary1 + " рублей. Годовой доход вырос на "+ yearlySalaryDifference1 + " рублей");
        System.out.println("Денис теперь получает " + empNewSalary2 + " рублей. Годовой доход вырос на "+ yearlySalaryDifference2 + " рублей");
        System.out.println("Кристина теперь получает " + empNewSalary3 + " рублей. Годовой доход вырос на "+ yearlySalaryDifference3 + " рублей");

    }
}