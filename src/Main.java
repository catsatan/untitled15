public class Main {
    public static void main(String[] args) {
        int i =0;
        while ( i <10)
        {
            i=i+1;
            System.out.print( i + " " );
        }
        System.out.println("\n");
        int n=11;
        for (int m = 0; m <10; m++){
            n=n-1;
            System.out.print (  n +" ");
        }

        for (int friday = 5 ; friday<32; friday= friday+7) {

            System.out.println("сегодня пятница " + friday + " -е число.Нужно подготовить отчет");
        }

        int a= 1822;
        int b =2122;
        for (int u = 0; u <= 2121; u = u + 79) {
            if (u>a && u<b){
                System.out.println("пролет кометы " + u);
            }
        }
        }
    }