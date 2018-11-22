/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2017 Dell Inc. or its subsidiaries. All Rights Reserved.
 * %%
 * This software contains the intellectual property of Dell Inc. or is licensed
 * to Dell Inc. from third parties. Use of this software and the intellectual
 * property contained therein is expressly limited to the terms and conditions
 * of the License Agreement under which it is provided by or on behalf of Dell
 * Inc. or its subsidiaries.
 * #L%
 */
package com.mycomp.myproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
