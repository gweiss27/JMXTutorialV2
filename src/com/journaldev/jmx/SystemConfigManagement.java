package com.journaldev.jmx;

import javax.management.*;
import java.lang.management.ManagementFactory;

/**
 * Created by gw186023 on 6/28/17.
 */
public class SystemConfigManagement {
    private static final int DEFAULT_NO_THREADS=10;
    private static final String DEFAULT_SCHEMA="default";

    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, InterruptedException {

        // Get the MBeanServer
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

        // Register the MBean
        SystemConfig mBean = new SystemConfig(DEFAULT_NO_THREADS, DEFAULT_SCHEMA);
        ObjectName name = new ObjectName("com.journaldev.jmx:type=SystemConfig");
        mbs.registerMBean(mBean, name);

        do {
            Thread.sleep(3000);
            System.out.println("Thread Count="+mBean.getThreadCount()+":::Schema Name="+mBean.getSchemaName());
        } while (mBean.getThreadCount() != 0);

    }
}
