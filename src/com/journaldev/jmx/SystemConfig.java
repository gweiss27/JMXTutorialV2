package com.journaldev.jmx;

/**
 * Created by gw186023 on 6/28/17.
 */
public class SystemConfig implements SystemConfigMBean {

    private int threadCount;
    private String schemaName;

    public SystemConfig(int threadCount, String schemaName) {
        this.threadCount = threadCount;
        this.schemaName = schemaName;
    }

    @Override
    public void setThreadCount(int noOfThreads) {
        this.threadCount = noOfThreads;
    }

    @Override
    public int getThreadCount() {
        return this.threadCount;
    }

    @Override
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    @Override
    public String getSchemaName() {
        return this.schemaName;
    }

    @Override
    public String doConfig() {
        return "No of Threads=" + getThreadCount() + " and DB Schema Name=" + getSchemaName();
    }
}
