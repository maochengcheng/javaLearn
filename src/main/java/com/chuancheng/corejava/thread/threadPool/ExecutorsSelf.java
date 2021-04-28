package com.chuancheng.corejava.thread.threadPool;

import java.util.concurrent.*;

/**
 * @author maochengcheng
 * @date 2021/3/19 0019
 */
public class ExecutorsSelf  {

    public static ExecutorService newFixedThreadPool(int nThreads) {
        return new ThreadPoolSelf(nThreads, nThreads,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
    }
}
