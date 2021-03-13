public class practice1 {
    public static void main(String[] args) {
        int n=7;
        double[]a=new double[7];
        for (int i = 0; i <n ; i++) {
            a[i] = Math.random();
            System.out.println(a[i]);

        }System.out.println("||||");

        double max;
        max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i <n ; i++) {
            if (a[i]>max){
            max=a[i];}

        }System.out.println("|||"+max+"||||");
        double sum=0.0;
        double average=0.0;
        for (int i = 0; i <n ; i++) {
            sum+=a[i];
            average=sum/n;

        }System.out.println(sum+"|||");
        System.out.println(average);
        for (int i = 0; i <n/2 ; i++) {
            double temp=a[i];
            a[i]=a[(int) (n-1-i)];
            a[(int) (n-1-i)]=temp;
            System.out.println(a[i]);
            double[]b=new double[n];
            for (int j = 0; j < n; j++) {
                b[i]=a[i];

            }
            System.out.println("+++++++"+b[i]);


        }




        }

    }


