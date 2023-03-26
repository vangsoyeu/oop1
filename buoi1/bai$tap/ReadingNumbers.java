package buoi1.bai$tap;

public class ReadingNumbers {
    public static void main(String[] args) {
        int number;
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Enter three-dugit number: ");
        number = inputNumber.nextInt();
        int x = number/100,y = number%100/10,u = number%100,z = number%10;
        String donvi,chuc,tram;

        // Truong hop 1 chu so
        if (number >= 0 && number <10){
            switch (number) {
                case 0:donvi = "zero"; break;
                case 1:donvi = "one"; break;
                case 2:donvi = "two";break;
                case 3:donvi = "three";break;
                case 4:donvi = "four";break;
                case 5:donvi = "five";break;
                case 6:donvi = "six";break;
                case 7:donvi = "seven";break;
                case 8:donvi = "eight";break;
                case 9:donvi = "nine";break;
                default: donvi = "out of ability";break;
            }
            System.out.println("Read number: "+ donvi);
        }
        
        // Truong hop trong khoang 10 den 20.
        if (number >= 10 && number <20){
          switch (z){
              case 0: chuc = "ten";break;
              case 1: chuc = "eleven";break;
              case 2: chuc = "twelve";break;
              case 3: chuc = "thirteen";break;
              case 4: chuc = "fourteen";break;
              case 5: chuc = "fifteen";break;
              case 6: chuc = "sixteen";break;
              case 7: chuc = "seventeen";break;
              case 8: chuc = "eighteen";break;
              case 9: chuc = "nineteen";break;
              default: chuc = "out of ability";break;
          }
            System.out.println("Read number: " + chuc);
        }
        //Truong hop 2 chu so (lon hon hoac bang 20 va nho hon 100)
        if (number >= 20 && number < 100){
            switch (z){
                case 0:donvi = ""; break;
                case 1:donvi = "one"; break;
                case 2:donvi = "two";break;
                case 3:donvi = "three";break;
                case 4:donvi = "four";break;
                case 5:donvi = "five";break;
                case 6:donvi = "six";break;
                case 7:donvi = "seven";break;
                case 8:donvi = "eight";break;
                case 9:donvi = "nine";break;
                default: donvi = ""; break;
            }

            switch (y) {
                case 2:chuc = "twenty";break;
                case 3:chuc = "thirty";break;
                case 4:chuc = "forty";break;
                case 5:chuc = "fifty";break;
                case 6:chuc = "sixty";break;
                case 7:chuc = "seventy";break;
                case 8:chuc = "eighty";break;
                case 9:chuc = "ninety";break;
                default: chuc = "";break;
            }
            System.out.println("Read number: " + chuc +" "+ donvi);
        }
        
        // Truong hop 3 chu so khong tu 100 den 1000.
        if (number >=100 && number <1000){
            switch (x) {
                case 1: tram = "one hundred";break;
                case 2: tram = "two hundred";break;
                case 3: tram = "three hundred";break;
                case 4: tram = "four hundred";break;
                case 5: tram = "five hundred";break;
                case 6: tram = "six hundred";break;
                case 7: tram = "seven hundred";break;
                case 8: tram = "eight hundred";break;
                case 9: tram = "nine hundred";break;
                default: tram = ""; break;
            }

            // Truong hop hang chuc khong khoang tu 10 den 20.
            if (u >= 10 && u < 20){
                switch (u) {
                    case 10: chuc = "ten";break;
                    case 11: chuc = "eleven";break;
                    case 12: chuc = "twelve";break;
                    case 13: chuc = "thirteen";break;
                    case 14: chuc = "fourteen";break;
                    case 15: chuc = "fifteen";break;
                    case 16: chuc = "sixteen";break;
                    case 17: chuc = "seventeen";break;
                    case 18: chuc = "eighteen";break;
                    case 19: chuc = "nineteen";break;
                    default: chuc = "";break;
                }
                System.out.println("Read number: " + tram + " " + chuc);
            }else {
                // Truowng hop hang chuc lon hon 20.
                switch (y) {
                    case 2: chuc = "twenty";break;
                    case 3: chuc = "thirty";break;
                    case 4: chuc = "forty";break;
                    case 5: chuc = "fifty";break;
                    case 6: chuc = "sixty";break;
                    case 7: chuc = "seventy";break;
                    case 8: chuc = "eighty";break;
                    case 9: chuc = "ninety";break;
                    default: chuc = "";break;
                }

                switch (z){
                    case 0:donvi = ""; break;
                    case 1:donvi = "one"; break;
                    case 2:donvi = "two";break;
                    case 3:donvi = "three";break;
                    case 4:donvi = "four";break;
                    case 5:donvi = "five";break;
                    case 6:donvi = "six";break;
                    case 7:donvi = "seven";break;
                    case 8:donvi = "eight";break;
                    case 9:donvi = "nine";break;
                    default: donvi = ""; break;
                }
                System.out.println("Read number: " + tram +" and " + chuc + " " + donvi);
            }
        }
        // GIoi han khong dc qua 1000.
        if (number > 1000){
            System.out.println("Can't read number.!!!!");
        }
    }
}
