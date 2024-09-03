package Prep.Lesson4.HomeTask1;

public class HomeTask4
{
    public static void main(String args[]) {
IsRunnable();
        IsRunnableUsingLambda();


    }

    private static void IsRunnableUsingLambda() {
        Runnable printNumbers=()-> {
                for(int i=1;i<=5;i++){
                    System.out.println(Thread.currentThread().getName()+" -  "+i);
                }

        };

        Thread thread2=new Thread(printNumbers);
        thread2.setName("WithLambda");
        thread2.start();
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" -  "+i);

        }


    }

    private static void IsRunnable() {
        Runnable printNumbers=new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=5;i++){
                    System.out.println(Thread.currentThread().getName()+" -  "+i);
                }
            }
        };

        Thread thread2=new Thread(printNumbers);
        thread2.setName("WithoutLambda");
        thread2.start();
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" -  "+i);

        }

    }
}
