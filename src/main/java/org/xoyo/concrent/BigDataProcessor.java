package org.xoyo.concrent;

import java.util.concurrent.CyclicBarrier;

/**
 * Class Description
 * Created at 2019-08-08
 *
 * @author hzyuxiaohua@corp.netease.com
 */
public class BigDataProcessor implements Runnable {

    /**
     * barrier
     */
    private CyclicBarrier barrier;

    private Double duration;

    private Exception exception;

    public CyclicBarrier getBarrier() {
        return barrier;
    }

    public void setBarrier(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public BigDataProcessor(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try{
            Double seconds = Math.random() * 10000L;
            System.out.println(Thread.currentThread().getName() + ":" + seconds);

            Thread.sleep(seconds.longValue());

            this.duration = seconds;
        }
        catch (Exception e) {
            this.exception = e;
        }
        finally{
            try{
                barrier.await();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
