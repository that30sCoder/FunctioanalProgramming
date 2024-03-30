package org.example;

public class PrintThreads implements Runnable{

    private static final Object lock = new Object();
    private boolean even;

    private static int counter = 1;

    public PrintThreads(Boolean flag) {
        this.even = flag;

    }

            @Override
            public void  run() {


                    while (counter <= 10) {
                        synchronized (lock) {
                        if (counter % 2 == 0 && even
                            || (counter%2!=0 && !even)
                        ) {
                            System.out.println(Thread.currentThread().getName() + "Counter " + counter);
                            counter++;
                            lock.notify();
                        } else {
                            try {
                               lock.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }

                        }

                    }
                }
            }
        };

