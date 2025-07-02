package com.company;


class toy implements Runnable{
    int k =0;
    public void run(){
        while (k<10){
            System.out.println("gg");
            k++;
        }
    }
}
class eFootball implements Runnable{
    int i = 0;

    @Override
    public void run() {
        while (i < 10) {
            System.out.println("GG");
            i++;
        }
    }
}

public class new_on_github {
    public static void main(String[] args) {
        toy  k= new toy();
        Thread gg = new Thread(k);
        eFootball e= new eFootball();
        Thread ee = new Thread(e);
        gg.start();
        ee.start();
    }
}
