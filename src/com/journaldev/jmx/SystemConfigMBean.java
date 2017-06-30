package com.journaldev.jmx;

/**
 * Created by gw186023 on 6/28/17.
 */
public interface SystemConfigMBean {

    public void setThreadCount(int noOfThreads);
    public int getThreadCount();

    public void setSchemaName(String schemaName);
    public String getSchemaName();

    // any method starting with get and set are considered as attribute getter and setter methods, so I am
    // using do* for this operation
    public String doConfig();

}
